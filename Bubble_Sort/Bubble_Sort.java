package Bubble_Sort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public  class Bubble_Sort {

    static Scanner in = new Scanner(System.in);
    static List<Integer> lista = new ArrayList<>();

    public static void bubbleSort(){
        boolean loop = true;

        System.out.print("Digite um numero para ser ordenado: ");
        int numero = in.nextInt();
        lista.add(numero);

        System.out.print("Digite um numero para ser ordenado: ");
        numero = in.nextInt();
        lista.add(numero);

        while(loop){

            System.out.println("Deseja adicionar outro numero a lista ? S/N");
            char opc = in.next().charAt(0);

            if(opc == 's' || opc == 'S'){

                System.out.print("Digite um numero para ser ordenado: ");
                numero = in.nextInt();
                lista.add(numero);

            }else if(opc == 'n' || opc == 'N'){

                Integer[] vetor = lista.toArray(new Integer[0]);
                int aux;

                for (int i = 1; i < vetor.length ; i ++){

                    for(int j = 0; j < vetor.length - 1 ; j++){

                        if(vetor[j]>vetor[j+1]){

                            aux = vetor[j];
                            vetor[j] = vetor[j+1];
                            vetor[j+1] = aux;

                        }

                    }

                }

                System.out.print("Lista Ordenada: ");

                for(int i = 0 ; i<= vetor.length -1 ; i++){

                    System.out.print(vetor[i] + "|");

                }

                loop = false;


            }else{

                System.out.println("Opção Invalida, Por Favor Digite Sim Ou Não");

            }


        }







    }


}
