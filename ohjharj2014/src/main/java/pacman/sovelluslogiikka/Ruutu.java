package pacman.sovelluslogiikka;

/**
 * Luokka yksittaisia taulukon ruutuja varten. Ruudut sisaltavat Pisteen tai
 * Hedelman ja tiedon siita mihin viereisiin ruutuihin voi liikkua.
 */
public class Ruutu {

    private Piste sisalto;
    private final int[] suunnat;

    /**
     * Luo Ruudun ja asettaa sisalloksi uuden Pisteen. Asettaa myös sallitut
     * kulkusuunnat luodessa arvoksi 0.
     */
    public Ruutu() {
        this.suunnat = new int[4];
        this.sisalto = new Piste();
        for (int i = 0; i < 4; i++) {
            suunnat[i]=0;
        }
    }
    
    /**
     * Palauttaa true tai false sen mukaan saako parametrin mukaiseen suuntaan
     * liikkua.
     * 
     * @param s
     * @param c Haluttu suunta
     * @return true jos saa liikkua, false jos ei
     */
    public boolean saakoLiikkua(Suunta s){
        if (s == Suunta.YLOS) {
            if (this.suunnat[0] == 1){
                return true;
            }
        } else if (s == Suunta.ALAS) {
            if (this.suunnat[1] == 1){
                return true;
            }
        } else if (s == Suunta.VASEN) {
            if (this.suunnat[2] == 1){
                return true;
            }
        } else if (s == Suunta.OIKEA) {
            if (this.suunnat[3] == 1){
                return true;
            }
        }       
        return false;       
    }
    
/**
 * Asettaa sallitut kulkusuunnat. 0 = saa liikkua ja 1 = ei saa liikkua.
 * 
 * @param a Ylos
 * @param b Alas
 * @param c Vasen
 * @param d Oikea
 */    
    void asetaSuuntaParametrit(int a, int b, int c, int d) {
        this.setYlos(a);
        this.setAlas(b);
        this.setVasemmalle(c);
        this.setOikealle(d);
    }
    
    /**
     * Vaihtaa ruudun sisallon pisteesta hedelmaan.
     * 
     * @param h uusi sisalto 
     */
    public void vaihdaPisteHedelmaan(Hedelma h) {
        this.sisalto = h;
    } 

    public Piste getSisalto() {
        return this.sisalto;
    }
    
    public void setSisalto(Piste sisalto) {
        this.sisalto = sisalto;
    }

    private void setYlos(int i) {
        if (i==0 || i==1){
            this.suunnat[0]=i;
        }         
    }

    private void setAlas(int i) {
        if (i==0 || i==1){
            this.suunnat[1]=i;
        } 
    }

    private void setVasemmalle(int i) {
        if (i==0 || i==1){
            this.suunnat[2]=i;
        } 
    }

    private void setOikealle(int i) {
        if (i==0 || i==1){
            this.suunnat[3]=i;
        } 
    }
}
