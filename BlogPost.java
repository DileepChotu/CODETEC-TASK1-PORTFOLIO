package com.task1.Entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//BlogPost.java
@Data
@Entity
@Table(name = "TASK1_BLOGPOST_1")
public class BlogPost {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 @Column(length = 20)
 private Long id;
 @Column(length = 20)
 private String title;
 @Column(length = 20)
 private String content;
 @Column(length = 20)
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
