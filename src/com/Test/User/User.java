package com.Test.User;

public class User {

	private String Username;
	private String password;
	private adders adders;
	private String Email;
	private Integer age;
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public adders getAdders() {
		return adders;
	}
	public void setAdders(adders adders) {
		this.adders = adders;
	}
	@Override
	public String toString() {
		return "User [Username=" + Username + ", password=" + password + ", Email=" + Email + ", age=" + age + ", id="
				+ id + "]";
	}
	public User(String username, String password, String email, Integer age, Integer id) {
		super();
		Username = username;
		this.password = password;
		Email = email;
		this.age = age;
		this.id = id;
	}
	public User(){
		
	}
}
