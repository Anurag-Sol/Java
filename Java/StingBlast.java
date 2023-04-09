
import java.util.*;
import java.lang.*;
import java.io.*;

class StingBlast
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0){
		    int N = sc.nextInt();
		    String S = sc.next();
		    String A = S.substring(0, N/2);
		    String B = S.substring(N/2,N);
		    // for(int i=0;i<N/2;i++){
		    //    A = S.charAt(i) + A;
		    // }
		    // for(int j=N/2;j<N;j++){
		    //    B = S.charAt(j) + B;
		    // }
			// System.out.println(A);
			// System.out.println(B);
			// System.out.println(A+B);
		    // if(S == (A+B)){
		    //     System.out.println("YES");
		    // }
		    // else{
		    //     System.out.println("NO");
		    // }
			char[] ch1 = new char[S.length()];
			char[] ch2 = new char[S.length()];

			for(int i = 0; i < A.length(); i++){
				ch1[i] = A.charAt(i);
				ch2[i] = B.charAt(i);
			}
			// for(int i = 0; i < B.length(); i++){
			// 	ch1[i] = B.charAt(i);
			// 	ch2[i] = A.charAt(i);
			// }
			int cnt = 0;
			for(int i = 0; i < S.length(); i++){
				if(ch1[i] == ch2[i]){
					cnt++;
				}
			}
			if(cnt == S.length()){
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		    T--;
		}
	}
}
