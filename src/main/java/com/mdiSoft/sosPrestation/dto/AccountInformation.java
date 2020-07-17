package com.mdiSoft.sosPrestation.dto;

public class AccountInformation {
	
	private int accountId;
	
	private String lastname;
	
	private String firstname;
	
	private String phone;
	
	private String email;
	
	private String road;
	
	private String town;
	
	private String postalCode;
	
	private String country;
	
	private String username;
	
	private String password;
	
	public AccountInformation () {}

	public AccountInformation(int accountId, String lastname, String firstname, String phone, String email, String road,
			String town, String postalCode, String country, String username, String password) {
		super();
		this.accountId = accountId;
		this.lastname = lastname;
		this.firstname = firstname;
		this.phone = phone;
		this.email = email;
		this.road = road;
		this.town = town;
		this.postalCode = postalCode;
		this.country = country;
		this.username = username;
		this.password = password;
	}


	public AccountInformation(String lastname, String firstname, String phone, String email, String road, String town,
			String postalCode, String country, String username, String password) {
		super();
		this.lastname = lastname;
		this.firstname = firstname;
		this.phone = phone;
		this.email = email;
		this.road = road;
		this.town = town;
		this.postalCode = postalCode;
		this.country = country;
		this.username = username;
		this.password = password;
	}
	

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
