package dia3;

import java.util.Scanner;

public class Exercicios {


    public static void exercicio1(){

        Scanner in = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = in.nextInt();

        if(num%2 == 0){

            System.out.println("Numero Par");

        }else{

            System.out.println("Numero Impar");

        }

        in.close();

    }

    public static void exercicio2(){

        Scanner in = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = in.nextInt();

        if(idade>=5 && idade<=7){

            System.out.print("infantil A");

        }else if(idade>=8 && idade<=11){

            System.out.print("infantil B");

        }else if(idade>=12 && idade<=13){

            System.out.println("juvenil A");

        }else if(idade>=14 && idade<=17){

            System.out.println("juvenil B");

        } else if(idade >= 18){

            System.out.println("Adultos");

        }

        in.close();

    }

    public static void exercicio3(){

        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
         int pNum = in.nextInt();

        System.out.print("Digite o primeiro numero: ");
         int sNum = in.nextInt();

        if(pNum == sNum){

            System.out.println("Os numeros são iguais");

        }else if(pNum > sNum){

            System.out.println("O Primeiro numero é maior");

        }else{

            System.out.println("O Segunda numero é maior");

        }

         in.close();

    }

    public static void exercicio4(){

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

    public static void exercicio5(){

        Scanner in = new Scanner(System.in);
        System.out.println("1- Adição");
        System.out.println("2- Subtração");
        System.out.println("3- Multiplicação");
        System.out.println("4- Divisão");
        System.out.println("");

        System.out.print("Selecione a operação: ");
        int opc = in.nextInt();

        switch (opc){

            case 1:

                System.out.print("Primeiro numero: ");
                int primeiro = in.nextInt();

                System.out.print("Segundo numero: ");
                int segundo = in.nextInt();

                int resultado = primeiro + segundo;

                System.out.println("O Resultado da adição é: "+ resultado);



                break;

            case 2:

                System.out.print("Primeiro numero: ");
                 primeiro = in.nextInt();

                System.out.print("Segundo numero: ");
                 segundo = in.nextInt();

                 resultado = primeiro - segundo;

                System.out.println("O Resultado da subtração é: " + resultado);

                break;

            case 3:

                System.out.print("Primeiro numero: ");
                primeiro = in.nextInt();

                System.out.print("Segundo numero: ");
                segundo = in.nextInt();

                resultado = primeiro * segundo;

                System.out.println("O Resultado da multiplicação é: " + resultado);

                break;

            case 4:

                System.out.print("Primeiro numero: ");
                primeiro = in.nextInt();

                System.out.print("Segundo numero: ");
                segundo = in.nextInt();

                float resul = (float) primeiro / segundo;

                System.out.println("O Resultado da divisão é: " + resul);

                break;

            default:

                System.out.println("Por Favor Digite uma opção valida");
        }

        in.close();

    }

    public static void exercicio6(){

        Scanner in = new Scanner(System.in);





        System.out.println("1- Pedra");
        System.out.println("2- Papel");
        System.out.println("3- Tesoura");

        System.out.print("Jogador 1: ");
        int jogador1 = in.nextInt();
        System.out.println("");

        if(jogador1 <=0 || jogador1 >=4){

            System.out.println("por favor digite uma opção valida");
            System.exit(0);

        }

        System.out.println("1- Pedra");
        System.out.println("2- Papel");
        System.out.println("3- Tesoura");

        System.out.print("Jogador 2: ");
        int jogador2 = in.nextInt();
        System.out.println("");

        if(jogador2 <=0 || jogador2 >=4){

            System.out.println("por favor digite uma opção valida");
            System.exit(0);

        }

        if((jogador1==1 && jogador2==3) || (jogador1==2 && jogador2==1) || (jogador1==3 && jogador2==2)){

            System.out.println("Jogador 1 Venceu !!");

        }else if (jogador1 == jogador2){

            System.out.println("Empate !!!");

        }else {

            System.out.println("Jogador 2 Venceu !!");

        }

        in.close();



    }

    public static void main(String[] args) {

        exercicio6();


    }


}

