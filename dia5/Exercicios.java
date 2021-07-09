package dia4;

import java.util.Scanner;

public class Exercicios {

    public static void exercicio1(){

        Scanner in = new Scanner(System.in);

        System.out.print("Digite um valor: ");
          int valor = in.nextInt();

        System.out.print("A quanto deseja eleva-lo: ");
          int eleva = in.nextInt();

        int result = 1;

        for (int i =1; i <= eleva; i++){

            result = result * valor;

        }

        System.out.println("O Resultado é: " + result);

        in.close();

    }

    public static void exercicio2a(){

    for(int i=0; i<=3 ; i++){

        System.out.println("* * * * * * * * * *");

       }

    }

    public static void exercicio2b(){
        int linhas = 5;

        for(int i=0; i<linhas ; i++){

            for(int j=0; j<=i ; j++){

                System.out.print("*");

              }

            System.out.println("\n");

         }

    }

    public static void exercicio2c(){

        int linhas = 5;

        for(int i=1; i<=linhas ; i++){

            int x = linhas - i;

            while(x>0){

                System.out.print(" ");
                x--;
            }

            for(int j=1; j<=i ; j++){

                System.out.print("*");

            }

            System.out.println("\n");

        }

    }

    public static void exercicio2d(){

        int linhas = 5;

        for (int i = 1; i <= linhas; i++) {

            int espacos = linhas - i;

            while (espacos > 0) {
                System.out.print("  ");
                espacos--;
            }

            int k = 0;
            while (k != (2 * i) - 1) {
                System.out.print("* ");
                k++;
            }

            System.out.print("\n");
        }

       }

       public static void exercicio2e(){

           int linhas = 5;

           for (int i = 1; i <= linhas; i++) {

               int espacos = linhas - i;

               while (espacos > 0) {
                   System.out.print("  ");
                   espacos--;
               }

               int k = 0;
               while (k != 2 * i - 1) {
                   System.out.printf("%d ", i);
                   k++;
               }

               System.out.print("\n");
           }


          }

    public static void exercicio2f(){

        int linhas = 5;
        System.out.println("");
        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= (linhas - i) * 2; j++) {
                System.out.print(" ");
            }
            for (int x = i; x >= 1; x--) {
                System.out.print(" " + x);
            }
            for (int l = 2; l <= i; l++) {
                System.out.print(" " + l);
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {

        exercicio2f();

    }

}
