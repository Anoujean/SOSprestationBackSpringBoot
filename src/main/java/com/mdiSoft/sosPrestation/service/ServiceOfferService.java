package com.mdiSoft.sosPrestation.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import com.mdiSoft.sosPrestation.dao.*;
import com.mdiSoft.sosPrestation.dto.*;
import com.mdiSoft.sosPrestation.entities.*;

import java.util.*;

@Service
@Transactional
public class ServiceOfferService {
	
	@Autowired
	private ServiceOfferRepository serviceOfferRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private ServiceRepository serviceRepository;
	
	public void saveServiceOffer (ServiceOfferInformation serviceOfferInfo) {
		Client client = clientRepository.getOne(serviceOfferInfo.getClientId());
		com.mdiSoft.sosPrestation.entities.Service service = serviceRepository.getOne(serviceOfferInfo.getServiceId());
		
		ServiceOffer serviceOffer = new ServiceOffer();
		serviceOffer.setTitle(serviceOfferInfo.getTitle());
		serviceOffer.setDescription(serviceOfferInfo.getDescription());
		serviceOffer.setAddress(serviceOfferInfo.getAddress());
		serviceOffer.setLatitude(serviceOfferInfo.getLatitude());
		serviceOffer.setLongitude(serviceOfferInfo.getLongitude());
		serviceOffer.setDate(serviceOfferInfo.getDate());
		serviceOffer.setMaxDate(serviceOfferInfo.getMaxDate());
		serviceOffer.setMinHour(serviceOfferInfo.getMinHour());
		serviceOffer.setMaxhour(serviceOfferInfo.getMaxHour());
		serviceOffer.setClient(client);
		serviceOffer.setService(service);
		
		serviceOfferRepository.save(serviceOffer);
		
	}
	
	public void updateServiceOffer (ServiceOfferInformation serviceOfferInfo) {
		Client client = clientRepository.getOne(serviceOfferInfo.getClientId());
		com.mdiSoft.sosPrestation.entities.Service service = serviceRepository.getOne(serviceOfferInfo.getServiceId());
		
		ServiceOffer serviceOffer = new ServiceOffer();
		serviceOffer.setServiceOfferId(serviceOfferInfo.getServiceOfferId());
		serviceOffer.setTitle(serviceOfferInfo.getTitle());
		serviceOffer.setDescription(serviceOfferInfo.getDescription());
		serviceOffer.setAddress(serviceOfferInfo.getAddress());
		serviceOffer.setLatitude(serviceOfferInfo.getLatitude());
		serviceOffer.setLongitude(serviceOfferInfo.getLongitude());
		serviceOffer.setDate(serviceOfferInfo.getDate());
		serviceOffer.setMaxDate(serviceOfferInfo.getMaxDate());
		serviceOffer.setMinHour(serviceOfferInfo.getMinHour());
		serviceOffer.setMaxhour(serviceOfferInfo.getMaxHour());
		serviceOffer.setClient(client);
		serviceOffer.setService(service);
		
		serviceOfferRepository.save(serviceOffer);
		
	}
	
	public List<ServiceOfferInformation> getServiceOffersByClient (Client client){
		List<ServiceOfferInformation> serviceOffersInformations = new ArrayList<>();
		List<ServiceOffer> serviceOffers = serviceOfferRepository.findAllDistinctByClientClientId(client.getClientId());
		
		for (ServiceOffer so : serviceOffers) {
			ServiceOfferInformation soi = new ServiceOfferInformation();
			soi.setServiceOfferId(so.getServiceOfferId());
			//soi.setClientId(so.getClient().getClientId());
			//soi.setClientFirstname(so.getClient().getFirstname());
			//soi.setClientLastname(so.getClient().getLastname());
			soi.setTitle(so.getTitle());
			soi.setServiceId(so.getService().getServiceId());
			soi.setServiceName(so.getService().getName());
			soi.setCategoryName(so.getService().getCategory().getName());
			soi.setDate(so.getDate());
			serviceOffersInformations.add(soi);
		}
		
		return serviceOffersInformations;
		
	}
	
	public ServiceOfferInformation getServiceOfferInformationById (ServiceOfferInformation serviceOfferInfo) {
		ServiceOffer serviceOffer = serviceOfferRepository.getOne(serviceOfferInfo.getServiceOfferId());
		ServiceOfferInformation serviceOfferInformation = new ServiceOfferInformation();
		
		serviceOfferInformation.setTitle(serviceOffer.getTitle());
		serviceOfferInformation.setDescription(serviceOffer.getDescription());
		serviceOfferInformation.setAddress(serviceOffer.getAddress());
		serviceOfferInformation.setLatitude(serviceOffer.getLatitude());
		serviceOfferInformation.setLongitude(serviceOffer.getLongitude());
		serviceOfferInformation.setDate(serviceOffer.getDate());
		serviceOfferInformation.setMaxDate(serviceOffer.getMaxDate());
		serviceOfferInformation.setMinHour(serviceOffer.getMinHour());
		serviceOfferInformation.setMaxHour(serviceOffer.getMaxhour());
		serviceOfferInformation.setServiceId(serviceOffer.getService().getServiceId());
		serviceOfferInformation.setServiceName(serviceOffer.getService().getName());
		serviceOfferInformation.setServiceOfferId(serviceOffer.getServiceOfferId());
		serviceOfferInformation.setCategoryId(serviceOffer.getService().getCategory().getCategoryId());
		
		return serviceOfferInformation;
		
	}
	
	public List<ServiceOfferInformation> getAllServiceOffers (){
		List<ServiceOfferInformation> serviceOffersInformations = new ArrayList<>();
		List<ServiceOffer> serviceOffers = serviceOfferRepository.findAll();
		
		for (ServiceOffer so : serviceOffers) {
			ServiceOfferInformation soi = new ServiceOfferInformation();
			soi.setServiceOfferId(so.getServiceOfferId());
			//soi.setClientId(so.getClient().getClientId());
			soi.setClientFirstname(so.getClient().getFirstname());
			soi.setClientLastname(so.getClient().getLastname());
			soi.setTitle(so.getTitle());
			soi.setServiceId(so.getService().getServiceId());
			soi.setServiceName(so.getService().getName());
			soi.setCategoryName(so.getService().getCategory().getName());
			soi.setDate(so.getDate());
			serviceOffersInformations.add(soi);
		}
		
		return serviceOffersInformations;
		
	}
	
	

}
