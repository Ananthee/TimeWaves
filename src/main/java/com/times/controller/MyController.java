package com.times.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.times.model.LoginDetail;
import com.times.model.RegisterDetail;

@Controller
public class MyController {
@RequestMapping("/AboutUs")
public String showAboutUs()
{
	return "AboutUs"; 
}
@RequestMapping("/Contact")
public String showContactUs()
{
	return "Contact"; 
}
@RequestMapping(value="/Login",method=RequestMethod.GET)
public ModelAndView submitLogin(@ModelAttribute("loginDetail") LoginDetail logindetail)
{
	ModelAndView model=new ModelAndView("Login");
	return model;
}
/*@RequestMapping(value="/Register.jsp",method =RequestMethod.GET)
public ModelAndView getRegister()
{
	ModelAndView model=new ModelAndView("Register");
	return model; 
}
*/@RequestMapping(value="/Register",method =RequestMethod.GET)
public ModelAndView submitRegister(@ModelAttribute("registerDetail") RegisterDetail registerdetail) 
{
ModelAndView model=new ModelAndView("Register");
return model; 
}
}
