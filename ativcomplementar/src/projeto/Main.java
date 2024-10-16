package projeto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        visaoLivro visao = new visaoLivro();
        Scanner sc = new Scanner(System.in);

        visao.pegarAnoDoLivro();
        visao.pegarAutorDoLivro();
        visao.pegarTituloDoLivro();



        System.out.println(visao.exibeDetalhesDoLivro());
    }
}