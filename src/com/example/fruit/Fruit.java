package com.example.fruit;
import java.util.Comparator;

public class Fruit implements Comparable <Fruit>{
	int no;
	String name;
	int price;
	
	
	public Fruit(int no, String name, int price) {
		// TODO Auto-generated constructor stub
		super();
		this.no = no;
		this.name = name;
		this.price = price;
		
	}

	@Override
	public String toString() {
		return "Fruit [no=" + no + ", name=" + name + ", price=" + price + "]";
	}
	
	@Override
	public int compareTo(Fruit f1) {
		return name.compareTo(f1.name);
	}
	
	
}


