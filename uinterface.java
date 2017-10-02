import java.util.Scanner;

public class uinterface{
	public static void main(String[] Args){
		Scanner reader = new Scanner(System.in);
		try{
			Calculate calc = new Calculate();
			String exit = "NO";
			while(!exit.equals("yes")){
				System.out.print("Enter first number:");
				String first = reader.next();
				System.out.print("Enter second number:");
				String second = reader.next();
				System.out.println("Choose function:");
				String choose = reader.next();
				
				if(choose.equals("add")){
					calc.add(Double.valueOf(first), Double.valueOf(second));
					System.out.println("Your result:" + calc.getResult());
					calc.clearResult();
				}
				else if(choose.equals("sub")){
								 calc.sub(Double.valueOf(first), Double.valueOf(second));
								 System.out.println("Your result:" + calc.getResult());
								 calc.clearResult();
				}
				else if(choose.equals("div")){
								 calc.div(Double.valueOf(first), Double.valueOf(second));
								 System.out.println("Your result:" + calc.getResult());
								 calc.clearResult();
				}
				else if(choose.equals("mul")){
								 calc.mul(Double.valueOf(first), Double.valueOf(second));
								 System.out.println("Your result:" + calc.getResult());
								 calc.clearResult();
				}
				else 
								 System.out.println("Invalid choose, try again.");
				System.out.println("Exit?(YES/NO)");
				exit = reader.next();
					} 
				}finally {
				reader.close();
					}
		}
	}