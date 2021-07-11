package dia12.televisao;

public class Televisao {

    private int volume = 20;
    private int canal = 13;

    public void setVolume(int novoVolume){

        if(novoVolume == 1){
            this.volume++;
        }else if(novoVolume == -1){
            this.volume--;
        }

           }

    public void setCanal(int novoCanal){

        if(novoCanal == 1){
            this.canal++;
        }else if(novoCanal == -1){
            this.canal--;
        }

    }

    public void mudaCanal(int novoCanal){
        this.canal = novoCanal;
    }

    public void mostraVolumeCanal(){
        System.out.println();
        System.out.println("O Volume é: " + this.volume);
        System.out.println("O Canal é: " + this.canal);
        System.out.println();

    }

}
