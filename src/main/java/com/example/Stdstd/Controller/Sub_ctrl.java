package com.example.Stdstd.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class Sub_ctrl {

	@RequestMapping("/Saveformui")
	public ModelAndView Save() {
		
		ModelAndView m1= new ModelAndView("/Saveformui");
		return m1;
		}


	@RequestMapping("/updatehtml")
	public ModelAndView updateform() {
		
		ModelAndView m1 = new ModelAndView("/updatehtml");
		
		return m1;
		
	}
	

	@RequestMapping("/deletehtml")
	public ModelAndView deleteform() {
		
		ModelAndView m1 = new ModelAndView("/deletehtml");
		
		return m1;
		
	}
	








}
