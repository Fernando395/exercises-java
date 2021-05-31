public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println(this.getLigado());
        System.out.println(this.getTocando());
        System.out.println(this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print("[]");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu");
    }

    @Override
    public void maisVolume() {
        if (getLigado()) {
            this.setVolume(getVolume() + 1);
        } else {
            System.out.println("interface desligada");

        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(getVolume() - 1);
        } else {
            System.out.println("interface desligada");
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        } else {
            System.out.println("interface desligada");

        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }

    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            setTocando(true);
        }
    }


    @Override
    public void pause() {
        if (getLigado() && this.getTocando()) {
            this.setTocando(false);
        } else {
            System.out.println("interface desligada");
        }
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int v) {
        this.volume = v;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean l) {
        this.ligado = l;
    }

    public boolean getTocando() {
        return this.tocando;
    }

    public void setTocando(boolean t) {
        this.tocando = t;
    }
}
