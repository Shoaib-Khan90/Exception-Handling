package ExceptionHandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int result=10/0;
//	System.out.println(result);
}
catch(ArithmeticException e){
	System.out.println("Error : can not divide by zero");
	}
catch(NullPointerException e) {
	System.out.println("Null pointer exception :");
	}
	}

}
