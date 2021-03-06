package com.cloudage.membercenter.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;

import com.cloudage.membercenter.util.DateRecord;
import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class GroupItem extends DateRecord {

	User author;   //�û�
	String text;  //����
	String avatar; //����ͼƬ
	@ManyToOne(optional=false)
	@JsonIgnore
	public User getAuthor() {
		return author;
	}
	public void setAuthor(User author) {
		this.author = author;
	}
	@Transient
	public String getAuthorName(){
		return author.name;
	}
	@Transient
	public String getAuthorAvatar(){
		return author.avatar;
	}
	@Transient
	public Integer getAuthorId(){
		return author.getId();
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	@Column(nullable=true)
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
	public void addAvatar(String add){
		this.avatar = this.avatar +add ;
	}
	
}
