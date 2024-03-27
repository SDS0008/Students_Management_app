package com.example.Stdstd.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.Stdstd.DataEntity.Data_entity;
import com.example.Stdstd.Service_impl.Service_logics;

@RestController
public class Con_troller {

	@Autowired
	Service_logics servlogics;
	
	@Autowired
	Data_entity dataentity;
	
	@RequestMapping("/SAVE")
	public String SaveForm(@RequestParam String first_name,@RequestParam String last_name,@RequestParam String email_id,@RequestParam String emp_id,@RequestParam String contact) {
		
		

		dataentity.setFirst_name(first_name);
		dataentity.setLast_name(last_name);
		dataentity.setEmail_id(email_id);
		dataentity.setEmp_id(emp_id);
		dataentity.setContact(contact);
		
		
		servlogics.Save(dataentity);
		
		return "something";
		
	}
	
	@RequestMapping("/FETCH")
	public ModelAndView fetching() {
		List<Data_entity> DE = servlogics.Fetching();
		return new ModelAndView("fetchinghtml","tcscompany",DE);
		//fetchinghtml is frontend page name.
		//tcscompany is table name.
		//DE is list object.
		
	}
	
	@RequestMapping("update")
	public String updating(@RequestParam String first_name,@RequestParam String last_name,@RequestParam String email_id,@RequestParam String emp_id,@RequestParam String contact) {
		dataentity.setFirst_name(first_name);
		dataentity.setLast_name(last_name);
		dataentity.setEmail_id(email_id);
		dataentity.setEmp_id(emp_id);
		dataentity.setContact(contact);
		
		
		servlogics.update(dataentity);
		
		return "something";
		
	}
	
	@RequestMapping("delete")
	public String deleting(@RequestParam  String email_id ) {
		
	dataentity.setEmail_id(email_id);
		
	servlogics.delete(email_id);
	return "something";
}
}
