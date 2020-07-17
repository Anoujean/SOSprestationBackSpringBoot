package com.mdiSoft.sosPrestation.entities;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Comment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int commentId;
	
	@Column
	private int rate;
	
	@Column
	private String text;
	
	@Column
	private int ratedClientId;
	
	@Column 
	private int ratedArtisanId;
	
	@ManyToOne
	@JsonIgnore
	private Artisan artisan;
	
	@ManyToOne
	@JsonIgnore
	private Client client;
	
	public Comment() {}

	public Comment(int commentId, int rate, String text, int ratedClientId, int ratedArtisanId, Artisan artisan,
			Client client) {
		this.commentId = commentId;
		this.rate = rate;
		this.text = text;
		this.ratedClientId = ratedClientId;
		this.ratedArtisanId = ratedArtisanId;
		this.artisan = artisan;
		this.client = client;
	}

	public int getCommentId() {
		return commentId;
	}

	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getRatedClientId() {
		return ratedClientId;
	}

	public void setRatedClientId(int ratedClientId) {
		this.ratedClientId = ratedClientId;
	}

	public int getRatedArtisanId() {
		return ratedArtisanId;
	}

	public void setRatedArtisanId(int ratedArtisanId) {
		this.ratedArtisanId = ratedArtisanId;
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
