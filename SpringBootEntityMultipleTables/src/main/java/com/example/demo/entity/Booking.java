package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookings")
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", columnDefinition = "int")
	private int id;

	@Column(name = "book_id", columnDefinition = "int")
	private int bookId;

	@Column(name = "customer_id", columnDefinition = "int")
	private int customerId;

	@Column(name = "issue_date", columnDefinition = "DATETIME")
	private String issueDate;

	@Column(name = "return_date", columnDefinition = "DATETIME")
	private String returnDate;

	public Booking() {
	}

	public Booking(int bookId, int customerId, String issueDate) {
		this.bookId = bookId;
		this.customerId = customerId;
		this.issueDate = issueDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", bookId=" + bookId + ", customerId=" + customerId + ", issueDate=" + issueDate
				+ ", returnDate=" + returnDate + "]";
	}

}
