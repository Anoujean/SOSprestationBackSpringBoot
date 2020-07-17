package com.mdiSoft.sosPrestation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdiSoft.sosPrestation.entities.*;

@Repository
public interface ServiceProposalRepository extends JpaRepository<ServiceProposal, Integer>{
	
	public List<ServiceProposal> findAllDistinctByArtisanArtisanId (int artisanId);
	
	public List<ServiceProposal> findAllDistinctByServiceOfferServiceOfferId (int artisanId);
	
	public List<ServiceProposal> findAllDistinctByServiceOfferClientClientId (int clientId);

}
