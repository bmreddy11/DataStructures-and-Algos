package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMap1 {
    /*public char firstOccurance(String string){
        char [] chars = string.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for (var ch : chars){
            if(map.containsKey(ch)){
                var count = map.get(ch);
                map.put(ch,count+1);
            }
            else
                map.put(ch,1);
        }
        for (var ch : chars){
            if(map.get(ch) == 1)
                return ch;
        }
        return Character.MIN_VALUE;
    }*/

    public char findFirstRepeatedChar(String string){
        Set<Character> set = new HashSet<>();
        for (var ch : string.toCharArray()){
            if (set.contains(ch)){
                return ch;
            }
            else
                set.add(ch);
        }
        return Character.MIN_VALUE;
    }
}
// for(char ch: chars){
//    var count = map.containsKey(ch) ? map.get(ch) : 0 ;
//    map.put(ch,count+1);
