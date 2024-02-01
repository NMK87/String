package org.interviewPreparation.Strings;

import java.util.Scanner;

public class UncommonChars {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        int[] map1 = new int[26];
        int[] map2 = new int[26];

        for (int i = 0; i <= A.length()-1; i++) {
            map1[A.charAt(i) - 'a'] = 1;
        }

        for(int i=0;i<= B.length()-1;i++){
            map2[B.charAt(i)- 'a']=1;
        }
        String str="";
        for(int i=0;i<26;i++){
            if((map1[i] ^ map2[2])==1);
            str+=(char)(i+'a');
        }

        if(str=="")
            System.out.println(-1);
        System.out.println(str);


    }
}
