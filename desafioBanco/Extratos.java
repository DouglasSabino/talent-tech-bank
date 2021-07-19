package desafioBanco;

import java.util.ArrayList;
import java.util.List;

public class Extratos extends Conta{

    protected static List<Extratos> extratos;
    protected static Extratos extrato;

    private String tipoTransacao;
    private int numeroConta;
    private int contaRecebedora;
    private double valor;

    public void setTipoTransacao(String transacao){
        this.tipoTransacao = transacao;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setContaRecebedora(int contaRecebedora) {
        this.contaRecebedora = contaRecebedora;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public static void linhaExtrato(String tipoTransacao, int numeroConta,double valor, int contaRecebedora){

        extrato = new Extratos();
        extrato.setTipoTransacao(tipoTransacao);
        extrato.setNumeroConta(numeroConta);
        extrato.setContaRecebedora(contaRecebedora);
        extrato.setValor(valor);
        extratos.add(extrato);
        System.out.println(extrato.toString());

    }

    public static void linhaExtrato(String tipoTransacao, int numeroConta, double valor){

        extrato = new Extratos();
        extrato.setTipoTransacao(tipoTransacao);
        extrato.setNumeroConta(numeroConta);
        extrato.setValor(valor);
        System.out.println(extrato.toString());

    }

    @Override
    public String toString() {
        return "Extratos{" +
                "tipoTransacao='" + tipoTransacao + '\'' +
                ", numeroConta=" + numeroConta +
                ", valor=" + valor +
                '}';
    }

    public static void exibeExtrato(int numeroConta){

        for(Conta ex : Extratos.contas){

            if(ex.getNumeroConta() == numeroConta){

               // ex.;


            }

        }

    }



}
