package com.mdiSoft.sosPrestation.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import com.mdiSoft.sosPrestation.dao.*;
import com.mdiSoft.sosPrestation.entities.*;

import java.util.*;

@Service
@Transactional
public class CategoryService {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public void saveCategory (Category category) {
		categoryRepository.save(category);
	}
	
	public List<Category> getAllCategories (){
		List<Category> categories = categoryRepository.findAll();
		return categories;
	}
	
	public Category getCategoryById (int id) {
		return categoryRepository.getOne(id);
	}
	
	public void deleteCategory (Category category) {
		categoryRepository.delete(category);
	}
	
	
	

}
