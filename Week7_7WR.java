/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
public class Week7_7WR {
    
    public static int GCD(int n, int d){
        if(n%d==0)
            return d;
        return(GCD(n, n%d));
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n=sc.nextInt();
        System.out.println("Enter the second number:");
        int d=sc.nextInt();
        System.out.println(GCD(n,d));
    }
}
