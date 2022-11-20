package week3.day1;

public class Automation extends MultipleLangauge implements Language{ 
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}
	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("selenium");
	}
	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("ruby");
	}
public static void main(String[] args) {
	Automation input=new Automation();
	input.Java();
	input.Selenium();
	input.python();
	input.ruby();
  }
}
