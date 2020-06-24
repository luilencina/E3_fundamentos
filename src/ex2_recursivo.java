
///////////////////////////////////////////////////////
//ALUNO TUMRA DE FUNDAMENTOS DE PROGRAMCAO LUIZA LENCINA
///////////////////////////////////////////////////////

import java.util.Scanner;

public class ex2_recursivo {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva a sua frase: ");
        String mensagem = in.nextLine();

        System.out.println("Escreva a palavra que quer procurar dentro da frase:");
        String pedido = in.nextLine();

        int result = procura(mensagem, pedido);

        System.out.println("resultado: " + result);

    }

    public static int procura(String frase, String palavra) {
        return recursive(frase, palavra, 0, 0, "", 0);
    }

    public static int recursive(String frase, String palavra, int count, int result, String triplce, int i) {
        if (i >= frase.length())
            return count;

        triplce += frase.charAt(i);
        if (triplce.equalsIgnoreCase(" ")) {
            triplce = "";
        }

        if (triplce.equalsIgnoreCase(palavra)) {
            count++;
            triplce = "";
        }
        if (triplce.length() == palavra.length()) {
            triplce = "";
        }

        return recursive(frase, palavra, count, result, triplce, i + 1);
    }
}
