import java.util.Scanner;

public class ContactListApp {

	public static void main(String[] args) {
		// print welcome message
		System.out.println("Welcome to the Contact List application");
		System.out.println();
		
		// NOTE: skipping continue loop to save time
		// get user input: String firstName, lastName, email, phoneNumber
		String fn = Console.getString("Enter first name:  ");
		String ln = Console.getString("Enter last name:  ");
		String e = Console.getString("Enter email:  ");
		String pn = Console.getString("Enter phone:  ");
		
		// Do biz logic??  Create an instance of Contact
		Contact c = new Contact(fn,ln,e,pn);
			
		// display results: Current contact display - per specs
		System.out.println(c.displayContact());

		// goodbye
		System.out.println("Bye!");
		
	}

}
