
public class ProductManagerApp {

	public static void main(String[] args) {
		// Create an instance of product
		Product p1 = new Product("java", "Murach's Java Programming", 57.50);
		
		// print that product
		System.out.println("p1 = "+p1);
		
		// Clone the product
		Product p2 = null;
		try {
			p2 = (Product)p1.clone();
		}
		catch (CloneNotSupportedException cnse) {
			System.out.println(cnse);
		}
		System.out.println("Change price of p2");
		// change the price of the cloned product
		p2.setPrice(45.99);
		
		// print both products
		System.out.println("p1 = "+p1);
		System.out.println("p2 = "+p2);
		
	}

}
