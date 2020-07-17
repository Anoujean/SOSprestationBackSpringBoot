package com.mdiSoft.sosPrestation.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import com.mdiSoft.sosPrestation.dao.*;
import com.mdiSoft.sosPrestation.entities.*;

import java.util.*;

@Service
@Transactional
public class ServiceService {
	
	@Autowired
	private ServiceRepository serviceRepository;
	
	public List<com.mdiSoft.sosPrestation.entities.Service> getAllServiceByCategory (Category category){
		return serviceRepository.findAllByCategoryCategoryId(category.getCategoryId());
	}

}
