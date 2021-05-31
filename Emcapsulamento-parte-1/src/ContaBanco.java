// tipo: cc = contacorrente  cp = contapoupança
// metodo abrir conta ganha false ou true
// abrir conta cc ganha 50 reais abrir conta cp ganha 150reais
// metodo fechar conta não pode ter saldo na conta nem saldo devedor
// metodo depositar precisa que a conta esteja aberta = status true
// metodo sacar precisa ter status true e ter dinheiro na conta e não permitir saques maiores que o valor do saldo
// metodo pagarmensalidade conta cc paga 12 reais conta cp paga 20 reais.
// construtor recebe: status falso,saldo 0,


public class ContaBanco {
    public int numeroDaConta;
    protected String tipoDeConta;
    private String nomeDoDono;
    private double saldo;
    private boolean status;

    public ContaBanco(String tipoDeConta,String nomeDoDono) {
        this.tipoDeConta = tipoDeConta;
        this.setNomeDoDono(nomeDoDono);
        this.setSaldo(0);
        this.setStatus(true);
        this.setNumeroDaConta(1);
    }

    public void estadoAtual() {
        System.out.println("conta " + this.getNumeroDaConta());
        System.out.println("no nome de " + this.getNomeDoDono());
        System.out.println("do tipo " + this.getTipoDeConta());
        System.out.println("com saldo " + this.getSaldo());
        System.out.println("que esta " + this.getStatus());
    }

    public void abrirConta(String t) {
        this.setTipoDeConta(t);
        this.setStatus(true);
        if (t.equals("cc")) {
            this.setSaldo(50);
        } else if (t.equals("cp")) {
            this.setSaldo(150);
            System.out.println("conta aberta com sucesso");
        }

    }


    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("erro a saldo na conta");
        } else if (this.getSaldo() < 0) {
            System.out.println("erro o saldo da conta esta negativo");
        } else {
            this.setStatus(false);
            System.out.println("conta fechada com sucesso");
        }

    }

    public void depositar(double v) {
        if (this.getStatus()) {
            this.setSaldo(getSaldo() + v);
            System.out.println("deposito realizado com sucesso na conta" + getNumeroDaConta());
        } else {
            System.out.println("erro deposito não realizado");

        }
    }

    public void sacar(double v) {
        if (this.getStatus()) {

            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("saque realizado com sucesso na conta " + getNumeroDaConta());
            } else {
                System.out.println("saldo abaixo do valor especificado");
            }

        } else {
            System.out.println("erro conta fechada");
        }
    }

    public void pagarMensalidade() {
        int v = 0;
        if (this.getTipoDeConta().equals("cc")) {
            v = 12;
        } else if (this.getTipoDeConta().equals("cp")) {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("mensalidade paga por " + this.getNomeDoDono());
        } else {
            System.out.println("impossivel pagar uma conta fechada");
        }
    }


    public String getTipoDeConta() {
        return this.tipoDeConta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean getStatus() {
        return this.status;
    }

    public int getNumeroDaConta() {
        return this.numeroDaConta;
    }

    public String getNomeDoDono() {
        return this.nomeDoDono;
    }

    public void setNomeDoDono(String nomeDoDono) {
        this.nomeDoDono = nomeDoDono;
    }

    public void setNumeroDaConta(int n) {
        this.numeroDaConta = n;
    }

    public void setSaldo(double v) {
        this.saldo = v;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

}
