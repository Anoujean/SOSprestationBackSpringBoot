package com.mdiSoft.sosPrestation.dto;

public class ServiceInterventionInformation {
	
	private int artisanId;
	
	private int serviceInterventionId;
	
	private int serviceId;
	
	private int interventionRadius;
	
	private boolean isActive;
	
	private int minHour;
	
	private int maxHour;
	
	private String latitude;
	
	private String longitude;
	
	private String serviceName;
	
	private String address;
	
	private int categoryId;

	public ServiceInterventionInformation() {
		super();
	}

	public ServiceInterventionInformation(int artisanId, int serviceInterventionId, int serviceId,
			int interventionRadius, boolean isActive, int minHour, int maxHour, String latitude, String longitude,
			String serviceName, String address) {
		super();
		this.artisanId = artisanId;
		this.serviceInterventionId = serviceInterventionId;
		this.serviceId = serviceId;
		this.interventionRadius = interventionRadius;
		this.isActive = isActive;
		this.minHour = minHour;
		this.maxHour = maxHour;
		this.latitude = latitude;
		this.longitude = longitude;
		this.serviceName = serviceName;
		this.address = address;
	}

	public int getArtisanId() {
		return artisanId;
	}

	public void setArtisanId(int artisanId) {
		this.artisanId = artisanId;
	}

	public int getServiceInterventionId() {
		return serviceInterventionId;
	}

	public void setServiceInterventionId(int serviceInterventionId) {
		this.serviceInterventionId = serviceInterventionId;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public int getInterventionRadius() {
		return interventionRadius;
	}

	public void setInterventionRadius(int interventionRadius) {
		this.interventionRadius = interventionRadius;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getMinHour() {
		return minHour;
	}

	public void setMinHour(int minHour) {
		this.minHour = minHour;
	}

	public int getMaxHour() {
		return maxHour;
	}

	public void setMaxHour(int maxHour) {
		this.maxHour = maxHour;
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

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	
	
	
	
	
	
	

}
