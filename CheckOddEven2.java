
package loopp2;
import java.util.Scanner;
public class CheckOddEven2 {
    public static void main(String[] args) {
        String ans = check();
        System.out.println(ans);
    }
    public static String check(){
        String ans = "";
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int num = sc.nextInt();        
        
        while(num != 0){
            if(num%2 == 0 ){
                System.out.println(num + " is even");
            }
            else{
                System.out.println(num + " is odd");
            }
            System.out.print("Enter number : ");
            num = sc.nextInt();  
        }
        ans = "No number is entered";
        return ans;
    }
   
}
