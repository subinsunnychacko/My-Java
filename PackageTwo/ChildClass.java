package PackageTwo;

public class ChildClass extends ParentClass 
{

	public void show()
	{
		System.out.println("child class");
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		ChildClass ob =new ChildClass();
		ob.show();
		ob.print();
		
	}

}
