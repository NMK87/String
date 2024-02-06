package org.interviewPreparation.Strings;

import java.util.Scanner;

//import static jdk.internal.icu.text.UTF16.charAt;

public class ValidAnagram {

    public static void main(String args[]){
        System.out.println(anagram("car","baar"));
    }
    public static boolean anagram(String s1, String s2){
        if(s1.length() != s2.length()) return false;

        int[] st= new int[26];
        for(int i=0;i<s1.length();i++) {
            st[s1.charAt(i) - 'a']++;
            st[s2.charAt(i) - 'a']--;
        }
        for(int count : st){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}
