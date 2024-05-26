import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // todo: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);

        // todo: Exibir mensagem para o nosso usuário
        // todo: Obter os valores digitados com scanner no terminal
        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da sua conta:");
        int conta = scanner.nextInt();

        System.out.println("Por favor, digite o seu saldo");
        double saldo = Double.parseDouble(scanner.next());

        // todo: Exibir a mensagem da conta criada com concat(me obrigaram ;w;)
        String mensagemParaCliente = "Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é " + agencia).concat(", conta ").concat(conta+" e seu saldo ").concat(saldo+" já está disponível para saque");
        
        System.out.println(mensagemParaCliente);

        scanner.close();
    }
}
