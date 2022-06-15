package com.cognizant.truyum.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.dao.CartDao;
import com.cognizant.truyum.exception.CartEmptyException;
import com.cognizant.truyum.model.MenuItem;

@Service
public class CartService {
	@Autowired
	CartDao dao;

	public void addCartItem(String userId, long menuItemId)
	{
		dao.addCartItem(userId, menuItemId);
	}
	
	public List<MenuItem> getAllCartItems(String userId) throws CartEmptyException
	{
		return dao.getAllCartItems(userId);
	}
	
	public void removeCartItem(String userId, long menuItemId)
	{
		dao.removeCartItem(userId, menuItemId);
	}
}
