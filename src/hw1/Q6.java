package hw1;

public class Q6 {
	public static void main(String[] args) {
		//6.請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
        //	5 + 5
        //	5 + ‘5’
        //	5 + “5”
        //	並請用註解各別說明答案的產生原因

	    int n = 5 ;
	    char o = '5';
			    
	    System.out.println("5 + 5 = "+ (n + n)); //數字5+5
        System.out.println("5 +'5' = " + ( n + o)); //數字5+字符5
        System.out.println("5 + \"5\" = " + 5 + "5" ); //數字5+字串5
		
	}
}
