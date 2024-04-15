package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("digite um nome");
            String nome_recebido = leitura.nextLine();
            nomes.add(nome_recebido);
            nomes.remove("suellen");
            System.out.println(nomes);
            System.out.println("**********");
            System.out.println(nomes.get(1));
        }
    }
}