package Esercizio_2;

import java.util.Arrays;

public class Sim {

   private long numero;
   private int credito = 0;
   private Chiamata[] chiamate;
    private int index = 0;

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public Chiamata[] getChiamate() {
        return chiamate;
    }

    public void setChiamate(Chiamata[] chiamate) {
        this.chiamate = chiamate;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Sim(int numero) {
        this.numero = numero;
        this.chiamate = new Chiamata[5];
    }
    public void datiSim() {
        System.out.println("i dati della sim sono : " + this.numero );
        System.out.println("Le chiamate sono : " + Arrays.toString(chiamate));

    }
    public void listaChiamate(int numero, int durata){
        Chiamata c = new Chiamata(numero , durata);
        if (index == 5){

            System.arraycopy(chiamate, 1, chiamate, 0, 4);
            index--;
        }
        chiamate[index] = c;
        index++;
    }

}


