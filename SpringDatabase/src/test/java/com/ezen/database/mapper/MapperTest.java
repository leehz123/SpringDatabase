package com.ezen.database.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ezen.database.dto.Employee;

import lombok.extern.log4j.Log4j2;

@Log4j2
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
	"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
	"file:src/main/webapp/WEB-INF/spring/root-context.xml"
})
public class MapperTest {

	@Autowired
	EmployeeMapper mapper;
	
	@Autowired
	PizzaMapper pMapper;
	
//	@Test
//	public void test() {
//		List<Employee> employees = mapper.getList();
//		
//		for(Employee emp : employees) {
//			log.info(emp.getFirst_name() + " " + emp.getLast_name());
//		}
//	}
	@Ignore
	@Test
	public void getAllEmployees() {
		List<Employee> employees = mapper.getList();
//		
//		for(Employee emp : employees) {
//			log.info(emp.getFirst_name() + " " + emp.getLast_name());
//		}
		
		assertEquals(107, employees.size()); 
	}	
	
	@Ignore
	@Test
	public void findById() {
		Employee emp = mapper.findById(103);
		log.info(emp);
		assertNotNull(emp);
	}

	//@Ignore
	@Test
	public void getAllPizza() {
		//assertEquals(3, pMapper.getList().size());
		
		log.info(pMapper.getList());
		//log.info(pMapper.findById(1));
	}
}
