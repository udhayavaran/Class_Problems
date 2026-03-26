/* Reverse a gven string and display the output */

import java.util.*;

public class Reverse_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string value: ");
        String str1 = sc.nextLine();
        int r = str1.length()-1, l=0;
        char[] arr = str1.toCharArray();
        
        while(l<r){
            char ch = str1.charAt(l);
            arr[l]=arr[r];
            arr[r]=ch;
            l++;
            r--;
        }

        System.out.print("Reversed String: " + new String(arr)+"\n");
    }
}