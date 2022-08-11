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
	int recipe_num;
	
	String recipe_title;
	
	int recipe_savetype;
	
	String recipe_introduce;
	
	String recipe_url;
	
	String recipe_rpath;
	
	String recipe_tag;
	
	String category_kind;
	
	String category_theme;
	
	String category_way;
	
	String category_ing;

	 // 요리 정보
	String information_person;
	
	String infotmaion_time;
	
	String infotmaion_level;
	
	// 요리 완성
	String completion_path1;
	
	String completion_path2;
	
	String completion_path3;
	
	String completion_path4;
	
	String completion_tip;
	
	LocalDateTime recipe_creDate;
	
	String member_id;
}
