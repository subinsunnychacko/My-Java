package newjava;

public class NewJavaClass 
{

	public void display()
	{
		int a=11;
		try 
		{
			int b=a/0;
			System.out.println(b);
		}
		catch(Exception c)
		{
			System.out.println("Exception Handled");
			System.out.println(c);
		}
		finally
		{
			System.out.println("Finaly block");
		}
		
	}
	public static void main(String[] args) 
	{
		NewJavaClass ob=new NewJavaClass();		
		ob.display();		

	}

}