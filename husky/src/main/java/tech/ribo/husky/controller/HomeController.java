package tech.ribo.husky.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() throws InterruptedException {
		return "Hello World!<br/>--From Husky.";
	}

	@RequestMapping(value = "/local", method = RequestMethod.GET)
	public String local(HttpServletRequest req) {
		return req.getLocalAddr() + ":" + req.getLocalPort() + "<br/>" + req.getLocalName();
	}
}
