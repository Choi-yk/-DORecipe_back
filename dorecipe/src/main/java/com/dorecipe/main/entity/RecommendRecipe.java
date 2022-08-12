package com.dorecipe.main.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="recommendrecipe")
public class RecommendRecipe {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "reco_num")
	private int reco_num;
	
	private LocalDateTime reco_creDate;

	@ManyToOne
	@JoinColumn(name = "member_id")
	private Member member_id;
	
	@ManyToOne
	@JoinColumn(name = "recipe_num")
	private Recipe recipe_num;
	
}
