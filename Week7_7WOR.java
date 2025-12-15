/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
public class Week7_7WOR {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        
        int GCD=0;
        for(int i=12; i>=1; i--){
            if((b%i==0) && (a%i==0)){
                GCD=i;
                break;
            }   
        }
        System.out.println(GCD);
    }
}
