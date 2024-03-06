package Esercizio_3;

public class Cliente {
   private int codice;
   private String nome;
    private String cognome;
    private String email;
   private Articolo[] carrello;
    private int dataIscrizione;
    public Cliente(int codice, String nome, String cognome, String email, int dataIscrizione){
        this.codice = codice;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataIscrizione = dataIscrizione;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Articolo[] getCarrello() {
        return carrello;
    }

    public void setCarrello(Articolo[] carrello) {
        this.carrello = carrello;
    }

    public int getDataIscrizione() {
        return dataIscrizione;
    }

    public void setDataIscrizione(int dataIscrizione) {
        this.dataIscrizione = dataIscrizione;
    }
}
