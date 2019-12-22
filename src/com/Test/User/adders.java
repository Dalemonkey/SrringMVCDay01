package com.Test.User;

public class adders {

	private String City;
	private String province;
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	@Override
	public String toString() {
		return "adders [City=" + City + ", province=" + province + "]";
	}
	
}
