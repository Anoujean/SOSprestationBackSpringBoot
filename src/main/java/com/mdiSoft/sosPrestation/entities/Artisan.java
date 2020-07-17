package com.mdiSoft.sosPrestation.entities;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Artisan {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int artisanId;
	
	@Column
	private String firstname;
	
	@Column
	private String lastname;
	
	@Column
	private String phone;
	
	@Column
	private String email;
	
	@OneToOne
	private Address address;
	
	@OneToMany (mappedBy = "artisan" )
	private List<Picture> pictures;
	
	@OneToMany (mappedBy = "artisan")
	private List<ServiceProposal> serviceProposals;
	
	@OneToOne
	@JsonIgnore
	private Account account;
	
	@OneToMany (mappedBy = "artisan")
	private List<Comment> comments;
	
	@OneToMany (mappedBy = "artisan")
	private List<ServiceIntervention> serviceInterventions;
	
	public Artisan() {}

	public Artisan(int artisanId, String firstname, String lastname, String phone, String email, Address address,
			List<Picture> pictures, List<ServiceProposal> serviceProposals, Account account, List<Comment> comments,
			List<ServiceIntervention> serviceInterventions) {
		this.artisanId = artisanId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.pictures = pictures;
		this.serviceProposals = serviceProposals;
		this.account = account;
		this.comments = comments;
		this.serviceInterventions = serviceInterventions;
	}

	public int getArtisanId() {
		return artisanId;
	}

	public void setArtisanId(int artisanId) {
		this.artisanId = artisanId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}

	public List<ServiceProposal> getServiceProposals() {
		return serviceProposals;
	}

	public void setServiceProposals(List<ServiceProposal> serviceProposals) {
		this.serviceProposals = serviceProposals;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<ServiceIntervention> getServiceInterventions() {
		return serviceInterventions;
	}

	public void setServiceInterventions(List<ServiceIntervention> serviceInterventions) {
		this.serviceInterventions = serviceInterventions;
	}
	
	
	
	

}
