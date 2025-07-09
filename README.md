# Ninja Way - Batalha Ninja

Projeto simples em Java para simular batalhas entre ninjas, inspirado no universo de Naruto. Cada ninja possui um nome, chakra e um jutsu principal, podendo atacar outros ninjas e receber golpes.

## Estrutura

- `src/Model/Ninja.java`: Classe que representa um ninja, com métodos para atacar e receber golpes.
- `src/Model/Jutsu.java`: Classe que representa um jutsu, com dano e quantidade de chakra necessária.
- `src/Model/Batalha.java`: (Opcional) Pode conter lógica para batalhas entre dois ninjas.
- `src/Main.java`: Classe principal para executar o programa.

## Como funciona

- Cada ninja tem um nome, um valor de chakra (energia) e um jutsu principal.
- O método `atacar` permite que um ninja ataque outro, consumindo chakra e causando dano.
- O método `receberGolpe` reduz o chakra do ninja ao receber dano.

## Como rodar

1. Compile os arquivos Java:
   ```
   javac src/Model/*.java src/Main.java
   ```
2. Execute o programa principal:
   ```
   java -cp src Main
   ```

## Exemplo de uso

```java
Jutsu rasengan = new Jutsu("Rasengan", 30, 20);
Ninja naruto = new Ninja("Naruto", rasengan);
Ninja sasuke = new Ninja("Sasuke", new Jutsu("Chidori", 25, 18));

naruto.atacar(sasuke);
```

## Samuel Dantas de Albuquerque

Projeto desenvolvido para fins de estudo.

