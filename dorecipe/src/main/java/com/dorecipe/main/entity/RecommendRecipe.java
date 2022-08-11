package com.dorecipe.main.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="recommendrecipe")
public class RecommendRecipe {

//	private Member member_id
	
	@JoinColumn(name="recipe_num")
	private Long recipe_num;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reco_num;
	
	private LocalDateTime reco_creDate;
	
}
