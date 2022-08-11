package com.dorecipe.main.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
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
@IdClass(Order_Id.class) // 복합키 사용
@Table(name="r_order")
public class R_order {
	
	@Id
	int recipe_num;
	
	@Id
	int order_num;
	
	String order_explain;
	
	String order_path;
}
