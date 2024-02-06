package org.interviewPreparation.Strings;

public class FirstPallindromic {

    //leetcode solution- Java-Easy- 2108
    public static String main(String[] words){

        for(int i=0;i<words.length;i++){
           if( isPallindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }

    public static boolean isPallindrome(String str){

        int left=0;
        int right=str.length()-1;

        while(left<right){
            if(str.charAt(left)!= str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
