package com.hibernate;

import java.util.Date;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "user_details")
public class UserDetails {
	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int userID;
	@Column(name = "user_name")
	private String userName;
	@Embedded
	private Address hoemAddress;

	@Embedded
	@AttributeOverrides({ @AttributeOverride(name = "cityName", column = @Column(name = "office_city_name")),
			@AttributeOverride(name = "stateName", column = @Column(name = "office_state_name")),
			@AttributeOverride(name = "streatName", column = @Column(name = "office_street_name")),
			@AttributeOverride(name = "pinCode", column = @Column(name = "office_pin_code")) })
	private Address officeAddress;

	@Column(name = "description")
	private String description;

	@Column(name = "joined_date")
	private Date joinedDate;

	// Getters and setters
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

	public Address getHoemAddress() {
		return hoemAddress;
	}

	public void setHoemAddress(Address hoemAddress) {
		this.hoemAddress = hoemAddress;
	}

	public Address getOfficeAddress() {
		return officeAddress;
	}

	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
}
