package dia4;

import java.util.Scanner;

public class Exercicios {

    public static void exercicio1(){

        Scanner in = new Scanner(System.in);

        int vetor[] = new int[10];
        int maiorNum=0, menorNum=0, soma=0;
        float media=0;

        for(int i=0,pos=1; i < 10; i++,pos++){

            System.out.print("Digite o " + pos +"° numero: ");
            vetor[i] = in.nextInt();

        }



        for(int x=1; x<10 ; x++){

            if(vetor[x] > vetor[maiorNum]){

                maiorNum = x;

            }


        }





        for(int x=1; x<10 ; x++){

            if(vetor[x] < vetor[menorNum]){

                menorNum = x;

            }


        }



        for(int i=0; i<10; i++){

            soma = soma + vetor[i];


        }

        media = (float) soma/10;

        System.out.println("O Maior numero é: "+ vetor[maiorNum]);
        System.out.println("O Menor numero é: "+ vetor[menorNum]);
        System.out.println("A Media é: " + media);

        in.close();

    }

    public static void exercicio2(){

        Scanner in = new Scanner(System.in);


        System.out.println("Digite o numero que deseja fatorar: ");
         int num = in.nextInt();
         int fat=1;

         for(int i=num; i>1; i--){

             fat = fat * i;

         }

        System.out.println(fat);

         in.close();

    }

    public static void main(String[] args) {

    exercicio2();

    }

}
