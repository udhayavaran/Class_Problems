/*Count and display the number of alphabet, digits and special characters in a string */

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string value: ");
        String str1 = sc.nextLine();
        int alpha=0, digit=0, special=0;
        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            if((ch>='a' && ch<='z') || (ch>='A' && ch<='z')) alpha++;
            else if(ch>='0' && ch<='9') digit++;
            else special++;
        }
        
        System.out.print("Alphabets: "+alpha+"\nDigits: "+digit+"\nSpecial Characters: "+special+"\n");
    }
}