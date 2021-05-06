package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "customer", uniqueConstraints = { @UniqueConstraint(columnNames = { "phone" }) })
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", columnDefinition = "int")
	private int id;

	@Column(name = "name", columnDefinition = "VARCHAR(255)")
	private String name;

	@Column(name = "phone", columnDefinition = "VARCHAR(15)")
	private String phone;

	@Column(name = "registered", columnDefinition = "DATETIME")
	private String registered;



	public Customer() {
	}

	public Customer(String name, String phone, String registered) {
		this.name = name;
		this.phone = phone;
		this.registered = registered;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRegistered() {
		return registered;
	}

	public void setRegistered(String registered) {
		this.registered = registered;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", registered=" + registered + "]";
	}

}
