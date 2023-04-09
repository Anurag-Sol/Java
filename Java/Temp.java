import java.util.*;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



                                            //////////////
        // System.out.println("Enter the number: ");
        // boolean a = sc.hasNextInt();
        // System.out.println(a);
        // if(a == true){
        // System.out.println("Correct Datatype");
        // }
        // else{
        // System.out.println("Incorrect Datatype");
        // }



                                                    /////////////////
        // System.out.println("Enter a sentence: ");
        // String a = sc.next();
        // System.out.println(a);
        // String b = sc.nextLine();
        // System.out.println(b);



                                                ///////////////////////
        // int N = sc.nextInt();
        // int Sum = 0;
        // for(int i=0;i<=N;i+=2){
        // // if(i%2==0){
        // Sum=Sum+i;
        // // }
        // }
        // System.out.println(Sum);



                                                ///////////////////
        // int n = sc.nextInt();
        // int val = 1;
        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=i;j++){
        // // System.out.print(j);
        // System.out.print(val + " ");
        // val++;
        // }
        // System.out.println();
        // }



                                           ////////////////////////
        // Scanner in = new Scanner(System.in);
        // int t=in.nextInt();
        // for(int i=0;i<t;i++){
        // int a = in.nextInt();
        // int b = in.nextInt();
        // int n = in.nextInt();
        // int calc = a;
        // for(int j=0;j<n;j++)
        // {
        // calc+=(Math.pow(2,j)*b);
        // System.out.print(calc+" ");
        // }
        // System.out.println();
        // }
        // in.close();



                                     //////////////
        // System.out.println("================================");
        // for(int i=0;i<3;i++){
        // String s1=sc.next();
        // int x=sc.nextInt();
        // System.out.printf("%-15s%03d%n",s1,x);
        // }
        // System.out.println("================================");



                                        //////////////////
        // import java.io.*;
        // import java.util.*;
        // import java.text.*;
        // import java.math.*;
        // import java.util.regex.*;

        // public class Temp {

        // static String whoCanFitTheNumber(String numString)
        // {
        // String answer = "";
        // try{
        // long num = Long.parseLong(numString);
        // answer = numString + " can be fitted in:\n";
        // if((num<=Byte.MAX_VALUE) && (num>=Byte.MIN_VALUE)){
        // answer = answer.concat("* byte\n* short\n* int\n* long");
        // }else if((num <= Short.MAX_VALUE) && (num >= Short.MIN_VALUE)){
        // answer = answer.concat("* short\n* int\n* long");
        // }else if((num <= Integer.MAX_VALUE) && (num >= Integer.MIN_VALUE)){
        // answer = answer.concat("* int\n* long");
        // }else{
        // answer = answer.concat("* long");
        // }
        // }catch (NumberFormatException e){
        // answer = numString+" can't be fitted anywhere.";
        // }
        // return answer;
        // }
        // public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // int numTestCases = scanner.nextInt() ;
        // scanner.nextLine();
        // for(int i=0; i<numTestCases;i++){
        // String numString = scanner.nextLine();
        // System.out.println(whoCanFitTheNumber(numString));
        // }
        // }
        // }



                                          /////////////////////
        // import java.io.*;
        // import java.util.*;
        // import java.text.*;
        // import java.math.*;
        // import java.util.regex.*;

        // public class Temp {

        // static boolean flag;
        // static int B,H;

        // static{
        // Scanner sc = new Scanner(System.in);
        // B = sc.nextInt();
        // H = sc.nextInt();
        // if(B>0 && H>0)
        // {
        // flag = true;
        // }
        // else
        // {
        // System.out.println("java.lang.Exception: Breadth and height must be positive");
        // }
        // }

        // public static void main(String[] args){
        // if(flag){
        // int area=B*H;
        // System.out.print(area);
        // }

        // }

        // }



                                    ////////////////// 
                    // Code to convert Integer into string
// import java.util.*;
// import java.security.*;
// public class Temp {
// 	public static void main(String[] args) {
		
// 		Do_Not_Terminate.forbidExit();

// 		try{
// 			Scanner in = new Scanner(System.in);
// 			int n=in.nextInt();
//       String s = Integer.toString(n);
//       if(n==Integer.parseInt(s))
// 			{
// 				System.out.println("Good job");
// 			}
// 			else
// 			{
// 				System.out.println("Wrong answer.");
// 			}
// 		}
// 		catch (Do_Not_Terminate.ExitTrappedException e) {
// 			System.out.println("Unsuccessful Termination!!");
// 		}
// 	}
// }

// //The following class will prevent you from terminating the code using exit(0)!
// class Do_Not_Terminate {
		 
// 	    public static class ExitTrappedException extends SecurityException {

// 			private static final long serialVersionUID = 1L;
// 	    }
	 
// 	    public static void forbidExit() {
// 	        final SecurityManager securityManager = new SecurityManager() {
// 	            @Override
// 	            public void checkPermission(Permission permission) {
// 	                if (permission.getName().contains("exitVM")) {
// 	                    throw new ExitTrappedException();
// 	                }
// 	            }
// 	        };
// 	        System.setSecurityManager(securityManager);
// 	    }
// 	}




    }
}
