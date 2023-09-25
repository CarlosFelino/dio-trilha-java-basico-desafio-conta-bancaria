import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados

        String nomeCli = nomeCliente(scanner); // Chama a função para obter o nome do cliente
        String agencia = numeroAgencia(scanner); // Chama a função para obter o número da agência
        String nConta = numeroConta(scanner);     // Chama a função para obter o número da conta
        double valorSaldo = saldoConta();      // Chama a função para obter o saldo inicial

        // Exibe uma mensagem de boas-vindas com os dados do cliente
        System.out.println("Olá " + nomeCli + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + nConta + " e seu saldo " + valorSaldo + " já está disponível para saque");

        scanner.close(); // Fecha o objeto Scanner para evitar vazamento de recursos
    }

    public static String nomeCliente(Scanner scanner) {
        System.out.println("Por favor, digite seu nome completo: ");
        return scanner.nextLine(); // Lê o nome do cliente a partir da entrada do usuário
    }

    public static String numeroConta(Scanner scanner) {
        System.out.println("Digite o número da sua conta que terá 4 números: ");
        return scanner.nextLine(); // Lê o número da conta a partir da entrada do usuário
    }

    public static String numeroAgencia(Scanner scanner) {
        System.out.println("Por favor, digite sua Agência: ");
        return scanner.nextLine(); // Lê o número da agência a partir da entrada do usuário
    }

    public static double saldoConta() {
        System.out.println("Seu saldo será inicial: ");
        return 142.13; // Retorna um saldo inicial fixo
    }
}