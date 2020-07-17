package com.mdiSoft.sosPrestation.entities;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class ServiceIntervention {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int serviceInterventionId;
	
	@Column
	private int interventionRadius;
	
	@Column
	private int minHour;
	
	@Column
	private int maxHour;
	
	@Column
	private String latitude;
	
	@Column
	private String longitude;
	
	@Column
	private String address;
	
	@Column
	private boolean isActive;
	
	@ManyToOne
	private Artisan artisan;
	
	@ManyToOne
	private Service service;
	
	public ServiceIntervention () {}

	public ServiceIntervention(int serviceInterventionId, int interventionRadius, int minHour, int maxHour,
			String latitude, String longitude, String address, boolean isActive, Artisan artisan, Service service) {
		super();
		this.serviceInterventionId = serviceInterventionId;
		this.interventionRadius = interventionRadius;
		this.minHour = minHour;
		this.maxHour = maxHour;
		this.latitude = latitude;
		this.longitude = longitude;
		this.address = address;
		this.isActive = isActive;
		this.artisan = artisan;
		this.service = service;
	}

	public int getServiceInterventionId() {
		return serviceInterventionId;
	}

	public void setServiceInterventionId(int serviceInterventionId) {
		this.serviceInterventionId = serviceInterventionId;
	}

	public int getInterventionRadius() {
		return interventionRadius;
	}

	public void setInterventionRadius(int interventionRadius) {
		this.interventionRadius = interventionRadius;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Artisan getArtisan() {
		return artisan;
	}

	public void setArtisan(Artisan artisan) {
		this.artisan = artisan;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}
	
	
	
	
	
	

}
