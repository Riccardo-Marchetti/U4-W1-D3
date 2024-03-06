package Esercizio_1;

public class Main {
    public static void main(String[] args) {
        Rettangolo primo = new Rettangolo(5 , 10);
        Rettangolo secondo = new Rettangolo(8 , 14);
        primo.stampaRettangolo();
        secondo.stampaRettangolo();
        primo.stampaDueRettangoli(secondo);

    }
}