package com.mdiSoft.sosPrestation.entities;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int clientId;
	
	@Column
	private String firstname;
	
	@Column
	private String lastname;
	
	@Column
	private String phone;
	
	@Column
	private String email;
	
	@OneToOne
	@JsonIgnore 
	private Account account;
	
	@OneToMany (mappedBy = "client")
	private List<Comment> comments;
	
	@OneToOne
	@JsonIgnore
	private Address address;
	
	@OneToMany (mappedBy = "client")
	@JsonIgnore
	private List<ServiceOffer> serviceOffers;
	
	public Client() {}

	public Client(int clientId, String firstname, String lastname, String phone, String email, Account account,
			List<Comment> comments, Address address, List<ServiceOffer> serviceOffers) {
		this.clientId = clientId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.phone = phone;
		this.email = email;
		this.account = account;
		this.comments = comments;
		this.address = address;
		this.serviceOffers = serviceOffers;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<ServiceOffer> getServiceOffers() {
		return serviceOffers;
	}

	public void setServiceOffers(List<ServiceOffer> serviceOffers) {
		this.serviceOffers = serviceOffers;
	}
	
	
	
	

}
