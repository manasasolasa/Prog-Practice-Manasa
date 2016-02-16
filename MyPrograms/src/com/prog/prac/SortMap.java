package com.prog.prac;

//import java.util.Collection;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
//import java.util.HashMap;
import java.util.Map;
//import java.util.Set;
import java.util.Set;

public class SortMap implements Comparator<String>{

	Map<String, Integer> map;
	
	public void ValueComparator(Map<String, Integer> base){
		this.map = base;
	}
	
	public int compare(String a, String b){
		if(map.get(a) >= map.get(b)){
			return -1;
		}else {
			return 1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> myMap = new HashMap<>();
		myMap.put(1, "jan");
		myMap.put(2, "feb");
		myMap.put(3, "march");
		
		for(Map.Entry map: myMap.entrySet()){
			System.out.println(map.getKey() + " "+ map.getValue());
		}
		
		Set<Integer> set = myMap.keySet();
		for(Integer integer : set)
		{
			System.out.println(integer);
		}
		
		Collection<String> values = myMap.values();
		for(String string:values)
		{
			System.out.println(string);
		}
		
		
	}

}
