package factorial;
public class Factorial {
    public static void main(String[] args) {
        
        	System.out.println("Hello World");
		int factorial = 1;
		int n = 7;
		for (int i = 1 ;i <=n ; i++ ){
		    factorial = 1;
		    for (int j=i;j>1 ;j-- ){
		        factorial *= j;
		    }
		    System.out.println("Factorial of "+i+" is : "+factorial);
		} 
    }
    
}
