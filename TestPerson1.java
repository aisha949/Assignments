public class TestPerson1{
public static void printPerson(Person1 p){
	
	System.out.print(p);
}
	public static void main(String[] args){
		String []course=new String[2];
			course[0]="maths(001)";
			course[1]="english(002)";
		Person1 p=new Person1("hgf");
		Employee e=new Employee(23,384.2,"gjg");
		Faculty f=new Faculty(22,233.3,"hdfh",4);
		printPerson(p);
		printPerson(e);
		System.out.print("----");
		printPerson(f);


	}
}