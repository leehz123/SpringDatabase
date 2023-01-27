package com.ezen.database;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ezen.database.mapper.PizzaMapper;

@RequestMapping("/pizza")
@Controller
public class PizzaController {

	@Autowired
	PizzaMapper pmapper;
	
	@GetMapping("/pizzaform")
	public void list(Model model) {	
		model.addAttribute("pizzas", pmapper.getList());
	}
	
	@GetMapping("/pizzamanager")
	public void pizzaManager(Model model) {
		model.addAttribute("pizzas", pmapper.getList());
	}
	
	@GetMapping("/addpizza")
	public String addPizza(Model model, HttpServletRequest req) {
		String p_name = (String) req.getParameter("p_name");
		//System.out.println("name : " + p_name);

		String price = (String) req.getParameter("p_price");
		Integer p_price = Integer.parseInt(price);
		//System.out.println("price : " + p_price);
				
		String calories = (String) req.getParameter("p_calories");
		Float p_calories = Float.parseFloat(calories);
		//System.out.println("calories : " + p_calories);
		
		
		pmapper.insertMenu(p_name, p_price, p_calories);
		return "redirect:/pizza/pizzaform";
	}
	
	@GetMapping("/deletepizza")
	public String deletePizza(Model model, HttpServletRequest req) {
		
		String id = req.getParameter("deletePizza");
		Integer p_id = Integer.parseInt(id);
		pmapper.deleteMenu(p_id);
		
		return "redirect:/pizza/pizzaform";
	}
  	
	@GetMapping("/updateselect")
	public String updateSelect(Model model, HttpServletRequest req) {
		
		String id = req.getParameter("updateselect");
		Integer p_id = Integer.parseInt(id);
		
		model.addAttribute("updatePizza", pmapper.findById(p_id));
		
		model.addAttribute("pizzas", pmapper.getList());
		
		return "/pizza/pizzamanager";
	}
	
	@GetMapping("/updatepizza")
	public String updatePizza(Model model, HttpServletRequest req) {
		
		String p_name = (String) req.getParameter("newName");
		System.out.println("name : " + p_name);

		String price = (String) req.getParameter("newPrice");
		Integer p_price = Integer.parseInt(price);
		System.out.println("price : " + p_price);
				
		String calories = (String) req.getParameter("newCalories");
		Float p_calories = Float.parseFloat(calories);
		System.out.println("calories : " + p_calories);
		
		String id = pmapper.findByName(p_name);
		Integer p_id = Integer.parseInt(id);
		
		pmapper.updatePizza(p_id, p_name, p_price, p_calories);
		return "redirect:/pizza/pizzaform";
	}
	
}
