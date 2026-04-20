package com.thinkworks.objectclass.runner;

import com.thinkworks.objectclass.internal.*;

public class MainRunner {
    public static void main(String[] args) {
        Student student1=new Student(34,"Lela",24,
                "eat 5 star do ntg",78);

        Student student2=new Student(7523,"Brookie",34,
                "Science",87);

        if(student1.equals(student2)){
            System.out.println("both student 1 and student 2 are equal");
        }
        else System.out.println("they are not equal");

        Employee employee1=new Employee(65,"Jake",
                2635.5D,"Development",2);

        Employee employee2=new Employee(65,"Jake",
                2635.5D,"Development",2);

        if(employee1.equals(employee2)){
            System.out.println("Both employees are similar");
        }
        else{
            System.out.println("employees are not similar");
        }

        Car car1=new Car(725,"Normal car","Faalthu",
                34535432.56D,2036);

        Car car2=new Car(725,"Normal car","Faalthu",
                34535432.56D,2036);

        if(car1.equals(car2)){
            System.out.println("Both the cars are same");
        }
        else System.out.println("both the cars are not similar");

        Book book1=new Book(344,"percy jackson",
                "Richard",3445.3,300);

        Book book2=new Book(344,"percy jackson",
                "Richard",3445.3,300);

        if(book1.equals(book2)){
            System.out.println(
                    "book1 and book2 are same books");
        }
        else System.out.println("book1 and book2 are different books");

        Product product1=new Product(244,"Merch",235.5D,"amazon",2);
        Product product2=new Product(634,"Merch",2355.4D,"Flipcart",2);
        if(product2.equals(product1)){
            System.out.println("both the products are same");
        }
        else System.out.println("both the products are different");

    }
}
