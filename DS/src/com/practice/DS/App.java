package com.practice.DS;

public class App {

	public static void main(String[] args) {
		LinkedList<String> names = new LinkedList<>();
		names.insert("Harry");
		names.insert("Ron");
		names.insert("John");
		
		names.traverse();
		
		names.remove("Ron");
		
		names.traverse();

	}

}
