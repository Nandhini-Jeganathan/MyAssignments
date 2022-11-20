package week3.day1;

public class Students {
	public void getStudentInfo(int id ) {
		System.out.println(id);
		
	}
	public void getStudentInfo(int id,String name ) {
		System.out.println(id);	
		System.out.println(name);
	}
	public void getStudentInfo(String email,int phoneNumber ) {
		System.out.println(email);
		System.out.println(phoneNumber);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Students input=new Students();
		input.getStudentInfo(54);
		input.getStudentInfo(53, "Nandhini");
		input.getStudentInfo("nandhinijeyanthi98@gmail.com", 994378600);
		
	}
}
