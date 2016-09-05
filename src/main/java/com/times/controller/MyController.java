package com.times.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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


}
