package com.dorecipe.main.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@IdClass(B_ingredient_id.class)
@Table(name="b_ingredient")
public class B_ingredient {
	
	@Id
	@JoinColumn(name="recipe_num")
	private int recipe_num;
	
	@Id
	@JoinColumn(name="bundle_num")
	private int bundle_num;
	
	@Id
	@Column(name="ing_num")
	private int ing_num;
	
	@Column(length=40)
	private String ing_ingredient;
	
	@Column(length=40)
	private String ing_amount;
	
	
}
