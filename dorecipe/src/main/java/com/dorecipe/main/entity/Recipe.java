package com.dorecipe.main.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="recipe")
public class Recipe {
	
	// 레시피
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int recipe_num;
	
	private String recipe_title;
	
	private int recipe_savetype;
	
	private String recipe_introduce;
	
	private String recipe_url;
	
	private String recipe_rpath;
	
	private String recipe_tag;
	
	// 카테고리
	private String category_kind;
	
	private String category_theme;
	
	private String category_way;
	
	private String category_ing;

	 // 요리 정보
	private String information_person;
	
	private String infotmaion_time;
	
	private String infotmaion_level;
	
	// 요리 완성
	private String completion_path1;
	
	private String completion_path2;
	
	private String completion_path3;
	
	private String completion_path4;
	
	private String completion_tip;
	
	private LocalDateTime recipe_creDate;
	
	
	
	String member_id;
}
