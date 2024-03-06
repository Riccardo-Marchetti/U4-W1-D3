package Esercizio_3;

public class Carrello {
    private String cliente;
    private String elenco;
    private int totaleCosto;

    public Carrello(String cliente, String elenco, int totaleCosto){
        this.cliente = cliente;
        this.elenco = elenco;
        this.totaleCosto = totaleCosto;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getElenco() {
        return elenco;
    }

    public void setElenco(String elenco) {
        this.elenco = elenco;
    }

    public int getTotaleCosto() {
        return totaleCosto;
    }

    public void setTotaleCosto(int totaleCosto) {
        this.totaleCosto = totaleCosto;
    }
}
