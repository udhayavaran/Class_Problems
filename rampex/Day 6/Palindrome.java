/* Check if a given string is a palindrome */

import java.util.*;

public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string value: ");
        String str1 = sc.nextLine();
        if(palindrome(str1)) System.out.print("The string is a palindrome\n");
        else System.out.print("The string is not a palindrome\n");
    }

    static boolean palindrome(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
}