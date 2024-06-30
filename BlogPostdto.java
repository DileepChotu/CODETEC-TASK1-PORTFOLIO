package com.task1.dto;

import java.sql.Date;

import lombok.Data;
@Data
public class BlogPostdto {
	private Long id;
	 private String title;
	 private String content;
	 private Date date;

	 // Getters and Setters

	 public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
