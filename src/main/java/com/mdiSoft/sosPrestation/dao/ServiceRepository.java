package com.mdiSoft.sosPrestation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mdiSoft.sosPrestation.entities.*;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer>{
	
	public List<Service> findAllByCategoryCategoryId (int categoryId);

}
