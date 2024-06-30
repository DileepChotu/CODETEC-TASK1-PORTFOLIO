package com.task1.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Table(name = "TASK1_PROJECT_1")
@Data
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   // @Column(length  = 30)
    //private String id;
  @Column(length  = 30)
    
    private long id;
    @Column(length  = 30)
    private String title;
    @Column(length  = 30)
    private String description;
    @Column(length  = 100)
    private String url;
    
    // Getters and Setters
    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	

   
}