import java.util.Scanner;
class Fprime
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the number: ");//456
	int num=s.nextInt(),temp=num,count=0;
	for(;num!=0;num=num/10)//45//4
	{
		int rem=num%10;//6//5//4
		for(int start=1;start<=rem;start++)
		{
			if(rem%start==0)//6
			{
				count++;//
			}
		}
            
	
	            if(count==2 )
	            {
		         System.out.println(rem+" prime");
	             }
	            else
		{
		System.out.println(rem+" not prime");
		}
        }
}
}