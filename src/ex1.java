///////////////////////////////////////////////////////
//ALUNO TUMRA DE FUNDAMENTOS DE PROGRAMCAO LUIZA LENCINA
///////////////////////////////////////////////////////

import java.util.Scanner;

public class ex1 {
    public static void main(String args[]){
    Scanner in = new Scanner(System.in);
         int n = 0;

        //pedir o valor n para usuário
        try {
        System.out.println("Informe um número positivo e inteiro:");
         n = in.nextInt();

        //vai validar se é positivo
            while (n < 0) {
                System.out.println("Número Inválido, tente novamente:");
                n = in.nextInt();
            }
            // caso der algum problema
        } catch(Exception e){
            System.out.println("Número Inválido, tente novamente:");
            n = in.nextInt();
        }

        // chamando metodo
        double result = SomaDoVariavel(n);
        // printando resultado
        System.out.println("Resultado é: " + result);

    }

    public static double SomaDoVariavel(int n){
       // inicializando variaveis
        double aoQuadrado = 0;
        double impar = 1;
        double result = 0;

        for (int i = 1; i <= n; i++) {
            //pegar numeros impares (de dois em dois)
            impar += 2;
            //o quadrado dos numeros
            aoQuadrado = Math.pow(i, 2);
            double novoValor = impar/aoQuadrado;
            result = novoValor + result;

            // print tabela
            System.out.println(i + ": " + impar + " / " + aoQuadrado + " = " + novoValor);
        } // primeiro for
        return result;
    } // metodo

    }

