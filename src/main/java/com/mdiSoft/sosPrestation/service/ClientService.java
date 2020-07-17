package com.mdiSoft.sosPrestation.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import com.mdiSoft.sosPrestation.dao.*;
import com.mdiSoft.sosPrestation.entities.*;
import com.mdiSoft.sosPrestation.dto.*;

import java.util.*;

@Service
@Transactional
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	
	public void saveClient (AccountInformation data) {
		
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
		
		Client tempClient = new Client();
		tempClient.setLastname(data.getLastname());
		tempClient.setFirstname(data.getFirstname());
		tempClient.setEmail(data.getEmail());
		tempClient.setPhone(data.getPhone());
		tempClient.setAccount(tempAccount);
		tempClient.setAddress(tempAddress);
		tempClient = clientRepository.save(tempClient);
		
		tempAccount.setClient(tempClient);
		tempAccount = accountRepository.save(tempAccount);
		
		tempAddress.setClient(tempClient);
		tempAddress = addressRepository.save(tempAddress);
		
	}
	
	public void updateClient (AccountInformation data) {
		
		Account account = accountRepository.getOne(data.getAccountId());
		account.setUsername(data.getUsername());
		account.setPassword(data.getPassword());
		account.getClient().setLastname(data.getLastname());
		account.getClient().setFirstname(data.getFirstname());
		account.getClient().setPhone(data.getPhone());
		account.getClient().setEmail(data.getEmail());
		account.getClient().getAddress().setRoad(data.getRoad());
		account.getClient().getAddress().setTown(data.getTown());
		account.getClient().getAddress().setPostalCode(data.getPostalCode());
		account.getClient().getAddress().setCountry(data.getCountry());
		accountRepository.save(account);
		
	}
	
	

}
