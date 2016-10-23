package com.example.model;

import java.util.*;
import com.example.model.*;

public class ListofPeople {
	
	private static ArrayList<People> list = new ArrayList<People>();
	private static String outer = "";
	
	
	public void setPeople(String name, int cash) {
		People p = new People();
		p.setName(name);
		p.setCash(cash);
		list.add(p);
	}
	
	public static String printPeople() {
		
		
		for (People each : list ) {
			String n;
			String c;
			n = each.getName();
			c= Integer.toString(each.getCash());
			outer = outer+ " " + n + " " + c;
		}
		return outer;
	}
	
	//get item from list
	
	public People getPeople(int item) {
		return list.get(item);
	}
	
	
	

}
