package basic;

public class Student {
	String id;
	String name;
	void insert_data(String r, String n) {
		id = r;
		name = n;
	}
	void display() {
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
	}
	public static void main(String[] args) {
		Student student1 = new Student();
		student1.insert_data("20WH1A6637", "T.Harshitha");
		student1.display();
	}
	
}
