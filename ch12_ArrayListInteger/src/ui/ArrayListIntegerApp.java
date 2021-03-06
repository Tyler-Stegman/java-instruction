package ui;

import java.util.ArrayList;
import java.util.List;

import business.Car;

public class ArrayListIntegerApp {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		
		int n1 = 75;
		
		numbers.add(n1);
		System.out.println(numbers);
		
		List<Car> cars = new ArrayList<>();
		Car c1 = new Car(1, "Jeep", "Wrangler");
		Car c2 = new Car(2, "Honda", "Pilot");
		
		cars.add(c1);
		cars.add(c2);
		
		for (Car c: cars) {
			System.out.println(c);
		}

	}

}
