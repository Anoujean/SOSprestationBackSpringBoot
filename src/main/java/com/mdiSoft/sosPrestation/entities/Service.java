package com.mdiSoft.sosPrestation.entities;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Service {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int serviceId;
	
	@Column
	private String name;
	
	@OneToMany (mappedBy = "service")
	@JsonIgnore
	private List<ServiceIntervention> serviceInterventions;
	
	@ManyToOne
	@JsonIgnore
	private Category category;
	
	@OneToMany (mappedBy = "service")
	@JsonIgnore
	private List<ServiceOffer> serviceOffer;
	
	public Service () {}

	public Service(int serviceId, String name, List<ServiceIntervention> serviceInterventions, Category category,
			List<ServiceOffer> serviceOffer) {
		super();
		this.serviceId = serviceId;
		this.name = name;
		this.serviceInterventions = serviceInterventions;
		this.category = category;
		this.serviceOffer = serviceOffer;
	}

	public int getServiceId() {
		return serviceId;
	}

	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ServiceIntervention> getServiceInterventions() {
		return serviceInterventions;
	}

	public void setServiceInterventions(List<ServiceIntervention> serviceInterventions) {
		this.serviceInterventions = serviceInterventions;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<ServiceOffer> getServiceOffer() {
		return serviceOffer;
	}

	public void setServiceOffer(List<ServiceOffer> serviceOffer) {
		this.serviceOffer = serviceOffer;
	}
	
	
	
	

}
