package dia12.televisao;

import java.util.Scanner;

public class Controle {




    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Televisao televisao = new Televisao();
        boolean loop = true;

            while(loop != false) {

                System.out.println("--------- MENU ---------");
                System.out.println("1- Aumentar Volume");
                System.out.println("2- Diminui volume");
                System.out.println("3- Aumentar Canal");
                System.out.println("4- Diminui Canal");
                System.out.println("5- Mudar Canal");
                System.out.println("6- Mostra Volume/Canal");
                System.out.println("0- Sair");
                System.out.println("------------------------");
                System.out.println();

                System.out.print("Digite sua opção: ");
                int opc = in.nextInt();

                switch (opc) {

                    case 1:
                        int volume = 1;
                        televisao.setVolume(volume);
                        break;

                    case 2:
                        volume = -1;
                        televisao.setVolume(volume);
                        break;

                    case 3:
                        int canal = 1;
                        televisao.setCanal(canal);
                        break;

                    case 4:
                        canal = -1;
                        televisao.setCanal(canal);
                        break;

                    case 5:
                        System.out.println();
                        System.out.print("Digite o canal para qual deseja mudar: ");
                        canal = in.nextInt();
                        televisao.mudaCanal(canal);
                        break;

                    case 6:
                        televisao.mostraVolumeCanal();
                        break;

                    case 0:
                        loop = false;
                        break;


                }

            }



    }

}
