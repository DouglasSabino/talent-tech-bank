package dia8;

import java.util.ArrayList;
import java.util.List;

public class Agenda extends Pessoas {

    List<Pessoas> listaPessoas = new ArrayList<Pessoas>();
    Pessoas pessoa;

    public void armazenaPessoa(String nome, int anoNascimento, float altura) {
        pessoa = new Pessoas();

        pessoa.setNome(nome);
        pessoa.setAnoNascimento(anoNascimento);
        pessoa.setAltura(altura);

        listaPessoas.add(pessoa);




    }

    public void removePessoa(String nome ) {

        for (Pessoas pessoa : listaPessoas) {

            if (pessoa.getNome().equals(nome)) {

                listaPessoas.remove(pessoa);

            }

        }

    }

    public void buscaPessoa(String nome) {

        for (Pessoas pessoa : listaPessoas) {

            if (pessoa.getNome().equals(nome)) {

                System.out.println(pessoa.toString());

            }

        }

    }

    public void imprimeAgenda(){

        for(Pessoas pessoa : listaPessoas){

            System.out.println();
            System.out.println(pessoa.toString());
            System.out.println("_________________________________________________");

                }

        }

    public void imprimePessoa(int index){

        System.out.println(listaPessoas.get(index));

    }


}
