public class SmartTV {
    public boolean ligada = false;
    public int canal = 1;
    public int volume = 25;

    public void ligarTv() {
        this.ligada = true;
        System.out.printf("TV Ligada! | Canal: ".
                concat(String.valueOf(canal)).
                concat(" | Volume: ").
                concat(String.valueOf(volume)).
                concat("\n")
        );

    }
    public void desligarTv() {
        System.out.printf("Desligando TV!");
        this.ligada = false;
    }
    public void mudarCanal(int numeroCanal) {
        this.canal = numeroCanal;
        System.out.println(
                "Canal alterado: ".
                concat(String.valueOf(canal))
        );
    }
    public void mudarVolume(int volume) {
        this.volume = volume;
        System.out.println(
                "Volume alterado: ".
                concat(String.valueOf(volume))
        );
    }

    public void aumentarVolume() {
        this.volume++;
        System.out.println(
                "Volume aumentado: ".
                        concat(String.valueOf(volume))
        );
    }
    public void diminuirVolume() {
        this.volume--;
        System.out.println(
                "Volume diminuido: ".
                        concat(String.valueOf(volume))
        );
    }

    public void subirCanal() {
        this.canal++;
        System.out.println(
                "Subindo Canal: ".
                        concat(String.valueOf(canal))
        );
    }
    public void descerCanal() {
        this.canal--;
        System.out.println(
                "Descendo canal: ".
                        concat(String.valueOf(canal))
        );
    }
}
