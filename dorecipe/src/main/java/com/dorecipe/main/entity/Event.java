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
@Table(name="event")
@Getter
@Setter
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int event_num;
	
	@ManyToOne
	@JoinColumn(name = "member_id")
	private Member member; 
	
	@Column(length = 100)
	private String event_title;
	
	@Column(columnDefinition = "TEXT")
	private String event_content;
	
	@Column(length = 100)
	private String event_path;
	
	private LocalDateTime event_creDate;
	
	private LocalDateTime event_finDate;
	
}
