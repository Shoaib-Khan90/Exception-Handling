package ExceptionHandling;

import java.io.IOException;

public class ThrowsKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	
	readFile();
}

catch(IOException e){
	
	System.out.println("Error file not reading :");
}

	}
	
static void readFile() throws IOException{
	
	throw new IOException ("files are not found :");
}
	}

		
