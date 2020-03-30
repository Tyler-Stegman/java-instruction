import java.util.Scanner;

public class ContactListApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Contact List application");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter first name: ");
			String firstName = sc.next();
			sc.nextLine();
			System.out.print("Enter last name: ");
			String lastName = sc.next();
			sc.nextLine();
			System.out.print("Enter email: ");
			String email = sc.next();
			sc.nextLine();
			System.out.print("Enter phone: ");
			String phoneNumber = sc.next();
			sc.nextLine();
			System.out.println();
			System.out.println("--------------------------------------------");
			System.out.println("---- Current Contact -----------------------");
			System.out.println("--------------------------------------------");
			System.out.println("Name: "+(firstName +" "+ lastName));
			System.out.println("Email Address: "+email);
			System.out.println("Phone Number: "+phoneNumber);
			break;
			
		}
			
		
		
		
		
		
		
		
		
		System.out.println("Bye!");
		sc.close();
	}

}
