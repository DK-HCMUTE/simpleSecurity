package com.shop.footwear.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController("api/v1/admin/accounts")
public class AdminController {

	@GetMapping
	public String getAccounts() {
		System.out.println("Get Accounts");
		return "Get Accounts";
	}
}
