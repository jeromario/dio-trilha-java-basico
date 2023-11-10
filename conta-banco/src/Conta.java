public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;
    

    public Conta(Banco banco,Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor){
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente!");
        }else{
            this.saldo -= valor;
        }
        
    }
    public void depositar(double valor){
        this.saldo += valor;
        
    }
    public void transferir(double valor, Conta contaDestino){
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente!");
        }else{
            this.sacar(valor);
            contaDestino.depositar(valor);
        }
        
        
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    protected void imprimirInfoContas(){
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
