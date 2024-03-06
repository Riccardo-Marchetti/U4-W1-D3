package Esercizio_1;

public class Rettangolo {

   private int altezza;
   private int larghezza;

    public Rettangolo(int altezza, int larghezza) {
    this.altezza = altezza;
    this.larghezza = larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public void stampaRettangolo(){
        int perimetro = (this.altezza + this.larghezza) * 2;
        int area = this.larghezza * this.altezza;
        System.out.println("il perimetro è : " + perimetro + " l'area è : " + area);
    }
    public void stampaDueRettangoli(Rettangolo ret2) {
        int perimetro = (this.altezza + this.larghezza) * 2;
        int area = this.larghezza * this.altezza;
        int perimetro2 = (ret2.altezza + ret2.larghezza ) * 2;
        int area2 = ret2.larghezza * ret2.altezza;
        int sommaArea = area + area2;
        int sommaPerimetro = perimetro + perimetro2;
        System.out.println("la somma dell 'area è : " + sommaArea + " la somma dei perimetri è : " + sommaPerimetro);
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "altezza=" + altezza +
                ", larghezza=" + larghezza +
                '}';
    }
}
