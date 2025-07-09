package Model;

public class Batalha {
    public Ninja lutar (Ninja ninja1, Ninja ninja2) {

        System.out.println("Iniciando a batalha entre " + ninja1.nome + " e " + ninja2.nome);

        if (ninja1.nome.equalsIgnoreCase("itachi") || ninja2.nome.equalsIgnoreCase("itachi")) {
            System.out.println("Itachi entrou na batalha!");
            if (ninja1.nome.equals("Itachi")) {
                System.out.println(ninja1.nome + " venceu a batalha!");
                return ninja1;
            } else {
                System.out.println(ninja2.nome + " venceu a batalha!");
                return ninja2;
            }
        }
            for (int i = 0; i < 3; i++) {
                System.out.println("Rodada do ninja 1 n" + (i + 1) + ":");
                ninja1.atacar(ninja2);
                if (ninja2.chakra <= 0) {
                    System.out.println(ninja2.nome + " foi derrotado!");
                    return ninja1;
                }
                System.out.println("Rodada do ninja 2 n" + (i + 1) + ":");
                ninja2.atacar(ninja1);
                if (ninja1.chakra <= 0) {
                    System.out.println(ninja1.nome + " foi derrotado!");
                    return ninja2;
                }
            }
            if (ninja1.chakra > ninja2.chakra) {
                System.out.println(ninja1.nome + " venceu a batalha!");
                return ninja1;
            } else if (ninja2.chakra > ninja1.chakra) {
                System.out.println(ninja2.nome + " venceu a batalha!");
                return ninja2;
            } else {
                System.out.println("A batalha terminou em empate!");
                return ninja1;
            }
    }
}

