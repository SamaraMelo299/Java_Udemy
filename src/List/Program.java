package List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");

        //Adiciona o elemento na posição 2 da lista
        list.add(2, "Marco");

        //Imprime o tamanho da lista
        System.out.println(list.size());
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("------------------");
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("------------------");
        System.out.println("Index of Bob: " + list.indexOf("Bob"));
        System.out.println("Index of Maria: " + list.indexOf("Maria"));

        System.out.println("------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result) {
            System.out.println(x);
        }

        System.out.println("------------------");
        String name = list.stream().filter(x -> x.charAt(0) == '3').findFirst().orElse(null);

    }
}
