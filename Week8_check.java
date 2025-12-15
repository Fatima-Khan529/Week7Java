/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

class Fruit{
    String name;
    String color;
    String taste;
    int price;
    
    void print(){
        System.out.println("Name of the Fruit is "+name);
        System.out.println("Color of the Fruit is "+color);
        System.out.println("Taste of the Fruit is "+taste);
        System.out.println("Price of the Fruit is "+price);
    }
}

    

public class Week8_check {
    public static void main(String[] args) {
        Fruit f1=new Fruit();
        f1.name="Apple";
        f1.color="Red";
        f1.taste="Sweet";
        f1.price=200;
        f1.print();
        System.out.println("hello");
    }
    
}
