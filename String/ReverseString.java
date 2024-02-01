package org.interviewPreparation.Strings;

import java.lang.constant.Constable;
import java.util.Scanner;

public class ReverseString {
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        String str="";
        for(int i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);
        }
        System.out.println(str);
        
    }
}
