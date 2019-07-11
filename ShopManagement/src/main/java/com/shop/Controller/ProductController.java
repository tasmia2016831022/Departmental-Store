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

import com.shop.model.Product;
import com.shop.service.ProductService;


@Controller
public class ProductController {
	@Autowired
	private ProductService productService;

	@RequestMapping("/add-product")
	public String addProduct(HttpServletRequest request)
	{
		request.setAttribute("mode", "MODE_ADD_PRODUCT");
		return "OwnerPage";
	}
	
	@PostMapping("/save-product")
	public String registeruser(@ModelAttribute Product product,BindingResult bindingResult,HttpServletRequest request)
	{
		productService.saveProduct(product);;
		request.setAttribute("mode", "MODE_OWNER_HOME");
		return "OwnerPage";
	}
	
	@GetMapping("/show-product")
	public String showAllProduct(HttpServletRequest request)
	{
		request.setAttribute("products",productService.showAllProduct());
		request.setAttribute("mode", "ALL_PRODUCT");
		return "OwnerPage";
	}
	@RequestMapping("/delete-product")
	public String deleteProduct(@RequestParam String productid ,HttpServletRequest request)
	{
		productService.deleteProduct(productid);
		request.setAttribute("products", productService.showAllProduct());
		request.setAttribute("mode", "ALL_PRODUCT");
		return "OwnerPage";
	}
	
	@RequestMapping("/edit-product")
	public String editProduct(@RequestParam String productid,HttpServletRequest request) {
		productService.deleteProduct(productid);
		request.setAttribute("mode", "MODE_UPDATE");
		return "OwnerPage";
	}
}
