package com.ezen.database.dto;

import lombok.Data;
import lombok.NoArgsConstructor;


//Mybatis�� �̿��ؼ� CRUD�� �����غ�����.
@NoArgsConstructor
@Data
public class Pizza {
	private Integer p_id;
	private String p_name;
	private Integer p_price;
	private Float p_calories;
	
	//�� mapper annotation�̶� mapperxml �� �� ����Ʈ �̾ƺ��� �ڲ� null�� ��ȯ�ϱ淡 �� �ȵǳ� �ߴ��� 
	// �������� �����ͺ��̽� �÷���� ���� �ؾߵ�;; in, name, price, calories �� �ϸ� �� �ʡڡڡڡڡڡڡڡڡ�
	
	
//���̺� CREATE�� �� ����Ŭ�� ��;;
//pizza���̺��� p_id, p_name, p_price, p_calories
		
}
