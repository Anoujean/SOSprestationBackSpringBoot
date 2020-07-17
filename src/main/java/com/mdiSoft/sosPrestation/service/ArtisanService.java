package com.mdiSoft.sosPrestation.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import com.mdiSoft.sosPrestation.dao.*;
import com.mdiSoft.sosPrestation.dto.AccountInformation;
import com.mdiSoft.sosPrestation.entities.*;

import java.util.*;

@Service
@Transactional
public class ArtisanService {
	
	@Autowired
	private ArtisanRepository artisanRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	
	public void saveArtisan (AccountInformation data) {
		
		Account tempAccount = new Account();
		tempAccount.setUsername(data.getUsername());
		tempAccount.setPassword(data.getPassword());
		tempAccount = accountRepository.save(tempAccount);
				
		Address tempAddress = new Address();
		tempAddress.setRoad(data.getRoad());
		tempAddress.setTown(data.getTown());
		tempAddress.setPostalCode(data.getPostalCode());
		tempAddress.setCountry(data.getCountry());
		tempAddress = addressRepository.save(tempAddress);
		
		Artisan tempArtisan = new Artisan();
		tempArtisan.setLastname(data.getLastname());
		tempArtisan.setFirstname(data.getFirstname());
		tempArtisan.setEmail(data.getEmail());
		tempArtisan.setPhone(data.getPhone());
		tempArtisan.setAccount(tempAccount);
		tempArtisan.setAddress(tempAddress);
		tempArtisan = artisanRepository.save(tempArtisan);
		
		tempAccount.setArtisan(tempArtisan);
		tempAccount = accountRepository.save(tempAccount);
		
		tempAddress.setArtisan(tempArtisan);
		tempAddress = addressRepository.save(tempAddress);
		
	}
	
	public void updateArtisan (AccountInformation data) {
		
		Account account = accountRepository.getOne(data.getAccountId());
		account.setUsername(data.getUsername());
		account.setPassword(data.getPassword());
		account.getArtisan().setLastname(data.getLastname());
		account.getArtisan().setFirstname(data.getFirstname());
		account.getArtisan().setPhone(data.getPhone());
		account.getArtisan().setEmail(data.getEmail());
		account.getArtisan().getAddress().setRoad(data.getRoad());
		account.getArtisan().getAddress().setTown(data.getTown());
		account.getArtisan().getAddress().setPostalCode(data.getPostalCode());
		account.getArtisan().getAddress().setCountry(data.getCountry());
		accountRepository.save(account);
		
	}

}
