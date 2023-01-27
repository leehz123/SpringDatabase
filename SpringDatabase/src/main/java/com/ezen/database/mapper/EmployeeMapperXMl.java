package com.ezen.database.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ezen.database.dto.Employee;

public interface EmployeeMapperXMl {
	
	
	public List<Employee> getList();
	
	public List<Employee> getListByDept(int department_id);

	
	//XML부등호 예시 / 자동으로 안 잡아주니까 @Param("lower_dept")라고 명시해주기. @Param(" ")은 안 되는 경우만 추가해주면 됨. 여기서는 테스트 실행했는데 low_dept못 찾는다고 나와서 추가해준 거
	public List<Employee> getListBetweenDept(@Param("lower_dept") int lower_dept, @Param("upper_dept") int upper_dept);
	
	/*
	
	 	<select id="getListBetweenDept" resultType="com.ezen.database.dto.Employee">
			SELECT * FROM employees 
			WHERE department_id BETWEEN #{lower_dept} AND #{upper_dept}
		</select> 
		일단 부등호 없이 해보면 실행 잘 됨(테스트메서드 MapperXMLTest로 테스트)  
		
	*/
	
	
	/*
	
		<select id="getListBetweenDept" resultType="com.ezen.database.dto.Employee">
			SELECT * FROM employees 
			WHERE department_id >= #{lower_dept} AND department_id <= #{upper_dept}
		</select>
		근데 문제는 부등호를 쓰고 싶을 때임
		이건 걍 XML에 쓸 때부터 빨간줄이 뜸 
	
		그래서 부등호가 발생하는 부분에 대해서는 아래처럼 <![CDATA[]]>로 영역을 잡아서 부등호를 쓸 수 있는 영역이라고 정해줘야 함 
		<select id="getListBetweenDept" resultType="com.ezen.database.dto.Employee">
			SELECT * FROM employees 
			<![CDATA[WHERE department_id >= #{lower_dept} AND department_id <= #{upper_dept}]]>
		</select>
		
		
		아니면 XML 내에서 꺽쇄 쓰는 게 안 되는 거기 때문에 꺽쇄를 &gt; &lt; 로 대체해주면 됨
		WHERE department_id &gt;= #{lower_dept} AND department_id &lt;= #{upper_dept}

	 */
}
