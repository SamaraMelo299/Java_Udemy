package Time.ex;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

    public static void main(String[] args) {

        // LocalDate guarda apenas a DATA (ano, mês e dia)
        // não tem hora nem fuso horário
        LocalDate hoje = LocalDate.now();

        // imprimindo a data atual no formato padrão do Java
        System.out.println("Data de hoje: " + hoje);

        // criando uma data manualmente
        // parâmetros: ano, mês e dia
        LocalDate dataCriada = LocalDate.of(2026, 1, 10);

        System.out.println("Data criada manualmente: " + dataCriada);

        // somando dias a uma data
        // percebi que LocalDate é imutável, então ele cria uma nova data
        LocalDate daqui7Dias = hoje.plusDays(7);

        System.out.println("Daqui a 7 dias: " + daqui7Dias);

        // subtraindo meses da data atual
        LocalDate mesPassado = hoje.minusMonths(1);

        System.out.println("Mês passado: " + mesPassado);

        // comparando datas
        // isBefore = antes / isAfter = depois
        System.out.println("Hoje é antes da data criada? " + hoje.isBefore(dataCriada));
        System.out.println("Hoje é depois da data criada? " + hoje.isAfter(dataCriada));

        // LocalDateTime guarda data + hora
        // geralmente usado para registros e logs
        LocalDateTime agora = LocalDateTime.now();

        System.out.println("Data e hora agora: " + agora);

        // criando um formatador para deixar a data no padrão brasileiro
        DateTimeFormatter formatoBR =
                DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // formatando a data atual para ficar mais legível
        String dataFormatada = hoje.format(formatoBR);

        System.out.println("Data formatada: " + dataFormatada);

        // simulando uma data vinda de um formulário ou input do usuário
        String textoData = "25/12/2026";

        // convertendo a String para LocalDate usando o formatador
        LocalDate natal = LocalDate.parse(textoData, formatoBR);

        System.out.println("Data convertida da String: " + natal);

        // exemplo simples de regra de negócio
        // simulando vencimento de um boleto
        LocalDate vencimento = hoje.plusDays(5);

        // verificando se o boleto está vencido ou não
        if (hoje.isAfter(vencimento)) {
            System.out.println("Boleto vencido");
        } else {
            System.out.println("Boleto dentro do prazo");
        }
    }
}