package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
//@Embeddable
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "stdname")
	private String stdName;
	@Column(name = "stdmob")
	private String stdMobileNo;
	@Column(name = "stdcour")
	private String stdCourse;
	@Column(name = "stdfee")
	private double stdFee;
	/*
	 * @OneToOne(mappedBy = "student")
	 * 
	 * private Parent parent;
	 */


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getStdMobileNo() {
		return stdMobileNo;
	}

	public void setStdMobileNo(String stdMobileNo) {
		this.stdMobileNo = stdMobileNo;
	}

	public String getStdCourse() {
		return stdCourse;
	}

	public void setStdCourse(String stdCourse) {
		this.stdCourse = stdCourse;
	}

	public double getStdFee() {
		return stdFee;
	}

	public void setStdFee(double stdFee) {
		this.stdFee = stdFee;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stdName=" + stdName + ", stdMobileNo=" + stdMobileNo + ", stdCourse="
				+ stdCourse + ", stdFee=" + stdFee + "]";
	}

	/*
	 * public Parent getParent() { return parent; }
	 * 
	 * public void setParent(Parent parent) { this.parent = parent; }
	 */

	/*
	 * @Override public String toString() { return "Student [id=" + id +
	 * ", stdName=" + stdName + ", stdMobileNo=" + stdMobileNo + ", stdCourse=" +
	 * stdCourse + ", stdFee=" + stdFee + ", parent=" + parent + "]"; }
	 */


}
