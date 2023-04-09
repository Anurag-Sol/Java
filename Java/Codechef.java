import java.util.*;
import java.lang.*;
import java.io.*;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0){
		    int N = sc.nextInt();
		    String S = sc.next();
		    String A = "";
		    String B = "";
		    for(int i=0;i<N-1;i++){
		        A = S.charAt(i) + A;
		        S = S.substring(i, N);
		        B = S.charAt(i) + B;
		        S = S.substring(i, N);
		    }
		    if(A == B){
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		    T--;
		}
	}
}
