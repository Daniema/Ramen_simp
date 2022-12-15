package dpat_simple;
import java.util.Scanner;

public class NormalRamen {
	
	public static void size() {
		
		boolean validvalue = false;
		
		do {System.out.println("select your topping: "+ '\n' + "1. Charsiu" +
				'\n' + "2. Tempura" + '\n' + "3. Fried Tofu");
		 Scanner Sinput = new Scanner(System.in);
		    String  select = Sinput.nextLine();
			
			if (select.equals("1") ) {
				System.out.println("Normal ramen with Charsiu RM " + NormalRamenWithCharsiu.cost());
				validvalue = true;
			}else if(select.equals("2")) {
				System.out.println("Normal ramen with Tempura RM " + NormalRamenWithTempura.cost());
				validvalue = true;
			}else if(select.equals("3")) {
				System.out.println("Normal ramen with Freid Tofu RM " + NormalRamenWithFriedTofu.cost());
				validvalue = true;
			}else {
				System.out.println("Invalid input!");
			}
		
		}while(validvalue == false);
	
	}
public class NormalRamenWithTempura extends NormalRamen {
	
	public static double cost() {
		return 23.80;	
	}
	public void call() {
	    super.size();
	}
}
		
	
public class NormalRamenWithFriedTofu extends NormalRamen{
			
	public static double cost() {
		return 20.60;		
	}
	public void call() {
	    super.size();
	}
}

public class NormalRamenWithCharsiu extends NormalRamen{
	
	public static double cost() {
		return 25.50;
		
	}
	public void call() {
	    super.size();
	}

}

}
