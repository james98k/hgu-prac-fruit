package com.example.fruit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Fruit> frt = new ArrayList<Fruit>();
		
		System.out.println("Fruit List (ordered by name)");
		
		Fruit s1 = new Fruit(101, "Apple", 1000);
		frt.add(s1);
		Fruit s2 = new Fruit(102, "orange", 1500);
		frt.add(s2);
		frt.add(new Fruit(103, "Kiwi", 2000));
		Fruit s4 = new Fruit(104, "pear", 3000);
		frt.add(s4);
		Fruit s5 = new Fruit(105, "durian", 10000);
		frt.add(s5);
		Fruit s6 = new Fruit(106, "pineapple", 12000);
		frt.add(s6);
		Fruit s7 = new Fruit(101, "banana", 1000);
		frt.add(s7);
		Fruit s8 = new Fruit(101, "kiwi", 1000);
		frt.add(s8);
		Fruit s9 = new Fruit(101, "American-Apple", 1000);
		frt.add(s9);
		Fruit s10 = new Fruit(101, "greenApple", 1000);
		frt.add(s10);
		
//		System.out.println(s2.getName());
		
		Collections.sort(frt);
		
		
		System.out.println(frt);
		
//		Collections.sort(frt, new FruitComparatorDesc());
//		
//		for(int i = 0; i < frt.size(); i++) {
//			System.out.println(frt.get(i).toString());
//		}
		
	}	

}
