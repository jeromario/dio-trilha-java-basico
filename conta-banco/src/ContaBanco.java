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

        System.out.printf("Ol� %s, obrigado por criar uma conta em nosso banco, sua ag�ncia � %s, conta %d e seu saldo R$ %.2f j� est� dispon�vel para saque!",nome,agencia, numero, saldo);
    }
}
