package ExceptionHandling;

public class ThrowingException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//try {
//	
//	checkAge(18);
//	
//}
//catch(Exception e){
//	System.out.println(e.getMessage());
//}
//	}
//	
//	static void checkAge(int age) throws Exception {
//		if(age < 20) {
//			throw new Exception ("Age must be 20 or older :");
//		}
//	
		
		try {
			
			checkLimit(23);
		}
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

	static void checkLimit (int limit) throws Exception{
		
		if (limit <=25) {
			
			throw new Exception ("Limit must be 25 or older :");
		}
	}
}
