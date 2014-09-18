package pacman.sovelluslogiikka;

public class Ruutu {

    Piste sisalto;
    int x;
    int y;
    int[] suunnat = new int[4];

    public Ruutu() {
        this.sisalto = new Piste();
    }

    //setterit
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSisalto(Piste sisalto) {
        this.sisalto = sisalto;
    }

    public void vaihdaPisteHedelmaan(Hedelma h) {
        this.sisalto = h;
    }

    //getterit
    public int getYlos() {
        return suunnat[0];
    }

    public int getAlas() {
        return suunnat[1];
    }

    public int getVasemmalle() {
        return suunnat[2];
    }

    public int getOikealle() {
        return suunnat[3];
    }

    public Piste getSisalto() {
        return sisalto;
    }

}
