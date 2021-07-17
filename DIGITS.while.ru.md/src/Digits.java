
public class Digits {

	public static void main(String[] args) {
		
		int n = 1;
		
	    while( n <= 9 ) {
	    	if(n%3==0) {
	    		System.out.print(n+ "\n");
	    	}else {
	    		System.out.print(n + " ");
	    	}
	        n++;
	    }
	    
	    //EX 2
	    
	    int rows = 4;
	    int number = 1;
	    int count = 1;
	    
		System.out.println();
	    while( count <= rows ) {
	    	int x = 1;
	    	while( x <= count) {
	    		
	    		System.out.print(number + " ");
	    		number++;
	    		x++;
	    	}
	    	
	    	System.out.println();
	    	count++;
	        
	        
	    }

	}

}
