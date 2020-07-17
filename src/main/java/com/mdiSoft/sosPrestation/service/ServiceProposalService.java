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
public class ServiceProposalService {
	
	@Autowired
	private ServiceProposalRepository serviceProposalRepository;
	
	@Autowired
	private ArtisanRepository artisanRepository;
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private ServiceOfferRepository serviceOfferRepository;
	
	public void saveServiceProposal (ServiceProposalInformation spi) {
		Artisan artisan = artisanRepository.getOne(spi.getArtisanId());
		ServiceOffer so = serviceOfferRepository.getOne(spi.getServiceOfferId());
		
		ServiceProposal sp = new ServiceProposal();
		sp.setArtisan(artisan);
		sp.setComment(spi.getComment());
		sp.setMaxDate(spi.getMaxDate());
		sp.setMaxhour(spi.getMaxHour());
		sp.setMinHour(spi.getMinHour());
		sp.setMaxPrice(spi.getMaxPrice());
		sp.setMinPrice(spi.getMinPrice());
		sp.setServiceOffer(so);
		sp.setStatusId(spi.getStatus_id());
		
		serviceProposalRepository.save(sp);
		
	}
	
	public void updateServiceProposal (ServiceProposalInformation spi) {
		Artisan artisan = artisanRepository.getOne(spi.getArtisanId());
		ServiceOffer so = serviceOfferRepository.getOne(spi.getServiceOfferId());
		
		ServiceProposal sp = new ServiceProposal();
		sp.setArtisan(artisan);
		sp.setComment(spi.getComment());
		sp.setMaxDate(spi.getMaxDate());
		sp.setMaxhour(spi.getMaxHour());
		sp.setMinHour(spi.getMinHour());
		sp.setMaxPrice(spi.getMaxPrice());
		sp.setMinPrice(spi.getMinPrice());
		sp.setServiceOffer(so);
		sp.setStatusId(spi.getStatus_id());
		sp.setServiceProposalId(spi.getServiceProposalId());
		
		serviceProposalRepository.save(sp);
		
	}
	
	public ServiceProposalInformation getServiceProposalById (ServiceProposalInformation spi) {
		ServiceProposalInformation serviceProposalInformation = new ServiceProposalInformation();
		ServiceProposal sp = serviceProposalRepository.getOne(spi.getServiceProposalId());
		
		serviceProposalInformation.setArtisanId(sp.getArtisan().getArtisanId());
		serviceProposalInformation.setComment(sp.getComment());
		serviceProposalInformation.setMaxDate(sp.getMaxDate());
		serviceProposalInformation.setMaxHour(sp.getMaxhour());
		serviceProposalInformation.setMinHour(sp.getMinHour());
		serviceProposalInformation.setMaxPrice(sp.getMaxPrice());
		serviceProposalInformation.setMinPrice(sp.getMinPrice());
		serviceProposalInformation.setServiceOfferId(sp.getServiceOffer().getServiceOfferId());
		serviceProposalInformation.setStatus_id(sp.getStatusId());
		serviceProposalInformation.setServiceProposalId(sp.getServiceProposalId());
		
		
		return serviceProposalInformation;
	}
	
	public List<ServiceProposalInformation> getAllServiceProposalByArtisan (ServiceProposalInformation spi){
		List<ServiceProposalInformation> serviceProposalsInformations = new ArrayList<>();
		
		List<ServiceProposal> serviceProposals = serviceProposalRepository.findAllDistinctByArtisanArtisanId(spi.getArtisanId());
		
		for (ServiceProposal sp : serviceProposals) {
			
			ServiceProposalInformation serviceProposalInformation = new ServiceProposalInformation();
			serviceProposalInformation.setArtisanId(sp.getArtisan().getArtisanId());
			serviceProposalInformation.setComment(sp.getComment());
			serviceProposalInformation.setMaxDate(sp.getMaxDate());
			serviceProposalInformation.setMaxHour(sp.getMaxhour());
			serviceProposalInformation.setMinHour(sp.getMinHour());
			serviceProposalInformation.setMaxPrice(sp.getMaxPrice());
			serviceProposalInformation.setMinPrice(sp.getMinPrice());
			serviceProposalInformation.setServiceOfferId(sp.getServiceOffer().getServiceOfferId());
			serviceProposalInformation.setStatus_id(sp.getStatusId());
			serviceProposalInformation.setClientFirstname(sp.getServiceOffer().getClient().getFirstname());
			serviceProposalInformation.setClientLastname(sp.getServiceOffer().getClient().getLastname());
			serviceProposalInformation.setServiceOfferTitle(sp.getServiceOffer().getTitle());
			serviceProposalInformation.setServiceProposalId(sp.getServiceProposalId());
			
			serviceProposalsInformations.add(serviceProposalInformation);
		}
		
		return serviceProposalsInformations;
	}
	
	public List<ServiceProposalInformation> getAllServiceProposalByClient (ServiceProposalInformation spi){
		List<ServiceProposalInformation> serviceProposalsInformations = new ArrayList<>();
		
		List<ServiceProposal> serviceProposals = serviceProposalRepository.findAllDistinctByServiceOfferClientClientId(spi.getClientId());
		
		for (ServiceProposal sp : serviceProposals) {
			
			ServiceProposalInformation serviceProposalInformation = new ServiceProposalInformation();
			serviceProposalInformation.setArtisanId(sp.getArtisan().getArtisanId());
			serviceProposalInformation.setComment(sp.getComment());
			serviceProposalInformation.setMaxDate(sp.getMaxDate());
			serviceProposalInformation.setMaxHour(sp.getMaxhour());
			serviceProposalInformation.setMinHour(sp.getMinHour());
			serviceProposalInformation.setMaxPrice(sp.getMaxPrice());
			serviceProposalInformation.setMinPrice(sp.getMinPrice());
			serviceProposalInformation.setServiceOfferId(sp.getServiceOffer().getServiceOfferId());
			serviceProposalInformation.setStatus_id(sp.getStatusId());
			serviceProposalInformation.setArtisanFirstname(sp.getArtisan().getFirstname());
			serviceProposalInformation.setArtisanLastname(sp.getArtisan().getLastname());
			serviceProposalInformation.setServiceOfferTitle(sp.getServiceOffer().getTitle());
			serviceProposalInformation.setServiceProposalId(sp.getServiceProposalId());
			
			serviceProposalsInformations.add(serviceProposalInformation);
		}
		
		return serviceProposalsInformations;
	}
	
	public List<ServiceProposalInformation> getAllServiceProposalByServiceOffer (ServiceProposalInformation spi){
		List<ServiceProposalInformation> serviceProposalsInformations = new ArrayList<>();
		
		List<ServiceProposal> serviceProposals = serviceProposalRepository.findAllDistinctByServiceOfferServiceOfferId(spi.getServiceOfferId());
		
		for (ServiceProposal sp : serviceProposals) {
			
			ServiceProposalInformation serviceProposalInformation = new ServiceProposalInformation();
			serviceProposalInformation.setArtisanId(sp.getArtisan().getArtisanId());
			serviceProposalInformation.setComment(sp.getComment());
			serviceProposalInformation.setMaxDate(sp.getMaxDate());
			serviceProposalInformation.setMaxHour(sp.getMaxhour());
			serviceProposalInformation.setMinHour(sp.getMinHour());
			serviceProposalInformation.setMaxPrice(sp.getMaxPrice());
			serviceProposalInformation.setMinPrice(sp.getMinPrice());
			serviceProposalInformation.setServiceOfferId(sp.getServiceOffer().getServiceOfferId());
			serviceProposalInformation.setStatus_id(sp.getStatusId());
			serviceProposalInformation.setServiceProposalId(sp.getServiceProposalId());
			serviceProposalInformation.setArtisanFirstname(sp.getArtisan().getFirstname());
			serviceProposalInformation.setArtisanLastname(sp.getArtisan().getLastname());
			serviceProposalInformation.setServiceOfferTitle(sp.getServiceOffer().getTitle());
			
			serviceProposalsInformations.add(serviceProposalInformation);
		}
		
		return serviceProposalsInformations;
	}

}
