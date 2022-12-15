package dpat_simple;

public class Payment {
	  public void pay(double d, String method) {
	    if (method.equalsIgnoreCase("cash")) {
	      System.out.println("Paying with cash: $" + d);
	      
	    } else if (method.equalsIgnoreCase("credit card")) {
	      System.out.println("Paying with credit card: $" + d);
	      
	    }
	    
	  }
	  
}

