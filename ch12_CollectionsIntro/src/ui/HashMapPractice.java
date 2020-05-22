package ui;

import java.util.HashMap;

import business.Aircraft;

public class HashMapPractice {

	public static void main(String[] args) {
		
		System.out.println("Practice with HashMaps");
		HashMap<String, Aircraft> aircraftMap = new HashMap<>();
		
		Aircraft a1 = new Aircraft("Bomber", "B-17", 4);
		Aircraft a2 = new Aircraft("Bomber", "B-24", 4);
		Aircraft a3 = new Aircraft("Fighter/Bomber", "P-38", 2);
		Aircraft a4 = new Aircraft("Fighter/Bomber", "P-47", 1);
		Aircraft a5 = new Aircraft("Fighter", "P-51", 1);
		
		
		aircraftMap.put("Fighter", a3);
		System.out.println(a3.getNrOfEngines());

	}

}
