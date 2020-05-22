package ch02_StudentRegistrationProject;

import java.util.Scanner;

public class StudentRegistrationApp {

	public static void main(String[] args) {
		System.out.println("Student Registration Form");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("First name: ");
		String firstName = sc.next();
		System.out.print("Last name: ");
		String lastName = sc.next();
		System.out.print("Year of birth: ");
		String birthDate = sc.next();
		System.out.println();
		System.out.print("Welcome "+firstName+" "+lastName+"!");
		System.out.println();
		System.out.println("Your registration is complete.");
		System.out.println("Your temporary password is: "+firstName+"*"+birthDate);
		}
}	



