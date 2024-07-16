package com.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(name = "city_name")
	private String cityName;
	@Column(name = "state_name")
	private String stateName;
	@Column(name = "streat_name")
	private String streatName;
	@Column(name = "pin_code")
	private String pinCode;
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getStreatName() {
		return streatName;
	}
	public void setStreatName(String streatName) {
		this.streatName = streatName;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
}