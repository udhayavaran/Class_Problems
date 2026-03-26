/*Convert lowercase to uppercase without using built-in methods */

public class Main[
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string value: ");
        String str1 = sc.nextLine();
        char[] output=str1.toCharArray();
        for(int i=0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            if(ch>='a' && ch<='z'){
                output[i]=(char)(ch-32);
            }
        }
        
        System.out.print(new String(output)+"\n");
    }
]