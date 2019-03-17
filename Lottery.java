package loopp2;
import java.util.Scanner;
public class Lottery {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 9;
        int po1 = (int) ((Math.random() * (num2 - num1 + 1)) + num1);
        int po2 = (int) ((Math.random() * (num2 - num1 + 1)) + num1);
        int po3 = (int) ((Math.random() * (num2 - num1 + 1)) + num1);
        int po4 = (int) ((Math.random() * (num2 - num1 + 1)) + num1);
        int po5 = (int) ((Math.random() * (num2 - num1 + 1)) + num1);
        int po6 = (int) ((Math.random() * (num2 - num1 + 1)) + num1);
        String lotto = "" + po1 + po2 + po3 + po4 + po5 + po6;
        check(lotto);
        
    }

    public static void check(String lotto) {
        System.out.println("Lottery is " + lotto);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your lottory : ");
        String yourlotto = sc.next();

        while (!yourlotto.equals("0")) {
            if (yourlotto.length() == 6) {
                if (yourlotto.equals(lotto)) {
                    System.out.println("Reward 1");
                } 
                else if (yourlotto.substring(yourlotto.length() - 3).equals(lotto.substring(lotto.length() - 3))) {
                    System.out.println("Reward 2");
                }
                else if(yourlotto.substring(yourlotto.length()-2).equals(lotto.substring(lotto.length()-2))){
                    System.out.println("Reward 3");
                }
                else{
                    System.out.println("No reward");
                }
            }
            else{
                System.out.println("No lottery");
            }
            System.out.print("Enter your lottory : ");
            yourlotto = sc.next();

        }
        System.out.println("End game");
    }

}
