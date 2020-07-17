package com.mdiSoft.sosPrestation.entities;

import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class ServiceOffer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int serviceOfferId;
	
	@Column
	private String title;
	
	@Column
	private String description;
	
	@Column
	private String address;
	
	@Column
	private String latitude;
	
	@Column
	private String longitude;
	
	@Column
	private String date;
	
	@Column
	private String maxDate;
	
	@Column
	private String minHour;
	
	@Column
	private String maxhour;
	
	@Column
	private int choosenServiceProposal;
	
	@Column
	private boolean isActive;
	
	@Column
	private int statusId;
	
	@OneToMany (mappedBy = "serviceOffer" )
	private List<Picture> pictures;
	
	@ManyToOne
	private Service service;
	
	@ManyToOne
	private Client client;
	
	@OneToMany (mappedBy = "serviceOffer")
	private List<ServiceProposal> serviceProposals;
	
	public ServiceOffer() {}

	public ServiceOffer(int serviceOfferId, String title, String description, String address, String latitude,
			String longitude, String date, String maxDate, String minHour, String maxhour, int choosenServiceProposal,
			boolean isActive, int statusId, List<Picture> pictures, Service service, Client client,
			List<ServiceProposal> serviceProposals) {
		this.serviceOfferId = serviceOfferId;
		this.title = title;
		this.description = description;
		this.address = address;
		this.latitude = latitude;
		this.longitude = longitude;
		this.date = date;
		this.maxDate = maxDate;
		this.minHour = minHour;
		this.maxhour = maxhour;
		this.choosenServiceProposal = choosenServiceProposal;
		this.isActive = isActive;
		this.statusId = statusId;
		this.pictures = pictures;
		this.service = service;
		this.client = client;
		this.serviceProposals = serviceProposals;
	}

	public int getServiceOfferId() {
		return serviceOfferId;
	}

	public void setServiceOfferId(int serviceOfferId) {
		this.serviceOfferId = serviceOfferId;
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

	public String getMaxhour() {
		return maxhour;
	}

	public void setMaxhour(String maxhour) {
		this.maxhour = maxhour;
	}

	public int getChoosenServiceProposal() {
		return choosenServiceProposal;
	}

	public void setChoosenServiceProposal(int choosenServiceProposal) {
		this.choosenServiceProposal = choosenServiceProposal;
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

	public List<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<ServiceProposal> getServiceProposals() {
		return serviceProposals;
	}

	public void setServiceProposals(List<ServiceProposal> serviceProposals) {
		this.serviceProposals = serviceProposals;
	}
	
	
	
	

}
