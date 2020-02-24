package com.bw.jcartadministratorback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bw.jcartadministratorback.dto.in.AdministratorLoginInDTO;
import com.bw.jcartadministratorback.dto.in.AdministratorUpdateProfileInDTO;
import com.bw.jcartadministratorback.dto.out.AdministratorGetProfileOutDTO;

@RestController
@RequestMapping("/administrator")
public class AdministratorController {

	@GetMapping("/login")
	public String login(AdministratorLoginInDTO administratorLoginInDTO) {
		return null;
	}
	
	@GetMapping("/getProfile")
	public AdministratorGetProfileOutDTO getProfileOutDTO(Integer adminstratorId) {
		return null;
	}
	
	@GetMapping("/updateProdfile")
	public void updateProdfile(@RequestBody AdministratorUpdateProfileInDTO administratorUpdateProfileInDTO) {
		
	}
}
