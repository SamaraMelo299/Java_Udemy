package Composition.ex2.application;

import Composition.ex2.entities.Comment;
import Composition.ex2.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that´s awesome!");
        Post p1 = new Post(
                sdf.parse("12/01/2026 17:11:49"),
                "Traveling to New Zealand",
                "I´m going to visit this wonderful country!",
                12);
        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");
        Post p2 = new Post(
                sdf.parse("12/01/2026 17:26:29"),
                "Good night guys",
                "See you tomorrow!",
                5);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.print(p1);
        System.out.println();
        System.out.print(p2);

    }
}
