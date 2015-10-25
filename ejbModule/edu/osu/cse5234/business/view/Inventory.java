package edu.osu.cse5234.business.view;
import java.util.ArrayList;

public class Inventory {
	ArrayList<Item> items = new ArrayList<Item>();

	public Inventory() {
		
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}
	
}
