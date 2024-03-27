package com.example.Stdstd.Service_impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import com.example.Stdstd.DataEntity.Data_entity;


@Service
public class Service_logics implements Design_methods {

	@Autowired
	Data_entity dataentity;
	
	@Autowired
	JdbcTemplate jdbctemplate;
	

	@Override
	public Data_entity Save(Data_entity dataentity) {
		// TODO Auto-generated method stub
		
		String SQL  = "insert into tcscompany values(?,?,?,?,?)";
		
		jdbctemplate.update(SQL,dataentity.getFirst_name(),dataentity.getLast_name(),dataentity.getEmail_id(),dataentity.getEmp_id(),dataentity.getContact());
		
		return dataentity;
	}

	@Override
	public List<Data_entity> Fetching() {
		
		
		// TODO Auto-generated method stub
		
		String SQL1 = "select * from tcscompany";
		return 	jdbctemplate.query(SQL1, new RowMapper() {

			@Override
			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				Data_entity data = new Data_entity();
				data.setFirst_name(rs.getString("first_name"));
				data.setLast_name(rs.getString("last_name"));
				data.setEmail_id(rs.getString("email_id"));
				data.setEmp_id(rs.getString("emp_id"));
				data.setContact(rs.getString("contact"));
				return data;
			}
		});
		
	}

	@Override
	public Data_entity update(Data_entity dataentity) {
		// TODO Auto-generated method stub
		String SQL2 = "update tcscompany set first_name=?,last_name=?,emp_id =?,contact =? where email_id=?";
		
		jdbctemplate.update(SQL2,dataentity.getFirst_name(),dataentity.getLast_name(),dataentity.getEmp_id(),dataentity.getContact(),dataentity.getEmail_id());
		return dataentity;
	}

	@Override
	public Data_entity delete(String email_id) {
		// TODO Auto-generated method stub
		
		String SQL3 = "delete from tcscompany where email_id =?";
		
		jdbctemplate.update(SQL3,dataentity.getEmail_id());
		return dataentity;
	}

}
