package tests;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		ArrayList<String> tools = new ArrayList<String>();
		
		tools.add("selenium");
		tools.add("jira");
		tools.add("testng");
		tools.add("junit");
		
		System.out.println(tools.size());
		
		tools.add("git");
		
		System.out.println(tools.size());
		
		/*System.out.println(tools.get(0));
		System.out.println(tools.get(1));
		System.out.println(tools.get(2));
		System.out.println(tools.get(3));
		System.out.println(tools.get(4));
		System.out.println("******");*/
		
		for (int i=0; i<tools.size(); i++) {
			System.out.println(tools.get(i));
			
		}
		
		tools.remove("junit");
		System.out.println(tools.size());
		System.out.println(tools.get(3));
		
	}

}
