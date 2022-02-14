package akshada;
class Student
{
int rollno;
String name;
static String college="ITS";
Student(int r,String n){
rollno=r;
name=n;
}

void display()
{
System.out.println(rollno+""+name+""+college);
}
}

public class TestStaticVariable 
{
	public static void main(String args[])
	{
		Student s1=new Student(1,"Akshu");
		Student s2=new Student(2,"Swapy");
		
		s1.display();
		s2.display();
		}
}
	

