
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Por favor, digite o numero da Conta: ");
            int numero = scanner.nextInt();
            scanner.nextLine();
            
            System.out.println("Por favor, digite o numero da Agencia: ");
            String agencia = scanner.nextLine();
            
            System.out.println("Usuario: ");
            String nome_cliente = scanner.nextLine();
            
            System.out.println("Digite o seu Saldo: ");
            Double saldo = scanner.nextDouble();
            
            System.out.println("\nOla " + nome_cliente + ", obrigado por criar uma conta em nosso banco.");
            System.out.println("Sua agencia e " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " ja esta disponivel para saque.");
        }
    }

}
