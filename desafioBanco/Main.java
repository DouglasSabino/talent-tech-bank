package desafioBanco;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        boolean loop = true;
        Scanner in = new Scanner(System.in).useDelimiter("\n");
        Conta conta;


        while(loop != false){

            System.out.println("___________ MENU ___________");
            System.out.println("1- Cadastrar Cliente");
            System.out.println("2- Exibir Lista de Clientes");
            System.out.println("3- Depositar");
            System.out.println("4- Sacar");
            System.out.println("5- Credito Disponivel");
            System.out.println("0- Sair");
            System.out.println("____________________________");
            System.out.println();
            System.out.print("Opção: ");
            int opc = in.nextInt();

            switch(opc){

                case 1:

                    System.out.println("Qual Tipo de Conta deseja Cadastrar ?");
                    System.out.println("____________________________");
                    System.out.println("1- Corrente");
                    System.out.println("2- Poupança");
                    System.out.println("____________________________");
                    System.out.println();
                    System.out.print("Opção: ");
                     opc = in.nextInt();

                     conta = new Conta();
                     conta.armazenaConta(opc);


                    break;

                case 2:

                    for(Conta c: Conta.contas){
                        System.out.println();
                        System.out.println(c.toString());
                        System.out.println("____________________________________________________________________________");

                    }

                    break;

                case 3:

                    System.out.print("Digite o numero da conta para quem deseja depositar: ");
                    int numeroConta = in.nextInt();

                    System.out.print("Digite quanto deseja depositar: ");
                    int valor = in.nextInt();

                    for(Conta a: Conta.contas){

                        if(a.getNumeroConta() == numeroConta){
                            a.depositar(valor,numeroConta);
                        }else{
                            System.out.println("Conta não Encontrada");
                        }

                    }

                    break;

                case 4:

                    System.out.print("Digite o numero da conta para quem deseja Sacar: ");
                    numeroConta = in.nextInt();

                    System.out.print("Digite o valor que deseja sacar: ");
                    valor = in.nextInt();

                        for(Conta a: Conta.contas){

                            if(a.getNumeroConta() == numeroConta){
                                a.sacar(valor,numeroConta);
                            }

                        }

                    break;

                case 5:

                    System.out.print("Digite o numero da conta que deseja saber o credito disponivel: ");
                    numeroConta = in.nextInt();

                    for(Conta a : Conta.contas){

                        if(a.getNumeroConta() == numeroConta){

                            a.creditoDisponivel(a.getNumeroConta());

                        }

                    }


                    break;

                case 0:
                    loop = false;
                    break;

                default:
                    System.out.println("Por favor Digite uma opção valida");
                    break;
            }


        }

    }

}
