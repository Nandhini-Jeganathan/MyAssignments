package week1.day2;

public class TwoWheeler {
public int noOfWheels(int num1,int num2) 
  {
	int wheels=num1+num2;
	return wheels;
  }
public short noOfMirrors(int num3)
  {
	short mirrors=2;
	return mirrors;
  }
public long chassisNumber()
  {
	long chassis=45671109694031078L;
	return chassis;
  }
public boolean isPunctured()
 {
	boolean isPunctured=false;
	return isPunctured;
 }
public String bikeName()
  {
	String bikeName="Royal Enfield";
	return bikeName;
  }
public double runningKM()
 {
  double runningKM=33150.8;
  return runningKM;
 }
public static void main(String args[])
 {
	TwoWheeler bike= new TwoWheeler();
	int wheels=bike.noOfWheels(1, 1);
	System.out.println(wheels);
	short mirrors=bike.noOfMirrors(2);
	System.out.println(mirrors);
	long chassis=bike.chassisNumber();
	System.out.println(chassis);
	boolean isPunctured=bike.isPunctured();
	System.out.println(isPunctured);
	String bikeName=bike.bikeName();
	System.out.println(bikeName);
	double runningKM=bike.runningKM();
	System.out.println(runningKM);
 }
}