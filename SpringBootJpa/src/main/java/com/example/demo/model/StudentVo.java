package com.example.demo.model;

public class StudentVo {
	private long id;
	private String stdName;
	private String stdMobileNo;
	private String stdCourse;
	private double stdFee;
	private ParentVo parent;

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

	public ParentVo getParent() {
		return parent;
	}

	public void setParent(ParentVo parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "StudentVo [id=" + id + ", stdName=" + stdName + ", stdMobileNo=" + stdMobileNo + ", stdCourse="
				+ stdCourse + ", stdFee=" + stdFee + ", parent=" + parent + "]";
	}


}
