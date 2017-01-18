package tech.ribo.goldenRetriever.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tech.ribo.goldenRetriever.feign.HuskyFeign;

@RestController
public class HomeController {
	Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private HuskyFeign huskyFeign;

	@RequestMapping("/")
	public String index() {
		return huskyFeign.index();
	}
	
	@RequestMapping("/husky")
	public String husky(){
		return huskyFeign.husky();
	}
}
