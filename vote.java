import java.util.Scanner;
class vote
{
	public static void main(String args[])
	{
		int m,n;
		Scanner input1=new Scanner(System.in);
		System.out.println("Enter the Year of Birth : ");
		n=input1.nextInt();
		Scanner input2=new Scanner(System.in);
		System.out.println("Current Year : ");
		m=input1.nextInt();
		int Age = m-n;
		System.out.println("Your Age: "+Age);
		if(Age>=18)
		{
			System.out.println("Eligible for Voting");
		}
		else
		{
			System.out.println("Not Eligible");
		}
	}
}