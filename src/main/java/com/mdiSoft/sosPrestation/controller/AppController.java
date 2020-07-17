package com.mdiSoft.sosPrestation.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//import javax.validation.Valid;

import org.springframework.http.ResponseEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mdiSoft.sosPrestation.service.*;
import com.mdiSoft.sosPrestation.entities.*;
import com.mdiSoft.sosPrestation.dto.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AppController {
	
	@Autowired
	private AccountService accountService;
	
	@Autowired
	private AddressService addressService;
	
	@Autowired
	private ArtisanService artisanService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private CommentService commentService;
	
	@Autowired
	private PictureService pictureService;
	
	@Autowired
	private ServiceInterventionService serviceInterventionService;
	
	@Autowired
	private ServiceOfferService serviceOfferService;
	
	@Autowired
	private ServiceProposalService serviceProposalService;
	
	@Autowired
	private ServiceService serviceService;
	
	@PostMapping("/login")
	public LoginInformation login (@RequestBody AccountInformation account) {
		LoginInformation data = accountService.getAccountByUsernameAndPassword(account);
		return data;
	}
	
	@PostMapping("/saveClient")
    public void saveClient(@RequestBody AccountInformation data) {
        clientService.saveClient(data);
    }
		
	@PostMapping("/getClientData")
	public AccountInformation getClientData(@RequestBody Account account) {
		AccountInformation data = accountService.getAccountbyId(account);
		return data;
	}
	
	@PostMapping("/updateClient")
	public void updateClient(@RequestBody AccountInformation data) {
		clientService.updateClient(data);
	}
	
	@GetMapping("/getAllCategories")
    public List<Category> getAllCategories() {
        return categoryService.getAllCategories();
    }
	
	@PostMapping("/getServicesByCategory")
    public List<Service> getServicesByCategory(@RequestBody Category category) { 
        return serviceService.getAllServiceByCategory(category);
    }
	
	@PostMapping("/createServiceOffer")
    public void createServiceOffer(@RequestBody ServiceOfferInformation data) { 
        serviceOfferService.saveServiceOffer(data);
    }
	
	@PostMapping("/getServiceOffersByClient")
	public List<ServiceOfferInformation> getServiceOffersByClient (@RequestBody Client client){
		return serviceOfferService.getServiceOffersByClient(client);
	}
	
	@PostMapping("/getServiceOfferById")
	public ServiceOfferInformation getServiceOfferById (@RequestBody ServiceOfferInformation serviceOfferInformation){
		return serviceOfferService.getServiceOfferInformationById(serviceOfferInformation);
	}
	
	@PostMapping("/updateServiceOffer")
    public void updateServiceOffer(@RequestBody ServiceOfferInformation data) { 
        serviceOfferService.updateServiceOffer(data);
    }
	
	/*------------------------------------------------>>>>ARTISAN<<<<---------------------------------------------------------------*/
	
	@PostMapping("/saveArtisan")
    public void saveArtisan(@RequestBody AccountInformation data) {
        artisanService.saveArtisan(data);
    }
	
	@PostMapping("/getArtisanData")
	public AccountInformation getArtisanData(@RequestBody Account account) {
		AccountInformation data = accountService.getAccountbyId(account);
		return data;
	}
	
	@PostMapping("/updateArtisan")
	public void updateArtisan(@RequestBody AccountInformation data) {
		artisanService.updateArtisan(data);
	}
	
	@PostMapping("/saveServiceIntervention")
	public void saveServiceIntervention(@RequestBody ServiceInterventionInformation data) {
		serviceInterventionService.saveServiceIntervention(data);
	}
	
	@PostMapping("/updateServiceIntervention")
	public void updateServiceIntervention(@RequestBody ServiceInterventionInformation data) {
		System.out.println(data.getAddress());
		serviceInterventionService.updateServiceIntervention(data);
	}
	
	@PostMapping("/getAllServiceIntervention")
	public List<ServiceInterventionInformation> getAllServiceIntervention(@RequestBody ServiceInterventionInformation data) {
		return serviceInterventionService.getAllByArtisan(data);
	}
	
	@PostMapping("/getServiceInterventionById")
	public ServiceInterventionInformation getServiceInterventionById (@RequestBody ServiceInterventionInformation data){
		return serviceInterventionService.getServiceInterventionInformationById(data);
	}
	
	@GetMapping("/getAllServiceOffers")
    public List<ServiceOfferInformation> getAllServiceOffers() {
		return serviceOfferService.getAllServiceOffers();
    }
	
	@PostMapping("/saveServiceProposal")
	public void saveServiceProposal(@RequestBody ServiceProposalInformation data) {
		serviceProposalService.saveServiceProposal(data);
	}
	
	@PostMapping("/updateServiceProposal")
	public void updateServiceProposal(@RequestBody ServiceProposalInformation data) {
		//System.out.println(data);
		serviceProposalService.updateServiceProposal(data);
	}
	
	@PostMapping("/getAllServiceProposalByArtisan")
	public List<ServiceProposalInformation> getAllServiceProposalByArtisan(@RequestBody ServiceProposalInformation data) {
		return serviceProposalService.getAllServiceProposalByArtisan(data);
	}
	
	@PostMapping("/getAllServiceProposalByServiceOffer")
	public List<ServiceProposalInformation> getAllServiceProposalByServiceOffer(@RequestBody ServiceProposalInformation data) {
		return serviceProposalService.getAllServiceProposalByServiceOffer(data);
	}
	
	@PostMapping("/getAllServiceProposalByClient")
	public List<ServiceProposalInformation> getAllServiceProposalByClient(@RequestBody ServiceProposalInformation data) {
		return serviceProposalService.getAllServiceProposalByClient(data);
	}
	
	@PostMapping("/getServiceProposalById")
	public ServiceProposalInformation getServiceProposalById(@RequestBody ServiceProposalInformation data) {
		return serviceProposalService.getServiceProposalById(data);
	}
	

}
