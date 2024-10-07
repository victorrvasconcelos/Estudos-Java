package org.example;

import entities.Product;
import entities.Product2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        Set<Product> set = new HashSet<>();
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));
        Product prod = new Product("Notebook", 1200.0);
        System.out.println(set.contains(prod));

        Set<Product2> set1 = new TreeSet<>();
        set1.add(new Product2("Notebook", 1200.0));
        set1.add(new Product2("Tablet", 400.0));
        for (Product2 p : set1) {
            System.out.println(p);
        }

    }
}