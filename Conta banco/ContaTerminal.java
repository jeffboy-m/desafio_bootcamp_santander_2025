import java.util.Scanner;


public class ContaTerminal {

    public static void main(String[] args) {
    var scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta:");
        String numeroConta = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta:");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s e sua conta %s. " +
                          "Seu saldo de R$%.2f já está disponível para saque.%n", 
                          nomeCliente, agencia, numeroConta, saldo);

        scanner.close();

    }
}