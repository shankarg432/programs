import java.io.*;
import java.util.*;
class Even {
	public static void main (String[] args) {
		int num;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		if(num%2==0)
		{
		    System.out.println("Even");
		}
		else{
		    System.out.println("odd");
		}
		
	}
}
