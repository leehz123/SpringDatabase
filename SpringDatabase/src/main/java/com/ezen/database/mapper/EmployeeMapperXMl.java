package com.ezen.database.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ezen.database.dto.Employee;

public interface EmployeeMapperXMl {
	
	
	public List<Employee> getList();
	
	public List<Employee> getListByDept(int department_id);

	
	//XML�ε�ȣ ���� / �ڵ����� �� ����ִϱ� @Param("lower_dept")��� ������ֱ�. @Param(" ")�� �� �Ǵ� ��츸 �߰����ָ� ��. ���⼭�� �׽�Ʈ �����ߴµ� low_dept�� ã�´ٰ� ���ͼ� �߰����� ��
	public List<Employee> getListBetweenDept(@Param("lower_dept") int lower_dept, @Param("upper_dept") int upper_dept);
	
	/*
	
	 	<select id="getListBetweenDept" resultType="com.ezen.database.dto.Employee">
			SELECT * FROM employees 
			WHERE department_id BETWEEN #{lower_dept} AND #{upper_dept}
		</select> 
		�ϴ� �ε�ȣ ���� �غ��� ���� �� ��(�׽�Ʈ�޼��� MapperXMLTest�� �׽�Ʈ)  
		
	*/
	
	
	/*
	
		<select id="getListBetweenDept" resultType="com.ezen.database.dto.Employee">
			SELECT * FROM employees 
			WHERE department_id >= #{lower_dept} AND department_id <= #{upper_dept}
		</select>
		�ٵ� ������ �ε�ȣ�� ���� ���� ����
		�̰� �� XML�� �� ������ �������� �� 
	
		�׷��� �ε�ȣ�� �߻��ϴ� �κп� ���ؼ��� �Ʒ�ó�� <![CDATA[]]>�� ������ ��Ƽ� �ε�ȣ�� �� �� �ִ� �����̶�� ������� �� 
		<select id="getListBetweenDept" resultType="com.ezen.database.dto.Employee">
			SELECT * FROM employees 
			<![CDATA[WHERE department_id >= #{lower_dept} AND department_id <= #{upper_dept}]]>
		</select>
		
		
		�ƴϸ� XML ������ ���� ���� �� �� �Ǵ� �ű� ������ ���⸦ &gt; &lt; �� ��ü���ָ� ��
		WHERE department_id &gt;= #{lower_dept} AND department_id &lt;= #{upper_dept}

	 */
}
