package com.followweather.app.model;

public class Country {

	private int id;
	private String CountryName;
	private String CountryCode;
	private int cityId;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCountryName() {
		return CountryName;
	}
	
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	
	public String getCountryCode() {
		return CountryCode;
	}
	
	public void setCountryCode(String countryCode) {
		CountryCode = countryCode;
	}
	
	public int getCityId() {
		return cityId;
	}
	
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}
}
