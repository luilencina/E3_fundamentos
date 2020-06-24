///////////////////////////////////////////////////////
//ALUNO TUMRA DE FUNDAMENTOS DE PROGRAMCAO LUIZA LENCINA
///////////////////////////////////////////////////////

import java.util.Scanner;

public class ex2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        System.out.println("Escreva a sua frase: ");
        String mensagem = in.nextLine();

        System.out.println("Escreva a palavra que quer procurar dentro da frase:");
        String pedido = in.nextLine();

        int result = procura(mensagem, pedido);

        System.out.println("resultado: " + result);

    }

    public static int procura(String frase, String palavra) {
        int count = 0;
        int result = 0;
        String triplce = "";

        for(int i=0; i<frase.length(); i++){
            triplce += frase.charAt(i);
            if(triplce.equalsIgnoreCase(" ")){
                triplce="";
            }

            if(triplce.equalsIgnoreCase(palavra)){
                count++;
                triplce="";
            }
            if(triplce.length()==palavra.length()){
                triplce = "";
            }
        }
        return count;
    }
}

