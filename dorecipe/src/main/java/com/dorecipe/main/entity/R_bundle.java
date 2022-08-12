package com.dorecipe.main.entity;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
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
@IdClass(R_bundle_Id.class)
@Table(name="r_bundle")
public class R_bundle {
	
	@Id
	@JoinColumn(name = "recipe_num")
	private String recipe_num;
	
	@Id
	@Column(name="bundle_num")
	private int bundle_num;
	
	@Column(length=40)
	private String bundle;
	
	
}
