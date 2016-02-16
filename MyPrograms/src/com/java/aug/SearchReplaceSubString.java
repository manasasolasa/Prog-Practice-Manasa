package com.java.aug;

public class SearchReplaceSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str ="this is a search and replace of substring example";
		System.out.println("the string is :"+str);
		
		String searchword = "search";
		String replaceword = "find";
		
		int startIndexVal = 0;
		int endIndexVal =0;
		
		startIndexVal = str.indexOf(searchword);
		endIndexVal = startIndexVal+searchword.length();
		
		
		
		
	}

}
