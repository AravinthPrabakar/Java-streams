package com.aravinth.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapListConverter {

	public static void main(String args[]) {
		Map<String,List<String>> flatMap = new HashMap<>();
		List<String> stringList = new ArrayList<>();
		stringList.add("1");
		stringList.add("2");
		stringList.add("3");
		stringList.add("4");
		stringList.add("5");
		
		List<String> stringList1 = new ArrayList<>();
		stringList1.add("11");
		stringList1.add("12");
		stringList1.add("13");
		stringList1.add("14");
		stringList1.add("15");
		
		List<String> stringList2 = new ArrayList<>();
		stringList2.add("21");
		stringList2.add("22");
		stringList2.add("23");
		stringList2.add("24");
		stringList2.add("25");
		
		
		List<String> stringList3 = new ArrayList<>();
		stringList3.add("31");
		stringList3.add("32");
		stringList3.add("33");
		stringList3.add("34");
		stringList3.add("35");
		
		List<String> stringList4 = new ArrayList<>();
		stringList4.add("41");
		stringList4.add("42");
		stringList4.add("43");
		stringList4.add("44");
		stringList4.add("45");
		
		
		flatMap.put("A", stringList);
		flatMap.put("B", stringList1);
		flatMap.put("C", stringList2);
		flatMap.put("D", stringList3);
		flatMap.put("E", stringList4);
		List<String> test1 = flatMap.entrySet().stream().map(z-> z.getValue()).flatMap(Collection::stream).collect(Collectors.toList()) ;
		
		System.out.println(test1);
	}
	
}
