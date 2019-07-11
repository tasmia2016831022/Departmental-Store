package com.shop.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.model.Supplier;
import com.shop.service.SupplierService;


@Controller
public class SupplierController {
	
	@Autowired
	private SupplierService supplierService;

	@RequestMapping("/add-supplier")
	public String addSupplier(HttpServletRequest request)
	{
		request.setAttribute("mode", "MODE_ADD_SUPPLIER");
		return "OwnerPage";
	}
	
	@PostMapping("/save-supplier")
	public String registeruser(@ModelAttribute Supplier supplier,BindingResult bindingResult,HttpServletRequest request)
	{
		supplierService.saveSupplier(supplier);
		request.setAttribute("mode", "MODE_OWNER_HOME");
		return "OwnerPage";
	}
	
	@GetMapping("/show-supplier")
	public String showAllSuppliers(HttpServletRequest request)
	{
		request.setAttribute("suppliers",supplierService.showAllSupplier());
		request.setAttribute("mode", "ALL_SUPPLIERS");
		return "OwnerPage";
	}
	@RequestMapping("/delete-supplier")
	public String deleteSupplier(@RequestParam  String supplierphone ,HttpServletRequest request)
	{
		supplierService.deleteSupplier(supplierphone);
		request.setAttribute("users", supplierService.showAllSupplier());
		request.setAttribute("mode", "ALL_SUPPLIERS");
		return "OwnerPage";
	}
	
	@RequestMapping("/edit-supplier")
	public String editUser(@RequestParam String supplierphone,HttpServletRequest request) {
		supplierService.deleteSupplier(supplierphone);
		request.setAttribute("mode", "MODE_UPDATE_SUPPLIER");
		return "OwnerPage";
	}

}
