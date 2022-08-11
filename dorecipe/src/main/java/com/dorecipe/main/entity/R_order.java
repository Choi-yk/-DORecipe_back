package com.dorecipe.main.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

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
@IdClass(Order_Id.class) // 복합키 사용
@Table(name="r_order")
public class R_order implements Serializable {
	
	@Id
	@JoinColumn(name = "recipe_num")
	private String recipe_num;
	//private Recipe recipe;
	
	@Id
	int order_num;
	
	@Column(length = 200)
	String order_explain;
	
	@Column(length = 100)
	String order_path;
}
