// import java.util.Scanner;
// public class java2 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int T = sc.nextInt();
//         // int b = sc.nextInt();
//         // System.out.println(a+b);
//         while(T>0){
//             int X=sc.nextInt();
//             int Y=sc.nextInt();
//             System.out.println(10*X + 90*Y);
//             T--;
//         }

//     }
// }
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Java2
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0)
		{
		    int A = sc.nextInt();
		    int X = sc.nextInt();
		    int B = sc.nextInt();
		    int Y = sc.nextInt();
		    if(A/X > B/Y)
		    {
		        System.out.println("Alice");
		    }
		    else if(A/X < B/Y)
		    {
		        System.out.println("Bob");
		    }
		    else
		    {
		        System.out.println("Equal");
	
		    }
		    T--;
		 }
	}
}