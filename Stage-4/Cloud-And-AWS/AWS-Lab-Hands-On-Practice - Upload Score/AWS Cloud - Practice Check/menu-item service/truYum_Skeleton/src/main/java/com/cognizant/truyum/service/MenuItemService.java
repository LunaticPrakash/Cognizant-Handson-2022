package com.cognizant.truyum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.dao.MenuItemDaoCollectionImpl;
import com.cognizant.truyum.model.MenuItem;

@Service
public class MenuItemService {
	@Autowired
	MenuItemDao dao;
	
	public List<MenuItem> getMenuItemListCustomer()
	{
		return dao.getMenuItemListCustomer();
	}
	
	public MenuItem getMenuItem(long menuItemid)
	{
		return dao.getMenuItem(menuItemid);
	}
	
	public void modifyMenuItem(MenuItem menuItem) {
		//MenuItem menuItemNew = dao.getMenuItem(menuItem.getId());
		//menuItemNew=menuItem;
		dao.modifyMenuItem(menuItem);
	}
	
	public void addItem(MenuItem item)
	{
		dao.addItem(item);
	}
	
	public List<MenuItem> getMenuItemListAdmin()
	{
		return dao.getMenuItemListAdmin();
	}

}
