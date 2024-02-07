package org.interviewPreparation.Strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class OuterParentheses {

    public static String removeOuterParentheses(String s) {
        Stack<Character> st1 = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                if (st1.size() > 0) {
                    sb.append(ch);
                }
                st1.push(ch);
            } else {
                st1.pop();
                if (st1.size() > 0) {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        String result = removeOuterParentheses(read.readLine());
        System.out.println(result);
    }
}
