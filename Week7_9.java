/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
public class Week7_9 {

    public static void quick(int[] arr, int s, int e) {
        if (s < e) {
            int p = part(arr, s, e);
            quick(arr, s, p - 1);
            quick(arr, p + 1, e);
        }
    }   

    public static int part(int [] arr, int s, int e){
        int key = arr[e];
        int i = s - 1;

        for (int j = s; j < e; j++) {
            if (arr[j] < key) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[e];
        arr[e] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        quick(arr, 0, n - 1);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        input.close();
    }
}
