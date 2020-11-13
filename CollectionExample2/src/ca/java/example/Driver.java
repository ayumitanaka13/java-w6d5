package ca.java.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Driver {
	
	public static void main(String[] args) {
		HashSet<String> setString = new HashSet<String>();
		setString.add("Allen");
		setString.add("John");
		setString.add("John");
		setString.add("Sarah");
		
		for (String s : setString) {
			System.out.println(s);
		}
		
//      Output
//		Sarah
//		John
//		Allen
		
		SortedSet<String> treeString = new TreeSet<String>();
		treeString.add("AAA");
		treeString.add("BBB");
		treeString.add("AAA");
		treeString.add("ZZZ");
		treeString.add("CCC");
		
		System.out.println();
		for (String s : treeString) {
			System.out.println(s);
		}
		
//		Output
//		AAA
//		BBB
//		CCC
//		ZZZ
		
		HashMap<String, String> contactList = new HashMap<>();
		contactList.put("John Doe", "111 111 1111");
		contactList.put("Jane Doe", "222 222 2222");
		contactList.put("Ayumi Tanaka", "333 333 3333");
		
		System.out.println();
		System.out.println(contactList.containsKey("Ayumi Tanaka"));
		System.out.println("The phone number is : " + contactList.get("John Doe"));
		
		Set<String> names = contactList.keySet();
		System.out.println();
		for (String s : names) {
			System.out.println(s);
		}
		
		System.out.println();
		for(Map.Entry<String, String> entry : contactList.entrySet()) {
			System.out.println("Name : " + entry.getKey() +
					"\nPhone Number : " + entry.getValue());
		}
		
		//ask user
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the name");
		String name = input.nextLine();
		
		if(contactList.containsKey(name)) {
			System.out.println(contactList.get(name));			
		} else {
			System.out.println("We do not have this name of person. Let's add it.");
			System.out.println("Enter the phone number int format 000 000 0000");
			String number = input.nextLine();
			contactList.put(name, number);
			
			System.out.println();
			for(Map.Entry<String, String> entry : contactList.entrySet()) {
				System.out.println("Name : " + entry.getKey() +
						"\nPhone Number : " + entry.getValue());
		}
		}
	
//		Output
//		true
//		The phone number is : 111 111 1111
//		John Doe
//		Ayumi Tanaka
//		Jane Doe
//		
//		Name : John Doe
//		Phone Number : 111 111 1111
//		Name : Ayumi Tanaka
//		Phone Number : 333 333 3333
//		Name : Jane Doe
//		Phone Number : 222 222 2222

	}
	
}
