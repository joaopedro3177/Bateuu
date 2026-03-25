package br.senac.sp.bateu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Baralho {

    private List<Carta> cartas;

    public  Baralho(){
        cartas = new ArrayList<>();

        Naipe[] naipes = Naipe.values();


        for (int i = 0; i < naipes.length; i++){
            for (int numero = 1; numero <=13; numero++){
                Carta carta = new Carta(numero, naipes[i]);
                cartas.add(carta);
            }
        }
    }


    public Carta comprar(){
        if(cartas.size() > 0){
            Carta carta = cartas.get(0);
            cartas.remove(0);
            return carta;
        }
        return null;
    }

    public  void  embaralhar(){
        Random random = new Random();

        for (int i = 0; i < cartas.size(); i++){
            int posicaoAleatoria = random.nextInt(cartas.size());

            Carta temp = cartas.get(i);
            cartas.set(i, cartas.get(posicaoAleatoria));
            cartas.set(posicaoAleatoria, temp);
        }
    }
    public  List<Carta> getCartas(){
        return  cartas;
    }
}
