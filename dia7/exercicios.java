package dia7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercicios {


    public static void exercicio1(){
        Scanner in = new Scanner(System.in);
       int[] vetor = new int[5];

       for(int i=0,pos=1 ; i<vetor.length ; i++, pos++){

           System.out.print("Digite o "+pos+"° numero: ");
                vetor[i] = in.nextInt();

                }
       for (int num : vetor){

           System.out.print(num + "|");

       }

       in.close();

       }

    public static void exercicios2(){

        Scanner in = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        for(int i=0,pos=1 ; i<5 ; i++, pos++){

            System.out.print("Digite o "+pos+"° numero: ");
            int num = in.nextInt();
            lista.add(num);

        }

        int qtdNeg = 0;

        for (int num: lista){


              if(num < 0){

                  qtdNeg++;

              }



        }

        System.out.print("Foram passados "+ qtdNeg + " numeros negativos!!");

        in.close();

       }

    public static void exercicio3() {

        Scanner in = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        for (int i = 0, pos = 1; i < 5; i++, pos++) {

            System.out.print("Digite o " + pos + "° numero: ");
            int num = in.nextInt();
            lista.add(num);

        }

        int qtdPares = 0;

        for (int num : lista) {


            if ((num % 2) == 0) {

                qtdPares++;

            }


        }

        System.out.print("Foram passados "+ qtdPares + " numeros pares!!");

        in.close();

    }

    public static void exercicios4(){

        Scanner in = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        for (int i = 0, pos = 1; i < 5; i++, pos++) {

            System.out.print("Digite o " + pos + "° numero: ");
            int num = in.nextInt();
            lista.add(num);

        }



    }

    public static void exercicios5() {

        Scanner in = new Scanner(System.in);
        int vidas = 10;
        boolean chute = false;

        System.out.print("Digite a palavra para ser adivinhada: ");
        char [] palavra = in.next().toCharArray();
        boolean[] palavraDescoberta = new boolean[palavra.length];
        int letrasAcertadas = 0;
        System.out.println();


        while(vidas>0){

            System.out.print("Digite uma letra: ");
            char letra = in.next().charAt(0);

            for(int i=0; i<palavra.length ; i++){

                if(palavra[i] == letra){

                    palavraDescoberta[i] = true;
                    chute = true;
                    letrasAcertadas++;

                }

            }

            if(chute == false){

                System.out.println("Letra não encontrada!!!");
                --vidas;
                System.out.println("voce ainda tem "+ vidas + " chances !!");


            }


            for(int x=0; x<palavra.length ; x++){

                if(palavraDescoberta[x] == true){

                    System.out.print(palavra[x]);

                }else {

                    System.out.print("_");

                }

            }

            System.out.println();
            chute = false;

            if(letrasAcertadas == palavra.length){

                System.out.println("Parabens voce acertou a palavra !!");
                System.exit(0);

            }


        }





        if(vidas == 0){

            System.out.println("voce perdeu");

        }


        in.close();

    }

    public static void main(String[] args) {

        exercicios5();


        }

}
