/* Count and display the number of vowels and consonants in a string */

import java.util.*;

public class Main{}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string value: ");
        String str1 = sc.nextLine();
        int vowel=0;
        int con=0;
        for(int i=0; i<str1.length()-1; i++){
            char ch = str1.charAt(i);
            if(ch>='a' && ch<='z'){
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') vowel++;
                else con++;
            }
        }
        
        System.out.print("Vowel count: "+vowel+"\n"+"Consonants count: "+con+"\n");
    }

}