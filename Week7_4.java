/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
public class Week7_4 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        String t=""; 
        
        for(int i=0; i<s.length(); i++){
            char r=s.charAt(i);
            t=r+t;
        }
        if(s.equals(t))
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}
