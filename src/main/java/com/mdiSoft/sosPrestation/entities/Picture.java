package com.mdiSoft.sosPrestation.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

//import lombok.Data;

@Entity
public class Picture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int pictureId;
	
	@Column
	private String path;
	
	@ManyToOne
	@JsonIgnore
	private Artisan artisan;
	
	@ManyToOne
	@JsonIgnore
	private ServiceOffer serviceOffer;
	
	public Picture() {}

	public Picture(int pictureId, String path, Artisan artisan, ServiceOffer serviceOffer) {
		super();
		this.pictureId = pictureId;
		this.path = path;
		this.artisan = artisan;
		this.serviceOffer = serviceOffer;
	}

	public int getPictureId() {
		return pictureId;
	}

	public void setPictureId(int pictureId) {
		this.pictureId = pictureId;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
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
