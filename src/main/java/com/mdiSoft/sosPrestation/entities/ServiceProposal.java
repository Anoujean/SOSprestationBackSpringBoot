package com.mdiSoft.sosPrestation.entities;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
public class ServiceProposal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int serviceProposalId;
	
	@Column
	private float minPrice;
	
	@Column
	private float maxPrice;
	
	@Column
	private String maxDate;
	
	@Column
	private String minHour;
	
	@Column
	private String maxhour;
	
	@Column
	private String comment;
	
	@Column
	private int statusId;
	
	@ManyToOne
	private Artisan artisan;
	
	@ManyToOne
	private ServiceOffer serviceOffer;
	
	public ServiceProposal () {}

	public ServiceProposal(int serviceProposalId, float minPrice, float maxPrice, String maxDate, String minHour,
			String maxhour, String comment, int statusId, Artisan artisan, ServiceOffer serviceOffer) {
		this.serviceProposalId = serviceProposalId;
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
		this.maxDate = maxDate;
		this.minHour = minHour;
		this.maxhour = maxhour;
		this.comment = comment;
		this.statusId = statusId;
		this.artisan = artisan;
		this.serviceOffer = serviceOffer;
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

	public String getMaxhour() {
		return maxhour;
	}

	public void setMaxhour(String maxhour) {
		this.maxhour = maxhour;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public Artisan getArtisan() {
		return artisan;
	}

	public void setArtisan(Artisan artisan) {
		this.artisan = artisan;
	}

	public ServiceOffer getServiceOffer() {
		return serviceOffer;
	}

	public void setServiceOffer(ServiceOffer serviceOffer) {
		this.serviceOffer = serviceOffer;
	}
	
	
	
	

}
