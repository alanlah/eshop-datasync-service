package com.eshop.eureka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eshop.eureka.service.EshopProductService;

@RestController
public class DatasyncController {
	@Autowired
	private EshopProductService eshopProductService;
	@RequestMapping("/findBrandById")
	@ResponseBody
	
	public String findBrandById(Long id){
		return eshopProductService.findBrandById(id);
	}
}
