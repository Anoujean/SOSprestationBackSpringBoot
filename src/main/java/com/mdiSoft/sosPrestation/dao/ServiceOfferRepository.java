package com.mdiSoft.sosPrestation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdiSoft.sosPrestation.entities.*;

@Repository
public interface ServiceOfferRepository extends JpaRepository<ServiceOffer, Integer>{
	
	public List<ServiceOffer> findAllDistinctByClientClientId (int clientId);

}
