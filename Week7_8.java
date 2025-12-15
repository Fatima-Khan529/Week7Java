/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
public class Week7_8 {
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first String:");
        String s=sc.nextLine();
        System.out.println("Enter the second String:");
        String r=sc.nextLine();
        int a[]=new int[256];
        
        if(s.length() != r.length()){
            System.out.println("Not anagram");
            return;
        }
        for(int i=0; i<s.length(); i++){
            int e=s.charAt(i);
            a[e]++;
        }
        for(int i=0; i<r.length(); i++){
            int d=r.charAt(i);
            a[d]--;
        }
        for(int i=0; i<a.length; i++){
            if(a[i]!=0){
                System.out.println("Not Anagram");
                return;
            }
        }    
        System.out.println("Anagram");
    }
}
