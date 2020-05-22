import java.text.NumberFormat;

public class MonthSelectorApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        // declare monthNames and monthSales arrays
        String[] monthName = new String[12];
        monthName[0] = "January";
        monthName[1] = "February";
        monthName[2] = "March";
        monthName[3] = "April";
        monthName[4] = "May";
        monthName[5] = "June";
        monthName[6] = "July";
        monthName[7] = "August";
        monthName[8] = "September";
        monthName[9] = "October";
        monthName[10] = "November";
        monthName[11] = "December";
        
        double[] monthSales = new double[12];
        monthSales[0] = 200000;
        monthSales[1] = 250000;		
        monthSales[2] = 345000;		
        monthSales[3] = 210000;		
        monthSales[4] = 150000;		
        monthSales[5] = 425000;		
        monthSales[6] = 550500;		
        monthSales[7] = 710000;		
        monthSales[8] = 625000;		
        monthSales[9] = 450500;		
        monthSales[10] = 425000;		
        monthSales[11] = 265500;
        
        // get currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // get one or more months
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            int monthNumber = Console.getInt("Enter month number: ");
            
            // validate input
            if (monthNumber < 1 || monthNumber > monthName.length) {
                Console.displayLine("Invalid month number. Try again.");
                continue;                
            }
            // get the index number for the month
            // and display the month name and sales            
            int monthIndex = monthNumber -1;
            Console.displayLine("Sales for " + monthName[monthIndex] +": "+ currency.format(monthSales[monthIndex]) + "\n");

            // check if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
        
        // display the total sales for the year
        double sum = 0.0;
      //  for(int i = 0; i < monthSales.length; i++) {
      //  	sum += monthSales[i];
      //  }
        for(double sales : monthSales) {
        	sum += sales;
        }
        
        Console.displayLine("Total sales: " + currency.format(sum));
        Console.displayLine();
    }    

}
