package Model;

public class Jutsu {
    private final int quantidadeChakra;
    private final int dano;

    public Jutsu(int quantidadeChakra, int dano) {
        if (quantidadeChakra > 5) {
            this.quantidadeChakra = 5;
        }else{
            this.quantidadeChakra = quantidadeChakra;
        }
        if (dano > 10) {
            this.dano = 10;
        }else{
            this.dano = dano;
        }
    }
    public int getQuantidadeChakra() {
        return quantidadeChakra;
    }
    public int getDano() {
        return dano;
    }
}
