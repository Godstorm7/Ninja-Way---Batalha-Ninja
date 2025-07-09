package Model;

public class Ninja {
    String nome;
    int chakra;
    Jutsu jutsuPrincipal;

    public Ninja(String nome, Jutsu jutsuPrincipal) {
        this.nome = nome;
        if (chakra <= 100) {
            this.chakra = 100;
        }else{
            this.chakra = chakra;
        }
        this.jutsuPrincipal = jutsuPrincipal;
    }
    public void atacar(Ninja ninja){
        ninja.receberGolpe(this.jutsuPrincipal.getDano());
        System.out.println("Atacando " + ninja.nome + " com o jutsu " + this.jutsuPrincipal.getDano() + " de dano.");
        this.chakra -= jutsuPrincipal.getQuantidadeChakra();
        System.out.println("Chakra restante: " + this.chakra);
    }

    public void receberGolpe(int dano) {
        this.jutsuPrincipal.getDano();
        this.chakra -= dano;
        System.out.println("Recebendo golpe de " + dano + " de dano. Chakra restante: " + this.chakra);
    }
}
