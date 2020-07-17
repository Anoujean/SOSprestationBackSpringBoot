package com.mdiSoft.sosPrestation.dto;

public class LoginInformation {
	
	private int accountId;
	
	private int clientId;
	
	private int artisanId;
	
	public LoginInformation() {}

	public LoginInformation(int accountId, int clientid, int artisanId) {
		super();
		this.accountId = accountId;
		this.clientId = clientid;
		this.artisanId = artisanId;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientid) {
		this.clientId = clientid;
	}

	public int getArtisanId() {
		return artisanId;
	}

	public void setArtisanId(int artisanId) {
		this.artisanId = artisanId;
	}
	
	
	
	

}
