
public class Customer extends Person {
	
	private String customerNumber;
	
	public Customer() {
		super();
	}

	public Customer(String firstName, String lastName, String custNbr) {
		super(firstName, lastName);
		this.customerNumber = custNbr;
	}

	public String getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	@Override
	public String toString() {
		return super.toString() + "\nCustomer Number: " + customerNumber;
	}
	
	
}
