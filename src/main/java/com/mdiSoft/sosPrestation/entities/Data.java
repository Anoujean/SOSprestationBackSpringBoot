package com.mdiSoft.sosPrestation.entities;

import java.util.List;

public class Data {
	
	private Account account;
	
	private Address address;
	
	private Artisan artisan;
	
	private Category category;
	
	private Client client;
	
	private Comment comment;
	
	private Picture picture;
	
	private Service service;
	
	private ServiceIntervention serviceIntervention;
	
	private ServiceOffer serviceOffer;
	
	private ServiceProposal serviceProposal;
	
	private List<Account> accounts;
	
	private List<Address> addresses;
	
	private List<Artisan> artisans;
	
	private List<Category> categories;
	
	private List<Client> clients;
	
	private List<Comment> comments;
	
	private List<Picture> pictures;
	
	private List<Service> services;
	
	private List<ServiceIntervention> serviceInterventions;
	
	private List<ServiceOffer> serviceOffers;
	
	private List<ServiceProposal> serviceProposals;
	
	public Data() {}
	
	public Data(Account account, Address address, Artisan artisan, Category category, Client client, Comment comment,
			Picture picture, Service service, ServiceIntervention serviceIntervention, ServiceOffer serviceOffer,
			ServiceProposal serviceProposal) {
		this.account = account;
		this.address = address;
		this.artisan = artisan;
		this.category = category;
		this.client = client;
		this.comment = comment;
		this.picture = picture;
		this.service = service;
		this.serviceIntervention = serviceIntervention;
		this.serviceOffer = serviceOffer;
		this.serviceProposal = serviceProposal;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Artisan getArtisan() {
		return artisan;
	}

	public void setArtisan(Artisan artisan) {
		this.artisan = artisan;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Comment getComment() {
		return comment;
	}

	public void setComment(Comment comment) {
		this.comment = comment;
	}

	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	public ServiceIntervention getServiceIntervention() {
		return serviceIntervention;
	}

	public void setServiceIntervention(ServiceIntervention serviceIntervention) {
		this.serviceIntervention = serviceIntervention;
	}

	public ServiceOffer getServiceOffer() {
		return serviceOffer;
	}

	public void setServiceOffer(ServiceOffer serviceOffer) {
		this.serviceOffer = serviceOffer;
	}

	public ServiceProposal getServiceProposal() {
		return serviceProposal;
	}

	public void setServiceProposal(ServiceProposal serviceProposal) {
		this.serviceProposal = serviceProposal;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Artisan> getArtisans() {
		return artisans;
	}

	public void setArtisans(List<Artisan> artisans) {
		this.artisans = artisans;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Picture> getPictures() {
		return pictures;
	}

	public void setPictures(List<Picture> pictures) {
		this.pictures = pictures;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public List<ServiceIntervention> getServiceInterventions() {
		return serviceInterventions;
	}

	public void setServiceInterventions(List<ServiceIntervention> serviceInterventions) {
		this.serviceInterventions = serviceInterventions;
	}

	public List<ServiceOffer> getServiceOffers() {
		return serviceOffers;
	}

	public void setServiceOffers(List<ServiceOffer> serviceOffers) {
		this.serviceOffers = serviceOffers;
	}

	public List<ServiceProposal> getServiceProposals() {
		return serviceProposals;
	}

	public void setServiceProposals(List<ServiceProposal> serviceProposals) {
		this.serviceProposals = serviceProposals;
	}
	
	
	
}
