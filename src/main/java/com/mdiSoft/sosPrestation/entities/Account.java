package com.mdiSoft.sosPrestation.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//import lombok.Data;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int accountId;
	
	@Column
	private String username;
	
	@Column
	private String password;
	
	@Column
	private boolean isValid;
	
	@Column
	private boolean isAdmin;
	
	@Column
	private boolean isEnable;
	
	@OneToOne
	private Artisan artisan;
	
	@OneToOne
	private Client client;
	
	public Account() {}

	public Account(int accountId, String username, String password, boolean isValid, boolean isAdmin, boolean isEnable,
			Artisan artisan, Client client) {
		this.accountId = accountId;
		this.username = username;
		this.password = password;
		this.isValid = isValid;
		this.isAdmin = isAdmin;
		this.isEnable = isEnable;
		this.artisan = artisan;
		this.client = client;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
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

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	public boolean isAdmin() {
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public boolean isEnable() {
		return isEnable;
	}

	public void setEnable(boolean isEnable) {
		this.isEnable = isEnable;
	}

	public Artisan getArtisan() {
		return artisan;
	}

	public void setArtisan(Artisan artisan) {
		this.artisan = artisan;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	

}
