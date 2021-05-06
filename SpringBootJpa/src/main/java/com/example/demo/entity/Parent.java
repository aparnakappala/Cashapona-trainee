package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "prt_tab")
@PrimaryKeyJoinColumn(name = "stu_id")
@SecondaryTable(name = "std_tab", pkJoinColumns = @PrimaryKeyJoinColumn(name = "stu_id", referencedColumnName = "id"))
public class Parent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "prtname")
	private String prtName;
	@Column(name = "prtaddr")
	private String prtAddress;
	@Column(name = "prtmob")
	private String prtMobileNo;
	@Column(name = "prtage")
	private int prtAge;
	/*
	 * @OneToOne(cascade = CascadeType.ALL)
	 * 
	 * @JoinColumn(name = "stu_id", referencedColumnName = "id")
	 */
	// @Column(table = "std_tab")
	private Student student;

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

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Parent [id=" + id + ", prtName=" + prtName + ", prtAddress=" + prtAddress + ", prtMobileNo="
				+ prtMobileNo + ", prtAge=" + prtAge + ", student=" + student + "]";
	}

}
