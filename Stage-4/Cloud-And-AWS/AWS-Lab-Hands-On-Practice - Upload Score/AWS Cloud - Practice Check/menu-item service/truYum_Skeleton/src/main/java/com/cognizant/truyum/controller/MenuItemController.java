package com.cognizant.truyum.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.MenuItemService;

@RestController
@RequestMapping("/menu-items")
public class MenuItemController {
	private static final Logger LOGGER = LoggerFactory.getLogger(MenuItemController.class);
	
	@Autowired
	MenuItemService service;
	
	@GetMapping
	public List<MenuItem> getAllMenuItems()
	{
		LOGGER.info("start getAllMenuItems");
		List<MenuItem> list = service.getMenuItemListCustomer();
		System.out.println("List:" +list);
		LOGGER.info("end");
		return list;
	}
	
	@GetMapping("/{id}")
	public MenuItem getMenuItem(@PathVariable long id)
	{
		LOGGER.info("start get menu item");
		return service.getMenuItem(id);
	}
	
	@PutMapping
	public void modifyMenuItem(@RequestBody MenuItem menuItem)
	{
		LOGGER.info("modify item");
		service.modifyMenuItem(menuItem);
		LOGGER.info("End");
	}
	
	@PostMapping
	public void addItem(@RequestBody MenuItem item)
	{
		LOGGER.info("Add item");
		service.addItem(item);
		LOGGER.info("End item");
	}
	
	@GetMapping("/admin")
	public List<MenuItem> getMenuItemListAdmin()
	{
		return service.getMenuItemListAdmin();
	}

}
