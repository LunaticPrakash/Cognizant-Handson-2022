package com.cognizant.truyum.model;

import java.util.List;

public class Cart {
	private int id;
	private List<MenuItem> menuItems;
	

	private double total;

	public Cart(int id, List<MenuItem> menuItems) {
		super();
		this.id = id;
		this.menuItems = menuItems;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<MenuItem> getMenuItems() {
		return menuItems;
	}

	public void setMenuItems(List<MenuItem> menuItems) {
		this.menuItems = menuItems;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", menuItems=" + menuItems + ", total=" + total + "]";
	}


}
