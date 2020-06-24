///////////////////////////////////////////////////////
//ALUNO TUMRA DE FUNDAMENTOS DE PROGRAMCAO LUIZA LENCINA
///////////////////////////////////////////////////////

import java.util.Scanner;

public class ex1_recursivo {
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
        double result = Recursivo(n);
        // printando resultado
        System.out.println("Resultado é: " + result);

    }

    public static double Recursivo(double n){
        if(n==1){ return 3;}
        return (((n*2.0)+1.0)/(n*n*1.0) + Recursivo(n-1));
    }

}

