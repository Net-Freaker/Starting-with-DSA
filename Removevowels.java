
public class Removevowels{
    static String removingvowels(String str){
        Set<Character> vowels=Set.of('a','e','i','o','u');
        StringBuilder sb=new StringBuilder();
        str=str.toLowerCase();
        char[] ch=str.toCharArray();
        for(Character i:ch){
            if(!(vowels.contains(i))){
                sb.append(i);
                
            }
        }
        return sb.toString();
       
    }
    public static void main(String args[]){
        System.out.println(removingvowels("RAmakrishnA"));
    }
}