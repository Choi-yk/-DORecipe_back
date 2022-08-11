package com.dorecipe.main.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;

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
	
	@NotBlank(message = "제목을 입력해 주세요.") // null, "", " " 불가능
	@Column(length = 100)
	private String recipe_title;
	
	private int recipe_savetype;
	
	@Column(length = 200)
	private String recipe_introduce;
	
	@Column(length = 40)
	private String recipe_url;
	
	@Column(length = 40)
	private String recipe_rpath;
	
	@Column(length = 100)
	private String recipe_tag;
	
	// 카테고리
	@Column(length = 20)
	private String category_kind;
	
	@Column(length = 20)
	private String category_theme;
	
	@Column(length = 20)
	private String category_way;
	
	@Column(length = 200)
	private String category_ing;

	 // 요리 정보
	@Column(length = 10)
	private String information_person;
	
	@Column(length = 10)
	private String infotmaion_time;
	
	@Column(length = 10)
	private String infotmaion_level;
	
	// 요리 완성
	@Column(length = 100)
	private String completion_path1;
	
	@Column(length = 100)
	private String completion_path2;
	
	@Column(length = 100)
	private String completion_path3;
	
	@Column(length = 100)
	private String completion_path4;
	
	@Column(length = 100)
	private String completion_tip;
	
	@CreatedDate
	private LocalDateTime recipe_creDate;
	
	@JoinColumn(name = "member_id")
	private Member member;
}