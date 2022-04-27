package com.sv.modelos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name="data_repository" , catalog="db_develop", schema="")
public class User {

	@Id
	@Column
	private Integer id;
	@Column 
	private String repo_name;
	@Column 
	private String full_name;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT-3")
	@Column
    private Date created;
	@Column 
	private String language;
	@Column 
	private String type;
	@Column 
	private String username;
	@Column 
	private Integer stars;
	@Column 
	private Integer forks;
	@Column 
	private Integer subscribers;
	@Column 
	private Integer open_issues;
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getRepo_name() {
		return repo_name;
	}
	public void setRepo_name(String repo_name) {
		this.repo_name = repo_name;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Integer getStars() {
		return stars;
	}
	public void setStars(Integer stars) {
		this.stars = stars;
	}
	public Integer getForks() {
		return forks;
	}
	public void setForks(Integer forks) {
		this.forks = forks;
	}
	public Integer getSubscribers() {
		return subscribers;
	}
	public void setSubscribers(Integer subscribers) {
		this.subscribers = subscribers;
	}
	public Integer getOpen_issues() {
		return open_issues;
	}
	public void setOpen_issues(Integer open_issues) {
		this.open_issues = open_issues;
	}
	
	
	
	
}