package com.mdiSoft.sosPrestation.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int addressId;
	
	@Column
	private String road;
	
	@Column
	private String postalCode;
	
	@Column
	private String town;
	
	@Column
	private String country;
	
	@OneToOne
	@JsonIgnore
	private Artisan artisan;
	
	@OneToOne
	@JsonIgnore
	private Client client;
	
	public Address() {}

	public Address(int addressId, String road, String postalCode, String town, String country, Artisan artisan,
			Client client) {
		this.addressId = addressId;
		this.road = road;
		this.postalCode = postalCode;
		this.town = town;
		this.country = country;
		this.artisan = artisan;
		this.client = client;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
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
