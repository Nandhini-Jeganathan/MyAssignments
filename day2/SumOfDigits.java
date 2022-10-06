package week1.day2;

public class SumOfDigits {
 public static void main(String args[]) {
	 int num=123;
	  int digit,sum=0;
	  while(num!=0)
	  {
		  digit=num%10;
		  sum=sum+digit;
		  num=num/10;
	  }
	System.out.println("sum of Digits= "+sum);
	}
}
