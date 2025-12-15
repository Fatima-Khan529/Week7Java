/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week7_1;

import java.util.*;
public class Week7_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Elements in array:");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements (in sorted order):");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.println("Enter the number you want to find: ");
        int x = sc.nextInt();
        
        int s = 0;
        int e = n - 1;
        int m;
        
        while(s <= e) {
            m = (s + e) / 2;   // correct mid calculation
            
            if(x == a[m]) {
                System.out.println("Element found at index: " + m);
                return;  // exit the program when found (no flag needed)
            }
            else if(x < a[m]) 
                e = m - 1;
            else 
                s = m + 1;
        }
        System.out.println("Element not found");
    }
}
