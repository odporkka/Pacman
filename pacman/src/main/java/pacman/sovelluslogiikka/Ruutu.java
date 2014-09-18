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
    
    public void setYlos(int i) {
        if (i==0 || i==1){
            this.suunnat[0]=i;
        }         
    }

    public void setAlas(int i) {
        if (i==0 || i==1){
            this.suunnat[1]=i;
        } 
    }

    public void setVasemmalle(int i) {
        if (i==0 || i==1){
            this.suunnat[2]=i;
        } 
    }

    public void setOikealle(int i) {
        if (i==0 || i==1){
            this.suunnat[3]=i;
        } 
    }

    public void setSisalto(Piste sisalto) {
        this.sisalto = sisalto;
    }

    public void vaihdaPisteHedelmaan(Hedelma h) {
        this.sisalto = h;
    }

    //getterit
    public boolean getYlos() {
        return this.suunnat[0]==1;
    }

    public boolean getAlas() {
        return this.suunnat[1]==1;
    }

    public boolean getVasemmalle() {
        return this.suunnat[2]==1;
    }

    public boolean getOikealle() {
        return this.suunnat[3]==1;
    }

    public Piste getSisalto() {
        return sisalto;
    }

}
