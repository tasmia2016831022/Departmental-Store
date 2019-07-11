package com.shop.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shop.model.Owner;
import com.shop.service.OwnerService;

@Controller
public class OwnerController {

	@Autowired
	OwnerService ownerService;

	public OwnerController() {

	}

	@ResponseBody
	@RequestMapping("/hello")
	public String Hello() {
		return "HelooSpring";
	}

	@RequestMapping("/home")
	public String Welcome(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		return "homePage";
	}

	@RequestMapping("/owner-register")
	public String registerOwner(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_OWNER_REGISTER");
		return "homePage";
	}

	@PostMapping("/save-owner")
	public String registeruser(@ModelAttribute Owner owner, BindingResult bindingResult, HttpServletRequest request) {
		ownerService.saveOwner(owner);
		request.setAttribute("mode", "MODE_OWNER_HOME");
		return "OwnerPage";
	}

	@RequestMapping("/owner-login-page")
	private String loginPage(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_OWNER_LOGIN");
		return "homePage";

	}

	@RequestMapping("/owner-login")
	public String ownerlogin(@ModelAttribute Owner owner, HttpServletRequest request)
	{
		if(ownerService.findByOwnernameAndOwnerpassword(owner.getOwnername(), owner.getOwnerpassword())!=null)
				{
					request.setAttribute("mode", "MODE_OWNER_HOME");
					return "OwnerPage";
				}
		else
		{
			//request.setAttribute("error", "Invalid Username or Password");
			System.out.println("hoinai");
			request.setAttribute("mode", "MODE_OWNER_LOGIN");
			return "homePage";
		}
	}
}
