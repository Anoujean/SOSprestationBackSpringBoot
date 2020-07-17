package com.mdiSoft.sosPrestation.dto;

public class ServiceProposalInformation {
	
	private int serviceOfferId;
	
	private int artisanId;
	
	private int serviceProposalId;
	
	private float minPrice;
	
	private float maxPrice;
	
	private String maxDate;
	
	private String minHour;
	
	private String maxHour;
	
	private String comment;
	
	private String artisanFirstname;
	
	private String artisanLastname;
	
	private int status_id;
	
	private String clientFirstname;
	
	private String clientLastname;
	
	private String serviceOfferTitle;
	
	private int clientId;
	
	public ServiceProposalInformation () {}

	public int getServiceOfferId() {
		return serviceOfferId;
	}

	public void setServiceOfferId(int serviceOfferId) {
		this.serviceOfferId = serviceOfferId;
	}

	public int getArtisanId() {
		return artisanId;
	}

	public void setArtisanId(int artisanId) {
		this.artisanId = artisanId;
	}

	public int getServiceProposalId() {
		return serviceProposalId;
	}

	public void setServiceProposalId(int serviceProposalId) {
		this.serviceProposalId = serviceProposalId;
	}

	public float getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(float minPrice) {
		this.minPrice = minPrice;
	}

	public float getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(float maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getMaxDate() {
		return maxDate;
	}

	public void setMaxDate(String maxDate) {
		this.maxDate = maxDate;
	}

	public String getMinHour() {
		return minHour;
	}

	public void setMinHour(String minHour) {
		this.minHour = minHour;
	}

	public String getMaxHour() {
		return maxHour;
	}

	public void setMaxHour(String maxHour) {
		this.maxHour = maxHour;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getArtisanFirstname() {
		return artisanFirstname;
	}

	public void setArtisanFirstname(String artisanFirstname) {
		this.artisanFirstname = artisanFirstname;
	}

	public String getArtisanLastname() {
		return artisanLastname;
	}

	public void setArtisanLastname(String artisanLastname) {
		this.artisanLastname = artisanLastname;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	public String getClientFirstname() {
		return clientFirstname;
	}

	public void setClientFirstname(String clientFirstname) {
		this.clientFirstname = clientFirstname;
	}

	public String getClientLastname() {
		return clientLastname;
	}

	public void setClientLastname(String clientLastname) {
		this.clientLastname = clientLastname;
	}

	public String getServiceOfferTitle() {
		return serviceOfferTitle;
	}

	public void setServiceOfferTitle(String serviceOfferTitle) {
		this.serviceOfferTitle = serviceOfferTitle;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	@Override
	public String toString() {
		return "ServiceProposalInformation [serviceOfferId=" + serviceOfferId + ", artisanId=" + artisanId
				+ ", serviceProposalId=" + serviceProposalId + ", minPrice=" + minPrice + ", maxPrice=" + maxPrice
				+ ", maxDate=" + maxDate + ", minHour=" + minHour + ", maxHour=" + maxHour + ", comment=" + comment
				+ ", artisanFirstname=" + artisanFirstname + ", artisanLastname=" + artisanLastname + ", status_id="
				+ status_id + "]";
	}
	
	
	
	
}
