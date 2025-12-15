/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
public class Week7_2 {
    
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of Elements in array:");
        int n = sc.nextInt();

        int a[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("Array in ascending \n" +
"order");
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}
