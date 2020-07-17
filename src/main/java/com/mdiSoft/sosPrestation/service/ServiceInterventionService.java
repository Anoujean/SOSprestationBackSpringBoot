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
public class ServiceInterventionService {
	
	@Autowired
	private ArtisanRepository artisanRepository;
	
	@Autowired
	private ServiceRepository serviceRepository;
	
	@Autowired
	private ServiceInterventionRepository serviceInterventionRepository;
	
	public void saveServiceIntervention (ServiceInterventionInformation serviceInterventionInformation) {
		Artisan artisan = artisanRepository.getOne(serviceInterventionInformation.getArtisanId());
		com.mdiSoft.sosPrestation.entities.Service service = serviceRepository.getOne(serviceInterventionInformation.getServiceId());
		
		ServiceIntervention serviceIntervention = new ServiceIntervention();
		serviceIntervention.setArtisan(artisan);
		serviceIntervention.setService(service);
		serviceIntervention.setInterventionRadius(serviceInterventionInformation.getInterventionRadius());
		serviceIntervention.setLatitude(serviceInterventionInformation.getLatitude());
		serviceIntervention.setLongitude(serviceInterventionInformation.getLongitude());
		serviceIntervention.setMaxHour(serviceInterventionInformation.getMaxHour());
		serviceIntervention.setMinHour(serviceInterventionInformation.getMinHour());
		serviceIntervention.setActive(serviceInterventionInformation.isActive());
		serviceIntervention.setAddress(serviceInterventionInformation.getAddress());
		
		serviceInterventionRepository.save(serviceIntervention);
		
	}
	
	public void updateServiceIntervention (ServiceInterventionInformation serviceInterventionInformation) {
		Artisan artisan = artisanRepository.getOne(serviceInterventionInformation.getArtisanId());
		com.mdiSoft.sosPrestation.entities.Service service = serviceRepository.getOne(serviceInterventionInformation.getServiceId());
		
		ServiceIntervention serviceIntervention = new ServiceIntervention();
		serviceIntervention.setArtisan(artisan);
		serviceIntervention.setService(service);
		serviceIntervention.setServiceInterventionId(serviceInterventionInformation.getServiceInterventionId());
		serviceIntervention.setInterventionRadius(serviceInterventionInformation.getInterventionRadius());
		serviceIntervention.setLatitude(serviceInterventionInformation.getLatitude());
		serviceIntervention.setLongitude(serviceInterventionInformation.getLongitude());
		serviceIntervention.setMaxHour(serviceInterventionInformation.getMaxHour());
		serviceIntervention.setMinHour(serviceInterventionInformation.getMinHour());
		serviceIntervention.setActive(serviceInterventionInformation.isActive());
		serviceIntervention.setAddress(serviceInterventionInformation.getAddress());
		
		serviceInterventionRepository.save(serviceIntervention);
		
	}
	
	public List<ServiceInterventionInformation> getAllByArtisan (ServiceInterventionInformation serviceInterventionInformation){
		
		List<ServiceIntervention> serviceInterventions = serviceInterventionRepository.findAllDistinctByArtisanArtisanId(serviceInterventionInformation.getArtisanId());
		List<ServiceInterventionInformation> serviceInterventionsinformations = new ArrayList<>();
		
		if (serviceInterventions != null) {
			for (ServiceIntervention sI : serviceInterventions) {
				ServiceInterventionInformation sII = new ServiceInterventionInformation();
				sII.setArtisanId(sI.getArtisan().getArtisanId());
				sII.setServiceId(sI.getService().getServiceId());
				sII.setServiceInterventionId(sI.getServiceInterventionId());
				sII.setInterventionRadius(sI.getInterventionRadius());
				sII.setLatitude(sI.getLatitude());
				sII.setLongitude(sI.getLongitude());
				sII.setMaxHour(sI.getMaxHour());
				sII.setMinHour(sI.getMinHour());
				sII.setActive(sI.isActive());
				sII.setServiceName(sI.getService().getName());
				sII.setAddress(sI.getAddress());
				
				serviceInterventionsinformations.add(sII);
			}
		}
		
		return serviceInterventionsinformations;
		
	}
	
	public ServiceInterventionInformation getServiceInterventionInformationById (ServiceInterventionInformation sIInfo) {
		ServiceIntervention sI = serviceInterventionRepository.getOne(sIInfo.getServiceInterventionId());
		
		ServiceInterventionInformation sII = new ServiceInterventionInformation();
		sII.setArtisanId(sI.getArtisan().getArtisanId());
		sII.setServiceId(sI.getService().getServiceId());
		sII.setServiceInterventionId(sI.getServiceInterventionId());
		sII.setInterventionRadius(sI.getInterventionRadius());
		sII.setLatitude(sI.getLatitude());
		sII.setLongitude(sI.getLongitude());
		sII.setMaxHour(sI.getMaxHour());
		sII.setMinHour(sI.getMinHour());
		sII.setActive(sI.isActive());
		sII.setServiceName(sI.getService().getName());
		sII.setAddress(sI.getAddress());
		sII.setCategoryId(sI.getService().getCategory().getCategoryId());
		
		return sII;
	}

}
