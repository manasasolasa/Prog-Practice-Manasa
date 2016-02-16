package com.prog.prac;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapEx {

	//create map
	static void createMap()
	{
		HashMap<Integer,String> mymap = new HashMap<Integer, String>();
		mymap.put(101,"abc");
		mymap.put(102,"bcd");
		mymap.put(103,"def");
		mymap.put(104,"efg");
		mymap.put(105,"fgh");
		
		for(Map.Entry<Integer,String> map : mymap.entrySet()){
			System.out.println(map.getKey() + " " +map.getValue());
		}
		
		//to get all keys from the map
		System.out.println("the keys of the map are:");
		Set<Integer> set = mymap.keySet();
		for(Integer integer: set){
			System.out.println(integer);
		}
		//to get all values from the map
		System.out.println("the values of the map are:");
		Collection<String> values = mymap.values();
		for(String string: values){
			System.out.println(string);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MapEx.createMap();
	}

}
