package week1.day2;

public class ArmstrongNumber {
public static void main(String args[]) {
	int number=153;
	int calculated = 0,remainder,original=0;
	original=number;
	while(original!=0)
	{
		remainder=original %10;
		calculated=calculated+(remainder*remainder*remainder);
		original/=10;
	}
	if(calculated==number)
	{
		System.out.println(number +" is an Armstrong number");
	}
	else
	{
		System.out.println(number +" is not an Armstrong number");
	}
}
}
