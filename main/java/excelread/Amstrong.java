package packageone;
import java.util.Scanner;
public class Amstrong 
{
	public static void main(String[] args) 
	{
		int num,temp,tot=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		int a=s.nextInt();
		num=a;
		while(num>0)
		{
			temp=num%10;
			tot=tot+temp*temp*temp;
			num=num/10;
		}
		if(tot==a)
		{
			 System.out.println(a + " is an Armstrong number");      	            
		}
		else
		{
			System.out.println(a + " is not an Armstrong number");
		}
	}
}
