package dpat_simple;

import java.util.Scanner;

public class client {
  

  public static void main(String[] args) {
	
	 
	  System.out.println("Select your Ramen size:"+  '\n' + "1. Normal" + '\n' +  "2. Large" );
	  Scanner select = new Scanner(System.in);
	  String option = select.nextLine();
	  
	  for (int i = 1; i <= 3; i++) {
		  if (option.equals("1")) {
			  NormalRamen.size();
			  break;
		  }else if(option.equals("2")){
			  LargeRamen.size();
			  break;
		  }else {
			  System.out.println("Invalid option!");
		  }
	  }
	  
	  System.out.println("Enter your payment method (cash or credit card): ");
	    Scanner Cinput = new Scanner(System.in);
	    String paymen = Cinput.nextLine();
	    
	    System.out.println("Enter the amount: ");
	    Scanner Minput = new Scanner(System.in);
	    double method = Minput.nextDouble();
	    
	    // Create an instance of the Payment class
	    Payment payment = new Payment();
	    
	    // Call the pay() method on the Payment instance
	    payment.pay(method, paymen);
	    
	    
	  }
  	       
}

  //System.out.println("Enter your ramen topping: ");
  //Scanner Rinput = new Scanner(System.in);
  //String topping = Rinput.nextLine();
  
