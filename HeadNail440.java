
package HeadNail4;

public class HeadNail440 {
    public static void main(String[] args) {
        String ans = random();
        System.out.println(ans);
    }
    public static String random(){
        int num1 = 1;
        int num2 = 2;
        int count = 0;
        int head = 0;
        int nail = 0;
        
        while(count < 1000000){
            count++;
            int ran = (int)((Math.random()*(num2-num1+1))+num1);
            
            if(ran == 1){
                head++;
            }
            else{
                nail++;
            }
                
        }
        return "Head is " + head + "\nNail is " + nail;
    }
    
}
