import java.util.Scanner;


public class Example3 {
	public static void main(String[] args) {
		
		try
		{
		System.out.println(" Connection establish ");
		Scanner s =new Scanner(System.in);
		System.out.println("enter the a ");
		int a=s.nextInt();
		System.out.println("enter the b  ");
		int b=s.nextInt();
		int c=a/b;
		
		System.out.println(c);
		System.out.println("********************************************");
		
		System.out.println("enter the array size ");
		int size=s.nextInt();
		int arr[]=new int[size];// instalization of elements 
		System.out.println(" enter to inserted  in array");
		int ele=s.nextInt();
		System.out.println("enter the position in which has to be inserted ");
		
		int x=s.nextInt();
		arr[x]=ele;
		
		}
		catch (Exception e)
		{
			System.out.println("some prblem occured");
		}
	

		System.out.println("Connection terminated");
		}

}
