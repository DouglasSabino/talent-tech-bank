package desafioBanco;

import netscape.security.UserTarget;

import java.util.*;

public class Conta extends Cliente {

    private int numeroConta;
    private String tipoConta;
    private double saldo = 0;
    private double credito = 500;
    private String senha;


    static HashSet<Conta> contas = new HashSet<>();
    Conta conta;
    Scanner in = new Scanner(System.in).useDelimiter("\n");
    Random random = new Random();

    //METODOS SETTERS
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //METODOS GETTERS
    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTipoConta() {
        return tipoConta;

    }

    public double getSaldo(){
        return saldo;
    }

    @Override
    public String toString() {

        return "Conta " +
                "NOME = " + nome +
                ", CPF = " + cpf +
                ", NUMERO DA CONTA = " + numeroConta +
                ", TIPO DA CONTA = " + tipoConta +
                ", SALDO CONTA = " + saldo +
                ", SENHA = " + senha + "\n";
    }

    public void armazenaConta(int tipoConta) {

        conta = new Conta();

        switch (tipoConta) {

            case 1:
                conta.tipoConta = "Corrente";
                break;

            case 2:
                conta.tipoConta = "Poupança";
                break;

            default:
                System.out.println("Por favor digite uma opção valida !!!");
                break;

        }

        conta.numeroConta = random.nextInt(9999);

        System.out.print("Digite o nome do cliente: ");
        String nome = in.next();
        conta.nome = nome;

        System.out.print("Digite o CPF do Cliente: ");
        String cpf = in.next();
        conta.cpf = cpf;

        System.out.print("Digite uma senha: ");
        String senha = in.next();

        System.out.print("Por favor confirme a senha: ");
        String confirmaSenha = in.next();

        if (!senha.equals(confirmaSenha)) {
            System.out.println("As senhas não conferem, por favor tente outra vez");
        } else {
            conta.senha = senha;
            contas.add(conta);
            System.out.println("Cliente Cadastrado com sucesso!!!");
            System.out.print(conta.toString());
        }


    }

    public void depositar(int valor, int numeroConta) {

        if (valor > 0) {

            for (Conta c : Conta.contas) {

                if (c.getNumeroConta() == numeroConta) {

                    System.out.println("Você deseja depositar R$" + valor + " para " + c.nome + " ? S/N");
                    char escolha = in.next().charAt(0);

                    if (escolha == 's' || escolha == 'S') {

                        c.setSaldo(this.saldo + valor);

                    } else {

                        System.out.println("Operação Cancelada Com Sucesso !!");

                    }


                }
            }

            }


        }

        public void sacar(double valor, int numeroConta){

         for(Conta b: Conta.contas){

            if(b.getNumeroConta() == numeroConta){

            System.out.print("Por Favor Digite sua Senha: ");
            String senha = in.next();

            if(b.senha.equals(senha)){

                if(valor < (b.getSaldo() + b.credito)){

                    b.saldo = b.saldo - valor;

                    if(b.saldo < 0 && b.saldo > -500){

                        b.credito = b.credito - Math.abs(b.saldo);
                        b.saldo = 0;

                    }

                }else{

                    System.out.println("Saldo Insuficiente !!!!");

                }

            }else{

                System.out.println("Senha Incorreta, Operação Cancelada !!!");

            }

            }

         }

           }

         public void creditoDisponivel(int numeroConta){

            for(Conta a: Conta.contas){

                if(a.getNumeroConta() == numeroConta){

                    System.out.print("Por favor digite sua senha: ");
                    String s = in.next();

                    if(a.senha.equals(s)){

                        System.out.println("Credito Disponivel: " + a.credito);

                    }else{

                        System.out.println("Senha Incorreta !!");

                    }
                }

            }

         }

}


