package Generics.ex5.application;

import Generics.ex5.entities.Product;
import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

    public static  void main(String[] args) {

        Set<Product> set = new HashSet<>();
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));
        Product prod = new Product("Notebook", 1200.0);
        System.out.println(set.contains(prod));
    }
}
