package dia5;

import java.util.Scanner;

public class exercicios {

    public static void exercicio1(){

     Scanner in = new Scanner(System.in);
     int[] vetor;

        System.out.print("Preencher vetor até: ");
         int num = in.nextInt();
         vetor = new int[num];

        for(int i=0; i<num; i++){

            vetor[i] = i+1;

        }

        for(int i=vetor.length-1;i>=0; i--){

            System.out.print(vetor[i] + "|");

        }

        in.close();

       }

    public static void exercicio2(){

        int[] desordenado = {60, 5, 3, 8, 1};
        int aux;

        for(int i = 1; i < desordenado.length ; i++){

            for(int x = 0; x < desordenado.length - 1; x++){

                if (desordenado[x] > desordenado[x+1]){

                    aux = desordenado[x+1];
                    desordenado[x+1] = desordenado[x];
                    desordenado[x] = aux;

                }

            }



        }

        for(int x=0; x<desordenado.length; x++){

            System.out.print(desordenado[x] + "|");

        }

       }


    public static void main(String[] args) {

        exercicio2();

    }


}
