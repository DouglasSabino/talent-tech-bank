package dia2;
import java.util.Scanner;

public class Exercicios {

    public static void exercicio1(){

        Scanner in = new Scanner(System.in);

        int y = 99;
        int z = 11;
        int aux = 0;

        aux = y;
        y = z;
        z = aux;

        System.out.println(y);
        System.out.println(z);

        in.close();

    }

    public static void exercicio2(){

        Scanner in = new Scanner(System.in);

        System.out.print("Digite um numero: ");
         int num = in.nextInt();

        System.out.print("Seu antencessor é: " + --num);

        in.close();

    }

    public static void exercicio3(){

        Scanner in = new Scanner(System.in);

        System.out.print("Digite a base do retangulo: ");
        int base = in.nextInt();

        System.out.print("Digite a altura do retangulo: ");
        int altura = in.nextInt();

        int area = base * altura;

        System.out.print("A Area do retangulo é: " + area);

        in.close();


    }

    public static void exercicio4(){

        Scanner in = new Scanner(System.in);
        float pVB, pVN, pVV;

        System.out.print("Digite o numero total de Eleitores: ");
        int numEleitores = in.nextInt();

        System.out.print("Digite o numero de votos em branco: ");
        int numVotosBrancos = in.nextInt();

        System.out.print("Digite o numero de votos nulos: ");
        int numVotosNulos = in.nextInt();

        pVB = (float) ((numVotosBrancos*100)/numEleitores);

        pVN = (float) ((numVotosNulos*100)/numEleitores);

        pVV = (float) (((numEleitores - numVotosBrancos - numVotosNulos) * 100)/numEleitores);

        System.out.println("");

        System.out.println("Percentual Votos em Branco: " + pVB + "%");
        System.out.println("Percentual Votos em Nulos: " + pVN + "%");
        System.out.println("Percentual Votos em Validos: " + pVV + "%");

        in.close();


    }




    public static void main(String[] args) {

        exercicio1();

    }

}


