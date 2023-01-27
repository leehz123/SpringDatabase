package com.ezen.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ezen.database.dto.Pizza;

public interface PizzaMapper {

	
	
	
	@Select("SELECT p_id, p_name, p_price, p_calories FROM pizza")
	public List<Pizza> getList();
	
	@Select("SELECT * FROM pizza WHERE p_id = #{id}")
	public Pizza findById(@Param("id") Integer id);
	
	@Select("SELECT p_id FROM pizza WHERE p_name = #{name}")
	public String findByName(@Param("name") String name);
	
	
	@Insert("INSERT INTO pizza VALUES(pizza_seq.nextval, #{name}, #{price}, #{calories})")
	public void insertMenu(@Param("name") String name, @Param("price") Integer price, @Param("calories") Float calories);
	
	@Delete("DELETE FROM pizza WHERE p_id = #{id}")
	public void deleteMenu(@Param("id") Integer id);
	
	@Update("UPDATE pizza SET p_name = #{name}, p_price = #{price}, p_calories = #{calories} WHERE p_id = #{id}")
	public void updatePizza(@Param("id") Integer id, @Param("name") String name, @Param("price") Integer price, @Param("calories") Float calories); 
	
}	
