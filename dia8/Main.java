package dia8;

import java.util.Scanner;

public class Main extends Pessoas{

    static Agenda contatos = new Agenda();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        char resp = 's';
        int opc = 0;

        while(resp == 's' || resp == 'S'){

            System.out.println("------------ MENU ---------------");
            System.out.println("1- Armazenar Pessoa");
            System.out.println("2- Remover Pessoa");
            System.out.println("3- Busca Pessoa");
            System.out.println("4- Imprime Agenda");
            System.out.println("5- Imprime Pessoa");
            System.out.println();

            opc = in.nextInt();

            switch (opc){

                case 1:

                    System.out.print("Digite o nome da pessoa: ");
                     String nome = in.next();

                    System.out.print("Digite o ano de nascimento da pessoa: ");
                     int anoNascimento = in.nextInt();

                    System.out.print("Digite a altura da pessoa: ");
                     float altura = in.nextFloat();

                     contatos.armazenaPessoa(nome,anoNascimento,altura);
                    System.out.println();

                    break;

                case 2:

                    System.out.print("Digite o nome da pessoa que deseja excluir: ");
                      nome = in.next();
                      contatos.removePessoa(nome);

                    break;

                case 3:
                    break;

                case 4:

                    contatos.imprimeAgenda();

                    break;

                case 5:

                   System.out.println("Digite o indice da pessoa que deseja apagar: ");

                    break;

                default:
                    System.out.println("Por favor digite uma opção valida !!");



            }




        }



    }

}
