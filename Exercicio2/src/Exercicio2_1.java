import java.util.Scanner;

public class Exercicio2_1 {

	public static void main(String[] args) {

		
		int a;
		
		
		
		
		
	}	
		
		
		public static int misteriosa(int a) {

	
	
	

   Scanner teclado = new Scanner(System.in);
   
   
   
   
   System.out.println("a");
   a = teclado.nextInt();
   
   if (a < 1) {
	   return  - 1;
   } else if (a == 1) {
	   return 2;
	   
   } else {
	   return (misteriosa(a-1)*misteriosa(a-2));
   }
   
   
   
	   
	   
	   
   }
		

}
}  
	
	
}