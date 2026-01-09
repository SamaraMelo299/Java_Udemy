package List;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {



        // CRIANDO UMA LIST DO TIPO <STRING> NOME: list = UTILIZANDO A INTERFACE ArrayList();
        List<String> list = new ArrayList<>();


        // ADICIONANDO ITENS NA LISTA CONFORME NECESSIDADE
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2, "Marco");


        // MOSTRA TAMANHO DA LISTA - .size
        System.out.println(list.size());
        System.out.println("---------------------------");


        // PERCORRE LISTA E EXIBE SEUS ELEMENTOS USANDO LOOP FOREACH FOR(TIPO NOME : ListaQueSeraPercorrida
        for(String x : list) {
            System.out.println(x);
        }
        System.out.println("---------------------------");


        // REMOVE ITENS QUE INICIEM COM LETRA X DEFINIDA
        list.removeIf(x -> x.charAt(0) == 'M');
        for (String x : list) {
            System.out.println(x);
        }
        System.out.println("---------------------------");


        // BUSCA POSIÇÃO DO OBJ NA LISTA .indexOf
        System.out.println("Index Of Bob: " + list.indexOf("Bob"));
        System.out.println("Index Of Bob: " + list.indexOf("Marco"));
        System.out.println("---------------------------");


        // FILTRA LISTA E EXIBE APENAS OBJ COM A INICIAL X ESCOLHIDA
        //Primeiro converte para Stream* - faz a operação filtro com expressão Lambda que precisar .filter(...) - Depois converter para lista collect...
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
        for (String x : result){
            System.out.println(x);
        }
        System.out.println("---------------------------");


        // ENCONTRA ELEMENTO COM PREDICADO X : PRIMEIRO ELEMETO COM A LETRA A FindFirst ou null (orElse)
        String name = list.stream().filter( x -> x.charAt(0) == 'A').findFirst().orElse(null);


        // DEVOLVE NULL CASO NÃO ENCONTRE
        String names = list.stream().filter( x -> x.charAt(0) == 'j').findFirst().orElse(null);
        System.out.println(name);
        System.out.println(names);
    }
}
