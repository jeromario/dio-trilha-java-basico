import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome");
        String nome = scanner.next();

        System.out.println("Por favor, digite o numero da conta");
        Integer numero = scanner.nextInt();

        System.out.println("Por favor, digite a sua agencia");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o saldo");
        Double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$ %.2f já está disponível para saque!",nome,agencia, numero, saldo);
    }
}
