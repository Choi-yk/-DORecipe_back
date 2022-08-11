package com.dorecipe.main.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="notice")
@Getter
@Setter
public class Notice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long notice_num;
	
//	@ManyToOne
//	Member member_id;
	
	@Column(length = 100)
	private String notice_title;
	
	@Column(columnDefinition = "TEXT")
	private String notice_content;
	
	LocalDateTime notice_creDate;
	
}
