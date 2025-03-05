import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        /*
        TODlists: conehcer e importar a classe scanner
        Exibir as mensagens
        obtar pelo scanner o valor do tarminal
        printar a mensagem da conta criada
        */
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite seu saldo:");
        double saldo = scanner.nextDouble();
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.println("Por favor, digite o seu nome:");
        String nome = scanner.nextLine();
        scanner.close();



        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %.2f já está disponível para saque.", nome, agencia, numero, saldo));
    }
}
