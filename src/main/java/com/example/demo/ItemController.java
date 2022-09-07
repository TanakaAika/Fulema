package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ItemController {
	@Autowired
	ItemRepository itemRepository;
	
	@RequestMapping("/")
	public ModelAndView index(ModelAndView mv) {
		mv.addObject("items",itemRepository.findAll());
		mv.setViewName("index");
		return mv;
	}
}