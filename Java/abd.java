class Solution {
    public static void isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.trim();

        String ans = "";

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 97 && s.charAt(i) <= 122){
                ans += s.charAt(i);
            }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        isPalindrome("ab<zx");
    }
}