public class PersonManagerApp {

	public static void main(String[] args) {
		// welcome message
		System.out.println("Welcome to the Person Manager App!");
		// --continue prompt start
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {

			// prompt for input
			String type = ReferenceConsoleClass.getString("Create customer or employee? (c/e): ", "c","e");
			
			String fn = ReferenceConsoleClass.getString("First Name: ", true);
			String ln = ReferenceConsoleClass.getString("Last Name: ", true);
			// business logic
			Person p;
			if (type.equalsIgnoreCase("c")) {
				// person is a customer
				String custNbr = ReferenceConsoleClass.getString("Customer Number: ",true);
				Customer c = new Customer (fn,ln,custNbr);
				p = c;
			}
			else {
				// person is an employee
				String ssn = ReferenceConsoleClass.getString("SSN: ", true);
				Employee e = new Employee (fn,ln,ssn);
				p = e;
			}
			// display results
			System.out.println();
			System.out.println("You entered a new "+p.getClass().getName());
			System.out.println(p.toString());
			System.out.println();
			
			choice = ReferenceConsoleClass.getString("Continue? (y/n): ", "y", "n");
			// --continue prompt end
			System.out.println();
		}
		System.out.println("Thank you for using the Person Manager App!");
		// bye

	}

}
