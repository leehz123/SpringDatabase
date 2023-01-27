package com.ezen.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.ezen.database.dto.Employee;

public interface EmployeeMapper {
	
		//private Integer employee_id;
		//private String first_name;
		//private String last_name;
		//private Double salary;
		//private Double commission_pct;
		//private String job_id;
		//private Integer department_id;
	
 
	// 모든것(*)으로 퉁치면 안 되나봄 아니 되던데??!
	@Select("SELECT employee_id, first_name, last_name, salary, commission_pct, job_id, department_id FROM employees")
	public List<Employee> getList();
	
	@Select("SELECT * FROM employees where employee_id = #{id}")
	public Employee findById(@Param("id") long id);
	
	@Select("SELECT * FROM user WHERE first_name = #{name}")
	public Employee findByName(@Param("name") String name);
	
	@Select ("select * from user where email = #{email}")
	public Employee findByEmail(@Param("email") String email);

	
}
