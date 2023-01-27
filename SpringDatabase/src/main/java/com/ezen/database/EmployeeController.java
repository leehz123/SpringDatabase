package com.ezen.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.database.dto.Employee;
import com.ezen.database.mapper.EmployeeMapper;
import com.ezen.database.mapper.EmployeeMapperXMl;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;

@Log4j2
@RequestMapping("/employee")
@Controller
public class EmployeeController {

	
	@Autowired
	EmployeeMapperXMl xmapper;
	

//	@Autowired
//	DataSource ds;

	@Autowired
	EmployeeMapper mapper;
	
	

	
	/*
	 ��� ����� ��� ��ȸ�ؾ� �ϴ� �������� ����
	 - ��� �ذ� ������
	 - ��� ���� ���� ������
	 - ��� ���� ���� ������
	 */
	
	
	@GetMapping("/fire")
	public void file(Model model) {
		for(Employee emp : mapper.getList()) {
//			log.info(emp.getFirst_name() + "(" + emp.getSalary() + ")");
		}
	}
	
	
	//return ���� view�� ���������� �ʾƵ� views ���� ��ΰ� /employee/list.jsp�� �ǳ���?? 
	//http://localhost:8888/database/employee/list
	@GetMapping("/list")
	public void list(Model model) {
//		List<Employee> employees = new ArrayList<>();
//		
//		try(
//				Connection conn = ds.getConnection();
//				PreparedStatement pstmt = conn.prepareStatement("SELECT * FROM employees");
//				ResultSet rs = pstmt.executeQuery();
//		) {
//			
//			while(rs.next()) {
//				employees.add(new Employee(rs));
//			}
//
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		model.addAttribute("employees", employees);
		
		
		//���� �� ���� �̷��� �����ٴ� �� 
		model.addAttribute("employees", mapper.getList());
	}

	
		
//		@GetMapping("/list")
//		public void employeeList(Model model) {
//			System.out.println(xmapper.getList());
//		}
	
//		@GetMapping("/emp/new/stevan")
//		public Integer newEmployee() {
//			return xmapper.insertEmployee();
//		}
//		
//		@GetMapping("/emp/congrat/neena")
//		public Integer congratNeena() {
//			return xmapper.updateEmployee();
//		}
//			
//		@GetMapping("/emp/fire/david")
//		public Integer employeeList() {
//			return xmapper.deleteEmployee();
//		}
		
		
}
