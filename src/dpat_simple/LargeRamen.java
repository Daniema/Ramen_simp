package dpat_simple;

import java.util.Scanner;

public class LargeRamen {
	
	public static void size() {
		
boolean validvalue = false;
		
		do {System.out.println("select your topping: "+ '\n' + "1. Charsiu" +
				'\n' + "2. Tempura" + '\n' + "3. Fried Tofu");
		 Scanner Sinput = new Scanner(System.in);
		    String  select = Sinput.nextLine();
			
			if (select.equals("1") ) {
				System.out.println("Large ramen with Charsiu RM " + LargeRamenWithCharsiu.cost());
				validvalue = true;
			}else if(select.equals("2")) {
				System.out.println("Large ramen with Tempura RM " + LargeRamenWithTempura.cost());
				validvalue = true;
			}else if(select.equals("3")) {
				System.out.println("Large ramen with Freid Tofu RM " + LargeRamenWithFriedTofu.cost());
				validvalue = true;
			}else {
				System.out.println("Invalid input!");
			}
		
		}while(validvalue == false);
		

	}
	
public class LargeRamenWithTempura extends LargeRamen {
	
	public static  double cost() {
		return 27.80;
		}
	
	 public void call() { 
		   super.size();
		    }
}
		
	
public class LargeRamenWithFriedTofu extends LargeRamen{
			
	public static double cost() {
		return 25.60;
		
	}
	public void call() {
	    super.size();
	}
}	

public class LargeRamenWithCharsiu extends LargeRamen{
	
	public static double cost() {
		return 30.50;
		
	}
	
	public void call() {
	    // call the size() method from the LargeRamen class
	    super.size();
	    }

}

}
