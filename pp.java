public class pp {

	     public static  void main(String[] args) {
	     	 
	     	 int a = 7;
	     	 int b = 8;
	     	 int c = 9
;

	     	 if (a < b &&  b < c) {
              
              System.out.print(c);
              System.out.println(" ,C possui o maior valor");
	     	 } 
	     	 else if (a > b && b < c){
	     	 	  System.out.print(c);
            System.out.println(" ,A possui maior valor");
	     	 }
	     
         else if (b > c && c > a){
         	System.out.print(c);
          System.out.println(" ,B possui > valor");
         }
         else if (a ==b && b == c){
         	System.out.println(" ,possui valores iguais)");
         }
	     } 

}
