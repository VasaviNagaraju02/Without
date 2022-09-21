package javawithout;
class Student
{
	int rollno;
	String name;
	static String college = "UST";
	static void change()
	{
		college = "BBDIT";
		
	}
	Student(int r,String n)
	{
		rollno = r;
		name = n;
		
	}
	void display()
	{
		System.out.println(rollno+""+name+""+college);
	}
	
}
public class Static
{
	public static void main(String ags[])
	{
		Student s1 = new Student(101,"Vasavi");
		Student s2 = new Student(102,"Pooja");
		Student s3 = new Student(103,"Priya");
		s1.display();
		s2.display();
		s3.display();
	}
}
