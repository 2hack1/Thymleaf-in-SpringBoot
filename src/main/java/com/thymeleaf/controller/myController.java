package com.thymeleaf.controller;

import java.awt.Checkbox;
import java.util.Date;
import java.util.List;

import org.springframework.objenesis.instantiator.basic.NewInstanceInstantiator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class myController {
	@GetMapping("/about")	
	public String about(Model model) {
	        model.addAttribute("name", "kapil");
	        model.addAttribute("date",new Date().toLocaleString());
		System.out.println(" it is running.....");
		
		return "about";
		
	}
     @GetMapping("/check")
public String checkLoop(Model model) {
     
       	List<String> name=List.of("kapil","aman","naman","wait");
       model.addAttribute("names", name);	
	return "check-loop";
}
     @GetMapping("/condition")
     public String CheckCondition(Model model) {
    	 boolean a=false;
    	 String ab="male";
    	 List<Integer> list = List.of(1);
    	 model.addAttribute("check",a);
    	 model.addAttribute("xender", ab);
    	 model.addAttribute("item", list);
    	 return"condition";
     }
     @GetMapping("reuse")     
     public String reUseCode(Model model) {
    	 String a="kapil";
    	 String b="agrawal";
    	 model.addAttribute("Title", a);
    	 model.addAttribute("subtitle", b);
    	 return "reuseCode";
     }
}
