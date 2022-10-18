//First non repeating characteer
import java.util.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Firstnonrepeatingcharacter{
    static int Characterr(String str){
    HashMap<Character,Integer> map=new HashMap<>();
    char[] ch=str.toCharArray();
    for (char i:ch){
        map.put(i,map.getOrDefault(i,0)+1);
    }
     //System.out.println(map);
    for(int i=0;i<ch.length;i++){
        char c=ch[i];
        if(map.get(c)==1){
            return i;
        }
    }
    return -1;
    }
    public static void main(String args[]){
     System.out.println(Characterr("codeforcode"));
     
    }
}