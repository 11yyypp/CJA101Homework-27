package hw1;

public class Q2 {
	public static void main(String[] args) {
	//2.請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
	
		int egg = 200, adozen = 12;
	    int dozen = egg / adozen;
		int k = egg %= adozen;
		    
		System.out.println(dozen + "打" + k + "顆");
			
   }
}
