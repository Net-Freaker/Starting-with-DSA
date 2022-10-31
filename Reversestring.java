public class ReverseInteger{
    static int reverseint(int num){
        boolean isNegative=num<0;
        if(isNegative){
            num=num*-1;
        }
        int lastdigit;
        int reverse=0;
        while(num>0){
            lastdigit=num%10;
            reverse=reverse*10+lastdigit;
            num=num/10;
        }
        return isNegative?reverse*-1:reverse;
    }
        public static void main(String args[]){
            System.out.println(reverseint(-876546));
        }
        
    
}