/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
public class Week7_6 {//with recursion
    public static int fibonacci(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        return(fibonacci(n-1)+fibonacci(n-2));
    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n=sc.nextInt();
        System.out.println("The Fibonacci series is: ");
        for(int i=0; i<n; i++)
            System.out.print(fibonacci(i)+" ");
    }
}
