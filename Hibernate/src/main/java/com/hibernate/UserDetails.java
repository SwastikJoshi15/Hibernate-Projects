package com.hibernate;

import java.util.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "user_details")
public class UserDetails {
	@Id()
	@Column(name = "user_id")
	private int userID;
	@Column(name = "user_name")
	private String userName;
	private String address;
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Date getJoinedDate() {
		return JoinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		JoinedDate = joinedDate;
	}

	private String discription;
	private Date JoinedDate;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
