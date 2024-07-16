package com.hibernate;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {

	private String CityName;
	private String Statename;
	private String StreatName;
	private String PinCode;

	public String getCityName() {
		return CityName;
	}

	public void setCityName(String cityName) {
		CityName = cityName;
	}

	public String getStatename() {
		return Statename;
	}

	public void setStatename(String statename) {
		Statename = statename;
	}

	public String getStreatName() {
		return StreatName;
	}

	public void setStreatName(String streatName) {
		StreatName = streatName;
	}

	public String getPinCode() {
		return PinCode;
	}

	public void setPinCode(String pinCode) {
		PinCode = pinCode;
	}

}
