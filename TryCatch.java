package ExceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
    	int[] num= {1,2,3,4,5,6,7};
    	System.out.println(num[5]);
    }
    catch(ArrayIndexOutOfBoundsException e){
    	System.out.println("Array does not exit :");
    }
    
	}

}
