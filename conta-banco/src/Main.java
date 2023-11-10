public class Main {
    public static void main(String[] args) {
        
        Cliente je = new Cliente();
        je.setNome("Je");

        Conta cc = new ContaCorrente(je);
        Conta poupança = new ContaPoupanca(je);

        cc.depositar(1000);
        cc.transferir(200, poupança);

        cc.imprimirExtrato();
        System.out.println("------------------------------------------");
        poupança.imprimirExtrato();
    }
}
