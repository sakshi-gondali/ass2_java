// Write a java program to count the frequency of each character in a given string.

import java.util.HashMap;

public class q4 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        String a="my name is anthony gonsarvis";
        HashMap hm =new HashMap<String,Integer>();
        // hm.put('5', 6);
        // System.out.println(hm.get('5'));
        for (int i = 0; i < a.length(); i++) {
            if(hm.containsKey(a.charAt(i))){
                
                hm.put(a.charAt(i),hm.get(a.charAt(i)+1));
            }
            else{
                hm.put(a.charAt(i), 1);
            }
        }
        System.out.println(hm);
    }
}
