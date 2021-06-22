package com.bk.api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Search {
	
	
	@RequestMapping(value="/getUser", method=RequestMethod.GET)
	public String getUser() {
		System.out.println(" =====> log");
		return "Hi From ..";
	}
	

}
