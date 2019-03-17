package javaapplication104;

import java.util.Scanner;

public class JavaApplication104 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month : ");
        int month = sc.nextInt();

        System.out.print("Enter year : ");
        int year = sc.nextInt();

        int answer = check(month, year);
        String ans = name(month);
        System.out.println(month +" is " + ans + " has "+ answer+ " days");
        

    }

    public static int check(int month, int year) {
        boolean leapYear = false;
        if (year % 4 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            leapYear = true;
        }
        
        int ans = 0;
        if(month == 1 || month ==3 || month ==5|| month == 7|| month == 8||month ==10|| month ==12){
            ans = 31;
        }
        else if((month == 4 || month ==6 || month ==9|| month == 11)){
            ans = 30;
        }
        
        else if (leapYear) {
            ans = 29;
        } 
        else {
            ans = 28;
        }
        return ans;
    }

        public static String name(int month){
            
            String name = "";
            switch(month){
                case 1 : name = "มกราคม";break;
                case 2 : name = "กุมภาพันธ์";break;
                case 3 : name = "มีนาคม";break;
                case 4 : name = "เมษายน";break;
                case 5 : name = "พฤษภาคม";break;
                case 6 : name = "มิถุนายน";break;
                case 7 : name = "กรกฎาคม";break;
                case 8 : name = "สิงหาคม";break;
                case 9 : name = "กันยายน";break;
                case 10 : name = "ตุลาคม";break;
                case 11 : name = "พฤศจิกายน";break;
                case 12 : name = "ธันวาคม";
                break;
        }
            return name;
        }
        
}
