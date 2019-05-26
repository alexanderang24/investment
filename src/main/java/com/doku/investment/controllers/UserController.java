package com.doku.investment.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.doku.investment.dto.IndustryDto;
import com.doku.investment.dto.PropertyDto;
import com.doku.investment.dto.UserDetailDto;
import com.doku.investment.dto.UserDto;
import com.doku.investment.mappers.PropertyMapper;
import com.doku.investment.mappers.UserDetailMapper;
import com.doku.investment.repositories.PropertyRepository;
import com.doku.investment.repositories.UserDetailRepository;
import com.doku.investment.repositories.UserRepository;
import com.doku.investment.services.IndustryServices;

/**
 * @author Laurence
 * @see Controller, GetMapping, PostMapping
 * <p>
 * Controller For Handle User Request
 * <p>
 * Anotation Controller is for create a Mapping of model object and find a view
 * <p>
 * Anotation Autowired is This annotation allows Spring to resolve and inject collaborating beans into your bean
 * This anotation related to anotation Service from package service.impl
 * <p>
 * Anotation GetMapping is the newer annotation
 * for RequestMapping(method = RequestMethod.GET), used to map web requests onto specific handler classes and/or handler methods.
 * <p>
 * Anotation PostMapping is the newer annotation
 * for RequestMapping(method = RequestMethod.POST), used to map web requests onto specific handler classes and/or handler methods.
 */
@Controller
public class UserController {
    
	@Autowired 
	IndustryServices industryServices;
	
	@Autowired 
	PropertyRepository propertyRepository;

	@Autowired 
	UserRepository userRepository;

	@Autowired 
	UserDetailRepository userDetailRepository;
	
    @GetMapping("/signup")
    public String showSignUpForm(Model model) {
    	
    	List<IndustryDto> industries = industryServices.getListIndustry();
    	
    	List<PropertyDto> propertiesDto = PropertyMapper.INSTANCE.toListProperty(propertyRepository.findAll());
    	    	
    	model.addAttribute("industries", industries);
    	model.addAttribute("properties", propertiesDto);
    	
        return "register";
    }
    
    @PostMapping("/profile")
    public String profile(Model model) {
    	
    	int idUser = 1;
    	
    	UserDetailDto profile = UserDetailMapper.INSTANCE.userDetailToUserDetailDto(userDetailRepository.findByUserId(idUser));
    	
    	model.addAttribute("profile", profile);
        return "profile";
    }
    
    
    
    
    @PostMapping("/adduser")
    public String addUser(@Valid UserDto user, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "register";
        }
        
//        userRepository.save(user);
        model.addAttribute("users", userRepository.findAll());
        return "index";
    }
    
    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
//        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
//        model.addAttribute("user", user);
        return "update-user";
    }
    
//    @PostMapping("/update/{id}")
//    public String updateUser(@PathVariable("id") int id, @Valid User user, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            user.setId(id);
//            return "update-user";
//        }
//        
//        userRepository.save(user);
//        model.addAttribute("users", userRepository.findAll());
//        return "index";
//    }
    
    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
//        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user Id:" + id));
//        userRepository.delete(user);
//        model.addAttribute("users", userRepository.findAll());
        return "index";
    }
}