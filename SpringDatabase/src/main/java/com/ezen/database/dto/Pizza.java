package com.ezen.database.dto;

import lombok.Data;
import lombok.NoArgsConstructor;


//Mybatis를 이용해서 CRUD를 구현해보세요.
@NoArgsConstructor
@Data
public class Pizza {
	private Integer p_id;
	private String p_name;
	private Integer p_price;
	private Float p_calories;
	
	//아 mapper annotation이랑 mapperxml 둘 다 리스트 뽑아보면 자꾸 null값 반환하길래 왜 안되나 했더니 
	// 변수명을 데이터베이스 컬럼명과 같게 해야됨;; in, name, price, calories 로 하면 안 됨★★★★★★★★★
	
	
//테이블 CREATE는 걍 오라클로 함;;
//pizza테이블의 p_id, p_name, p_price, p_calories
		
}
