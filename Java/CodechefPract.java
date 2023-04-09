import java.util.Scanner;
public class CodechefPract {
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T>0){
		    int N = sc.nextInt();
		    String S = "";
		    for(int i = 0; i < N; i++){
		        S += S.charAt(i);
		    }
            System.out.println(S);
            T--;
		}
	}
}
