package com.example.demo.model;

public class ParentVo {
	private long id;
	private String prtName;
	private String prtAddress;
	private String prtMobileNo;
	private int prtAge;
	private StudentVo student;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPrtName() {
		return prtName;
	}

	public void setPrtName(String prtName) {
		this.prtName = prtName;
	}

	public String getPrtAddress() {
		return prtAddress;
	}

	public void setPrtAddress(String prtAddress) {
		this.prtAddress = prtAddress;
	}

	public String getPrtMobileNo() {
		return prtMobileNo;
	}

	public void setPrtMobileNo(String prtMobileNo) {
		this.prtMobileNo = prtMobileNo;
	}

	public int getPrtAge() {
		return prtAge;
	}

	public void setPrtAge(int prtAge) {
		this.prtAge = prtAge;
	}

	public StudentVo getStudent() {
		return student;
	}

	public void setStudent(StudentVo student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "ParentVo [id=" + id + ", prtName=" + prtName + ", prtAddress=" + prtAddress + ", prtMobileNo="
				+ prtMobileNo + ", prtAge=" + prtAge + ", student=" + student + "]";
	}


}
