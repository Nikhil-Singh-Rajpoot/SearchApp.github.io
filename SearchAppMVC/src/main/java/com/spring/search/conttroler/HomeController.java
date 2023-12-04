package com.spring.search.conttroler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		System.out.println("Hyy Home page is Ready!");
		return "home";
	}
	
	@RequestMapping(path = "search", method = RequestMethod.GET)
	public RedirectView search(@RequestParam("query") String query){
		RedirectView redirectView = new RedirectView();
		String url = "https://www.google.com/search?q="+query;
		redirectView.setUrl(url);
		return redirectView;
	}
	
}
