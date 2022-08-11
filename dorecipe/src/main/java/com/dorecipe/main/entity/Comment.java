package com.dorecipe.main.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@IdClass(Comment_Id.class) // 복합키 사용
@Table(name="comment")
public class Comment implements Serializable {
	
	@Id
	private int recipe_num;
	
	@Id
	private int comment_num;
	
	private String comment_path;
	
	private int member_id;
	
	@CreatedDate
	private LocalDateTime comment_creDate;
}
