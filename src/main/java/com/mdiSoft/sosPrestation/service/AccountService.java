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
public class AccountService {
	
	@Autowired
	private AccountRepository accountRepository;
	
	public AccountInformation getAccountbyId(Account account) {
		Account acc = accountRepository.getOne(account.getAccountId());
		
		AccountInformation accInfo = null;
		
		if (acc.getClient() != null) {
			accInfo = new AccountInformation(acc.getAccountId(), acc.getClient().getLastname(), acc.getClient().getFirstname(), acc.getClient().getPhone(), 
					acc.getClient().getEmail(), acc.getClient().getAddress().getRoad(), acc.getClient().getAddress().getTown(), acc.getClient().getAddress().getPostalCode(), 
					acc.getClient().getAddress().getCountry(), acc.getUsername(), acc.getPassword());
		}
		
		if (acc.getArtisan() != null) {
			accInfo = new AccountInformation(acc.getAccountId(), acc.getArtisan().getLastname(), acc.getArtisan().getFirstname(), acc.getArtisan().getPhone(), 
					acc.getArtisan().getEmail(), acc.getArtisan().getAddress().getRoad(), acc.getArtisan().getAddress().getTown(), acc.getArtisan().getAddress().getPostalCode(), 
					acc.getArtisan().getAddress().getCountry(), acc.getUsername(), acc.getPassword());
			
		}
		
		return accInfo;
	}
	
	public LoginInformation getAccountByUsernameAndPassword (AccountInformation data) {
		Account account = accountRepository.findAllByUsernameAndPassword(data.getUsername(), data.getPassword());
		LoginInformation logInfo = new LoginInformation();
		logInfo.setAccountId(account.getAccountId());
		if (account.getArtisan() != null) {
			logInfo.setArtisanId(account.getArtisan().getArtisanId());
		}
		if (account.getClient() != null) {
			logInfo.setClientId(account.getClient().getClientId());
		}
		return logInfo;
	}

}
