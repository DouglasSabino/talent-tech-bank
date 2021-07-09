package dia0;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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

    }

}
