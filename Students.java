package org.college;

public class Students {
	
public void getStudentInfo(int id) {
	System.out.println(id);
}
public void getStudentInfo(int id, String name) {
	System.out.println("id:"+id+"name:"+name);
}
public void getStudentInfo(String email,int number) {
	System.out.println("email:"+email+"number:"+number);
	
}
public static void main(String[] args) {
	Students students=new Students();
	students.getStudentInfo(5);
	students.getStudentInfo(10, "saito");
	students.getStudentInfo("saito@gmail.com", 20);
}
}
