package com.dorecipe.main.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="knowhow")
@Getter
@Setter
public class Knowhow {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long know_num;
	
	@ManyToOne
	@JoinColumn(name = "member_id")
	private Member member;
	
	@Column(length = 100)
	private String know_title;
	
	@Column(columnDefinition = "TEXT")
	private String know_content;
	
	private LocalDateTime know_creDate;
	
	@Column(length = 100)
	private String know_path;
	
	
}
