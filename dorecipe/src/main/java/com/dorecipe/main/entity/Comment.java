package com.dorecipe.main.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.CreatedDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data // equals, hashCode 구현 (Lombok의 @Data 어노테이션 추가로 자동 생성)
@Getter
@Setter
@Entity
@NoArgsConstructor // 디폴트 생성자가 존재 (Lombok의 @NoArgsConstructor 어노테이션 추가로 자동 생성)
@AllArgsConstructor
@IdClass(Comment_Id.class) // 복합키 사용
@Table(name="comment")
public class Comment implements Serializable {
	
	@Id
	@JoinColumn(name = "recipe_num")
	private String recipe_num;
	//private Recipe recipe;
	
	@Id
	private int comment_num;
	
	@NotBlank(message = "내용을 입력해 주세요.") // null, "", " " 불가능
	private String comment_content;
	
	@Column(length = 100)
	private String comment_path;
	
	@ManyToOne
	@JoinColumn(name = "member_id")
	private Member member;
	//private String member_id;
	
	@CreatedDate
	private LocalDateTime comment_creDate;
	
}
