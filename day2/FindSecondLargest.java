package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {
	static int findSecondLargest(int a[],int n) {
		Arrays.sort(a);
		int second_largest =0;
		for(int i=n-2;i>=0;i--) {
			if(a[i]!=a[n-1])
			{
				second_largest=a[i];
				break;
			}
		}
		return second_largest;
	}		
public static void main(String[] args) {
	int a[]= {3,2,11,4,6,7};
	int n=a.length;
	int ans=findSecondLargest(a,n);
	System.out.println("The second largest element in the array is: "+ans);
	}
 }
	
