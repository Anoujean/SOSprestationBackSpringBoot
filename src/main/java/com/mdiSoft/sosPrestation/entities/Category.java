package com.mdiSoft.sosPrestation.entities;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int categoryId;
	
	@Column
	private String name;
	
	@OneToMany (mappedBy = "category")
	@JsonIgnore
	private List<Service> services;
	
	public Category() {}

	public Category(int categoryId, String name, List<Service> services) {
		this.categoryId = categoryId;
		this.name = name;
		this.services = services;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}
	
	
	

}
