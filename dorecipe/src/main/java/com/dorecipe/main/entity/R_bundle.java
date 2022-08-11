package com.dorecipe.main.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@IdClass(R_bundle.class)
@Table(name="r_bundle")
public class R_bundle {
	
	@Id
	@ManyToOne(cascade = CascadeType.REMOVE) //레시피번호 하나에 여러개의 번들
	@Column(name="recipe_num")
	private int recipe_num;
	
	@Id
	//@OneToMany(mappedBy="r_bundle",cascade = CascadeType.REMOVE)
	@Column(name="bundle_num")
	private int bundle_num;
	
	@Column(length=40)
	private String bundle;
	
	
}
