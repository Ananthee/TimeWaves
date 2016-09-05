package com.times.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.times.dao.ProductDAO;
import com.times.model.Product;
@Controller
public class ProductController {

	@Autowired
	ProductDAO prod;
	
	@RequestMapping(value="/Products")
	public ModelAndView showproduct()
	{
		List<Product> list=prod.disp_product();
		return new ModelAndView("product","list",list);
		
	}
	


}
