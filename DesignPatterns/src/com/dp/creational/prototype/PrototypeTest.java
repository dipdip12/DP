package com.dp.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		List<String> list = new ArrayList<String>();
		Menu menu = new Menu(list);
		menu.loadMenu();
		Menu newMenu=(Menu) menu.clone();
		newMenu.getDishes().add("Parantha");
		System.out.println(menu);
		System.out.println(newMenu);
	}

}
