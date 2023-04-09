import java.util.*;
public class ReverseString {
    
    public static String revString(String str) {
        String revStr = "";
        // for(int i=str.length() - 1;i>=0;i--){
        //     revStr += str.charAt(i);
        // }
        for(int i=0;i<str.length();i++){
            revStr = str.charAt(i) + revStr;
        }
        return revStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String a = revString(str);
        System.out.println(a);
    }
}
