package hw1;

public class Q5 {
	public static void main(String[] args) {
	//5.某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
	//公式: 本金P*(1+年利率r)的投資年數次方t
		double P = 1500000, r = 0.02, t = 10;
		double R = 1 + r ;
		double A = P*Math.pow (R, t);
		System.out.println("十年後本金加利息共"+ A + "元");
	}
}
