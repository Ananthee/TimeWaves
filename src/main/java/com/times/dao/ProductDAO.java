package com.times.dao;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.times.model.Product;

@Repository

public class ProductDAO {
	List<Product> proList=new ArrayList<>();
	public List<Product> disp_product()
	{
		proList.add(new Product("Ti01","Titan","Sp01",25,2000,"Leather watch","Strap type"));
		proList.add(new Product("So01","Sonata","Sp02",50,2000,"Fossil klein watch","bracelet type"));
		proList.add(new Product("Ro01","Rollex","Sp03",25,2000,"Jwel statinless steel","Strap type"));
		proList.add(new Product("T01","Titan","S01",25,2000,"Leather watch","Strap type"));
		return proList;
	}
	
	

}
