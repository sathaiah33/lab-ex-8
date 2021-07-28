/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labno8;

import java.util.Scanner;

/**
 *
 * @author sathaiah balaji
 */
public class Q2 {
    public static void main(String[] args) {  
          
  Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int len = str.length();
        System.out.println("Enter no of equal parts:");
        int n =sc.nextInt();  
        int temp = 0, chars = len/n;  
        
        String[] subStr = new String [n];  
         
        if(len % n != 0) {  
            System.out.println("Sorry this string cannot be divided into "+ n +" equal parts.");  
        }  
        else {  
            for(int i = 0; i < len; i = i+chars) {  
                //Dividing string in n equal part using substring()  
                String part = str.substring(i, i+chars);  
                subStr[temp] = part;  
                temp++;  
            }  
    System.out.println(n + " equal parts of given string are ");  
            for(int i = 0; i < subStr.length; i++) {  
                System.out.println(subStr[i]);  
                }  
            }  
        }  
}  
    
