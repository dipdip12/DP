package com.dp.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Menu {

	private List<String> dishes;
	
	public Menu(List<String> d){
		this.dishes=d;
	}
	
	public void loadMenu(){
		dishes.add("Salad");
		dishes.add("Paneer");
		dishes.add("Chicken");
		dishes.add("Mushroom");
	}

	public List<String> getDishes() {
		return dishes;
	}

	public void setDishes(List<String> dishes) {
		this.dishes = dishes;
	}
	
	
	public Object clone() throws CloneNotSupportedException{
		List<String> temp = new ArrayList<String>();
		for(String s:dishes)
			temp.add(s);
		return new Menu(temp);
	}

	@Override
	public String toString() {
		return "Menu [dishes=" + dishes + "]";
	}
	
	
}
