package com.mdiSoft.sosPrestation.dto;

public class ServiceOfferInformation {
	
	private int serviceId;
	
	private String title;
	
	private String description;
	
	private String address;
	
	private String latitude;
	
	private String longitude;
	
	private String date;
	
	private String maxDate;
	
	private String minHour;
	
	private String maxHour;
	
	private boolean isActive;
	
	private int statusId;
	
	private int clientId;
	
	private String clientFirstname;
	
	private String clientLastname;
	
	private int choosenServiceProposal;
	
	private String serviceName;
	
	private String categoryName;
	
	private int serviceOfferId;
	
	private int categoryId;
	
	public ServiceOfferInformation () {}

	public ServiceOfferInformation(int serviceId, String titre, String description, String address, String latitude,
			String longitude, String date, String minHour, String maxHour, boolean isActive, int statusId, int clientId,
			String clientFirstname, String clientLastname) {
		super();
		this.serviceId = serviceId;
		this.title = titre;
		this.description = description;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.date = date;
		this.minHour = minHour;
		this.maxHour = maxHour;
		this.isActive = isActive;
		this.statusId = statusId;
		this.clientId = clientId;
		this.clientFirstname = clientFirstname;
		this.clientLastname = clientLastname;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
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

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
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

	public int getChoosenServiceProposal() {
		return choosenServiceProposal;
	}

	public void setChoosenServiceProposal(int choosenServiceProposal) {
		this.choosenServiceProposal = choosenServiceProposal;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getServiceOfferId() {
		return serviceOfferId;
	}

	public void setServiceOfferId(int serviceOfferId) {
		this.serviceOfferId = serviceOfferId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "ServiceOfferInformation [serviceId=" + serviceId + ", title=" + title + ", description=" + description
				+ ", address=" + address + ", latitude=" + latitude + ", longitude=" + longitude + ", date=" + date
				+ ", maxDate=" + maxDate + ", minHour=" + minHour + ", maxHour=" + maxHour + ", isActive=" + isActive
				+ ", statusId=" + statusId + ", clientId=" + clientId + ", clientFirstname=" + clientFirstname
				+ ", clientLastname=" + clientLastname + ", choosenServiceProposal=" + choosenServiceProposal + "]";
	}
	
	
	
	

}
