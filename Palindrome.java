
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
         String name;
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter String to check isPalindrome or not: ");
        name = sc.nextLine();
        
         String reverse = "";
        for(int i=name.length()-1;i>=0;i--){
            reverse=reverse + name.charAt(i);       
        }
        if(reverse.equals(name)){
            System.out.println("is palindrome");
        }else{
            System.out.println("not a palindrome");
        }
            
    }
}
