package ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	
	int result = 10/2;
	
	System.out.println("Results :" + result);
}
catch(ArithmeticException e) {
	
	System.out.println("The num is divide by 2 :");
}
finally {
	
	System.out.println("This blocks alaways executes :");
}
	}

}
