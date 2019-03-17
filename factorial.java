
package loopp2;
import java.util.Scanner;
public class factorial {
    
    public static void main(String[] args) {
        int ans = compute();
        System.out.println("factorial is : " + ans);
    }
    
    public static int compute(){
        String ans = "";
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        
        int fact = 1;
        int i = 1;
        
        while(i <= num){
            fact = fact * i;            
            i++;            
        }
        return fact; 
    }
    
}
