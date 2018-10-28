package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("Hello world!");
        /*
        int[] a = new int[3];
        a[0] = 10;
        for(int i = 0; i < a.length; i++)
            System.out.println(a[i]);
        */

        String temp = "aaaabbc";
        System.out.println(encode(temp));
    }

    public static String encode(String t){
        String result = "";
        int c = 1;
        for(int i = 0; i < t.length(); i++){
            if(i == t.length() - 1 || t.charAt(i) != t.charAt(i+1)){
                result = result + Integer.toString(c) + t.charAt(i);
                c = 1;
            }else{
                c += 1;
            }
        }
        return result;
    }
}


