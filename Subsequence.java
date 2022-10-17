public class Subsequence{
    public boolean issubsequence(String Wor,String sec){
        int i=0;
        int j=0;
        String word=Wor.toLowerCase();
    while(i<word.length() && j<sec.length()){
        if(word.charAt(i)==sec.charAt(j)){
            j++;
        }
        i++;
        
    }
    return j==sec.length();
    
    }
    public static void main(String args[])
    {
        Subsequence s=new Subsequence();
        System.out.println(s.issubsequence("Supriya","spa"));
    }
}