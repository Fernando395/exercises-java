package ultimateFightingChampionship;

import java.util.Random;

public class Luta {
    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovado;

    public Luta() {

    }


    public void marcarLuta(Lutador lutador1, Lutador lutador2) {
        if (lutador1.getCategoria().equals(lutador2.getCategoria()) && (lutador1 != lutador2)) {
            this.desafiado = lutador1;
            this.desafiante = lutador2;
            aprovado = true;
        } else {
            this.desafiante = null;
            this.desafiado = null;
            aprovado = false;

        }
    }

    public void lutar() {
        if (aprovado) {
            System.out.println("Desafiado");
            this.desafiado.apresentar();
            System.out.println("--------------------");
            System.out.println("Desafiante");
            this.desafiante.apresentar();
            System.out.println("--------------------");
            System.out.println("Resultado da luta");

            Random aleatório = new Random();
            int vencedor = aleatório.nextInt(3);
            switch (vencedor) {
                case 0:
                    System.out.println("Empate!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("Lutador vencedor " + this.desafiado.getPeso());
                    this.desafiante.perderLuta();
                    this.desafiado.ganharLuta();
                    break;
                case 2:
                    System.out.println("Lutador vencedor " + this.desafiante.getPeso());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;

            }

        } else {
            System.out.println("Luta não pode acontecer");
        }
    }


    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }


}
