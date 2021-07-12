import java.util.Scanner ;

public class index
{
	public static void main(String[] args)
	{
		Integer n ;
		boolean b ;
		Integer s = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter N:"); 

		try{
		
			n = sc.nextInt();

		} catch ( Exception e){
		
			System.out.println("N must be a number");
			/*
			do {
				
				System.out.println("Please enter N");
				n = sc.nextInt();
				b = n instanceof Integer; 

				} while (!b );
				

		}  
*/
		for (Integer i = 0; i <= n ; i++ ) {
		
				s += i;
		
		}
		System.out.println("Sum of 1 ... " +n+ " is : " +s);
		/* 
		boolean a = n instanceof Integer; 
		boolean b ;
		Integer s = 0;
			if (!a) {
				System.out.println("N must be an Integer");
				do {
					System.out.println("Please enter N");
					n = sc.nextInt();
					b = n instanceof Integer; 

				} while (!b );
			}
			for (Integer i = 0; i <= n ; i++ ) {
				s += i;
			}
			System.out.println("Sum of 1 ... " +n+ " is : " +s);
		*/ 
	}
	
}