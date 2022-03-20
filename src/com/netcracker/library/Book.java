package com.netcracker.library;

import javax.swing.*;
import java.util.ArrayList;

public class Book {
    private String name;
    private ArrayList<Author> authors;
    private double price;
    private int qty = 0;

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + authors +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getName() {
        return name;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Book(String name, ArrayList<Author> authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, ArrayList<Author> authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public Book() {
        this.name = JOptionPane.showInputDialog("Input name book:");
        this.price = Double.parseDouble(JOptionPane.showInputDialog("Input price book:"));
        this.qty = Integer.parseInt(JOptionPane.showInputDialog("Input qty book:"));
        this.authors = inputAuthors();

    }


    public ArrayList<Author> inputAuthors() {
        ArrayList<Author> authors = new ArrayList<>();
        String s = JOptionPane.showInputDialog("Input names authors(through a comma): ");
        String[] names = s.split(",");
        s = JOptionPane.showInputDialog("Input genders authors(through a comma): ");
        String[] genders = s.split(",");
        s = JOptionPane.showInputDialog("Input emails authors(through a comma): ");
        String[] emails = s.split(",");

        for (int i = 0; i < names.length; i++) {
            Author author = new Author(names[i],emails[i], genders[i].toCharArray()[0]);
            authors.add(author);
        }

        return authors;
    }

}
