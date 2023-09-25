import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // Cria um Scanner para entrada de dados

        String nomeCli = nomeCliente(scanner);
        String agencia = numeroAgencia(scanner);
        String nConta = numeroConta(scanner);
        double valorSaldo = saldoConta();
        
        System.out.println("Olá " + nomeCli + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + nConta + " e seu saldo " + valorSaldo + " já está disponível para saque");

        // Fecha o Scanner após o uso
        scanner.close();
    }

    public static String nomeCliente(Scanner scanner) {
        System.out.println("Por favor, digite seu nome completo: ");
        return scanner.nextLine();
    }

    public static String numeroConta(Scanner scanner) {
        System.out.println("Digite o número da sua conta que terá 4 números: ");
        return scanner.nextLine();
    }

    public static String numeroAgencia(Scanner scanner) {
        System.out.println("Por favor, digite sua Agência: ");
        return scanner.nextLine();
    }

    public static double saldoConta() {
        System.out.println("Seu saldo será inicial: ");
        return 142.13;
    }
}
