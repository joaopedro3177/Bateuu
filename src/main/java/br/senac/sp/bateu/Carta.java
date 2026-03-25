package br.senac.sp.bateu;

public class Carta {
    private int numero;
    private Naipe naipe;

    public Carta(int numero, Naipe naipe) {
        this.numero = numero;
        this.naipe = naipe;
    }

    public  String getImagem(){
        return  "/cartas/" + numero  + naipe +  ".png";
    }


    public  int getNumero(){
        return numero;
    }

    public Naipe getNaipe(){
        return  naipe;
    }
}
