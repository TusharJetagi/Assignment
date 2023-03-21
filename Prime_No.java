import java.util.Scanner;

public class Prime_No 
{
public static void main(String[] args) 
{
	
	int n,count=0;
	
	System.out.println("Enter any Number: ");
	Scanner sc = new Scanner(System.in);
	n = sc.nextInt();
	
	for(int i=1;i<=n;i++) 
	{
		count++;
	}
	if(count==2) 
	{
		System.out.println("Number is Prime");
	}
	else 
	{
		System.out.println("Number is not Prime");
	}
}
}
