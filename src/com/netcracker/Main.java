package com.netcracker;

import com.netcracker.geometry.Circrle;
import com.netcracker.geometry.MyPoint;
import com.netcracker.geometry.MyTriangle;
import com.netcracker.geometry.Rectangle;
import com.netcracker.library.Author;
import com.netcracker.library.Book;
import com.netcracker.library.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        testGeometryWork();
        testLibraryWork();
    }

    public static void testLibraryWork(){
        System.out.println("Test class Book");
        ArrayList<Author> authors = new ArrayList<>();
        authors.add(new Author("Tom","tom@gmail.com",'M'));
        authors.add(new Author("Jone","jone@gmail.com",'M'));
        authors.add(new Author("Jane","jane@gmail.com",'F'));

        Book book = new Book("Singularity",authors,200,10);
        System.out.println(book);
        System.out.println("===================================");
        System.out.println("In this example, book are entered manually");
        Book book1 = new Book();
        System.out.println(book1);
        System.out.println("=====================================");
        Employee employee = new Employee(1,"Tom","Hildoston",100);
        System.out.println(employee);
        System.out.println("Name employee: " + employee.getName());
        System.out.println("Annual salary: " + employee.getAnnualSalary());
        System.out.println("Increased salary on 10%: " + employee.raiseSalary(10));
        System.out.println("Annual increased salary: " + employee.getAnnualSalary());
    }

    public static void testGeometryWork(){
        System.out.println("Test triangle");
        MyTriangle triangle = new MyTriangle(new MyPoint(0,0),new MyPoint(1,1),new MyPoint(2,2));
        System.out.println("Type of triangle: " + triangle.getType());//Isosceles
//        MyTriangle triangle1 = new MyTriangle(new MyPoint(1,1),new MyPoint(2,0),new MyPoint(5,5));
//        System.out.println("Type of triangle: " + triangle1.getType());//Scalene

        System.out.println("Perimeter triangle:" + triangle.getPerimeter());
        System.out.println(triangle);

        System.out.println("==========================");
        System.out.println("Test rectangle");
        Rectangle rectangle = new Rectangle(2.0f,3.0f);
        System.out.println(rectangle);
        System.out.println("Perimeter rectangle:" +rectangle.getPerimetr());
        System.out.println("Area of rectangle:" +rectangle.getArea());

        System.out.println("==========================");
        System.out.println("Test circle");
        Circrle circrle = new Circrle(4.0, "Yellow");
        System.out.println(circrle);
        System.out.println("Area of circle: " + circrle.getArea());

        System.out.println("===========================");
        System.out.println("Test point");
        MyPoint myPoint = new MyPoint(2,3);
        System.out.println(myPoint);
        int[] points = myPoint.getXY();
        System.out.println("{" + points[0] + "," + points[1] + "}");
        System.out.println("Distance from (0,0) to (2,3):" + myPoint.distance());
        System.out.println("Distance from (1,1) to (2,3):" + myPoint.distance(1,1));
        System.out.println("Distance from (2,2) to (2,3):" + myPoint.distance(new MyPoint(2,2)));
    }

}
