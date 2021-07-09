package dia8;

import java.util.Scanner;

public class Pessoas {

    private String nome;
    private int anoNascimento;
    private float altura;
    static Scanner in = new Scanner(System.in);


    //METODOS SET
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAnoNascimento(int anoNascimento){
        this.anoNascimento = anoNascimento;
    }

    public void setAltura(float altura){
        this.altura = altura;
    }

    //METODOS GET
    public String getNome(){
        return this.nome;
    }

    public int getAnoNascimento(){
        return this.anoNascimento;
    }

    public float getAltura(){
        return altura;
    }

    protected static int calculaIdade(int anoNascimento){

        int idade = 2021 - anoNascimento;
        return idade;

          }


    @Override
    public  String toString() {
        return
                "nome= " + nome + '\'' +
                ", anonascimento= " + anoNascimento +
                ", altura= " + altura;
    }



}
