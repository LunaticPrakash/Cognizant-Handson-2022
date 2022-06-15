package com.cognizant.truyum.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cognizant.truyum.exception.CartEmptyException;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.model.Cart;

@Component
public class CartDaoCollectionImpl implements CartDao {
	private static HashMap<String, Cart> userCarts;

	public CartDaoCollectionImpl() {
		super();
		if (userCarts == null) {
			userCarts = new HashMap<String, Cart>();
		}
	}

	@Override
	public void addCartItem(String userId, long menuItemId) {
		MenuItemDao menuItemDao = new MenuItemDaoCollectionImpl();
		MenuItem menuItem = menuItemDao.getMenuItem(menuItemId);
		if (userCarts.containsKey(userId)) {
			List<MenuItem> menuItemList = userCarts.get(userId).getMenuItems();
			menuItemList.add(menuItem);
		} else {
			Cart cart = new Cart(0, new ArrayList<MenuItem>());
			cart.getMenuItems().add(menuItem);
			userCarts.put(userId, cart);
			System.out.println(userCarts);
		}
	}

	@Override
	public List<MenuItem> getAllCartItems(String userId) throws CartEmptyException {
		if (userCarts.containsKey(userId)) {
			List<MenuItem> menuItemList = userCarts.get(userId).getMenuItems();
			if (menuItemList.isEmpty()) {
				throw (new CartEmptyException("Cart Empty!"));
			} else {
				double total = 0.0;
				for (int i = 0; i < menuItemList.size(); i++) {
					total += menuItemList.get(i).getPrice();
				}
				System.out.println(total);
				userCarts.get(userId).setTotal(total);
			
				
			
			}
			return menuItemList;
		} else {
			throw (new CartEmptyException("Cart Empty!"));
		}
	}

	@Override
	public void removeCartItem(String userId, long menuItemId) {
		List<MenuItem> menuItemList = userCarts.get(userId).getMenuItems();
		for (int i = 0; i < menuItemList.size(); i++) {
			if (menuItemList.get(i).getId() == menuItemId) {
				menuItemList.remove(i);
			
				break;
			}
		}
	}
		
	

}
