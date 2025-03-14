package hw1;

public class Q3 {
	public static void main(String[] args) {
		 
	    
		//3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒2D23H19M19S
			int c = 256559;
			int min = 60; //一分鐘=60秒
			int hr = min*60; //一小時=3600秒
			int day = hr*24; //一天=86400秒
			System.out.println("一分鐘 = "+ min + "秒");
			System.out.println("一小時 = "+ hr + "秒");
			System.out.println("一天 = "+ day + "秒");
			
	        int D = c/day;
	        int d = c%day;
	        int H = d/hr;
	        int h = d%hr;
	        int M = h/min;
	        int S = h%min;
      
	        System.out.println("256559秒= " + D + "天" + H + "小時" + M + "分鐘" + S + "秒");
	}  
}
