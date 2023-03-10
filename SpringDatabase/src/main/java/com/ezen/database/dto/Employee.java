package com.ezen.database.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

import lombok.Data;
import lombok.NoArgsConstructor;

//data transfer object 데이터를 담아서 전송하기 위한 용도의 객체

@NoArgsConstructor //기본생성자 만들어야되나봄 
@Data
public class Employee {
	
	private Integer employee_id;
	private String first_name;
	private String last_name;
	private Double salary;
	private Double commission_pct;
	private String job_id;
	private Integer department_id;
		
	public Employee(ResultSet rs) throws SQLException {
		employee_id = rs.getInt("employee_id");
		first_name = rs.getString("first_name");
		last_name = rs.getString("last_name");
		salary = rs.getDouble("salary");
		commission_pct = rs.getDouble("commission_pct");
		job_id = rs.getString("job_id");
		department_id = rs.getInt("department_id");
	}
	

}
