package com.example.Stdstd.Service_impl;

import java.util.List;

import com.example.Stdstd.DataEntity.Data_entity;

public interface Design_methods {

	
	Data_entity Save(Data_entity dataentity); //create
	List<Data_entity> Fetching(); //read
	Data_entity update(Data_entity dataentity); //update
	Data_entity delete(String email_id); // delete
	
	
	
}
