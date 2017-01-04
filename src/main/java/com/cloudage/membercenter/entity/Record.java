package com.cloudage.membercenter.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;

import com.cloudage.membercenter.util.BaseEntity;

@Entity
public class Record extends BaseEntity{

	User user;//�����û�
	String record_type;//��������
	Date createDate;//����ʱ��
	String text;//��ע
	int record_cash;//���׽��
	int my_cash;//�ҵ����

	
	
	public int getMy_cash() {
		return my_cash;
	}

	public void setMy_cash(int my_cash) {
		this.my_cash = my_cash;
	}

	@ManyToOne(optional=false)
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRecord_type() {
		return record_type;
	}

	public void setRecord_type(String record_type) {
		this.record_type = record_type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getRecord_cash() {
		return record_cash;
	}

	public void setRecord_cash(int record_cash) {
		this.record_cash = record_cash;
	}

	@Column(updatable=false)
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@PrePersist
	void onPrePersist() {
		createDate = new Date();
	}
}