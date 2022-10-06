package week1.day2;

public class PrimeNumber {
public static void main(String args[]) {
	int num=13;
	int count=0;
	for(int i=2;i<num;i++) {
		if(num%i==0) {
			count++;
			break;
		}
	}
	if(count==0)
		System.out.println(num +" is a Prime number");
	else
		System.out.println(num +" is not a Prime number");
 }
}
