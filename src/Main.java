import Model.Batalha;
import Model.Jutsu;
import Model.Ninja;

public class Main {
    public static void main(String[] args) {
        /*Jutsu jutsuNinjaUm = new Jutsu(5, 10);
        Ninja ninjaUm = new Ninja("Naruto", jutsuNinjaUm);
        Jutsu jutsuNinjaDois = new Jutsu(5, 8);
        Ninja ninjaDois = new Ninja("gaara", jutsuNinjaDois);
        Batalha batalha = new Batalha();
        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);*/


        Jutsu jutsuNinjaAtacante = new Jutsu(5, 10);
        Ninja ninjaAtacante = new Ninja("Naruto", jutsuNinjaAtacante);
        Jutsu jutsuNinjaOponente = new Jutsu(5, 8);
        Ninja ninjaOponente = new Ninja("Gaara", jutsuNinjaOponente);
        int nivelChakraEsperado = 90;
        ninjaAtacante.atacar(ninjaOponente);
    }
}