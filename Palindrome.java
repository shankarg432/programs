import java.io.*;
import java.util.*;

class Palindrome {
	public static void main (String[] args) {
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	int original=num;
	int reverse=0;
	while(num!=0)
	{
	    int a=num%10;
	    reverse=reverse*10+a;
	    num=num/10;
	}
	if (original==reverse)
	{
	    System.out.println("palindrome");
	}
	else
	{
	    System.out.println("not an palindrome");
	}
	}
}
