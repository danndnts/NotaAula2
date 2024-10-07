import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        String r;
        String r2;
        do {

            System.out.println("Digite 0 se for Conta Corrente e 1 se for Conta Poupança");
            int opcao = scanner.nextInt();

            System.out.println("Digite o nome do titular: ");
            p.setNome(scanner2.nextLine());
            System.out.println("Digite o cpf do titular: ");
            p.setCpf(scanner2.nextLine());

            do {

                switch (opcao) {
                    case (0):
                        System.out.println("Conta Corrente");
                        System.out.println("Oque deseja fazer? 1.Depositar 2.Sacar 3.Cheque Especial 4.Exibir dados da conta");
                        int opcao2 = scanner.nextInt();
                        switch (opcao2) {
                            case (1):
                                System.out.println("Qual o valor que deseja depositar? ");
                                cc.setValor(scanner.nextDouble());
                                cc.depositar();
                                break;
                            case (2):
                                System.out.println("Qual o valor que deseja sacar? ");
                                cc.setValor(scanner.nextDouble());
                                cc.sacar();
                                break;
                            case (3):
                                cc.chequeEspecial();
                                break;
                            case (4):
                                cc.exibirDados();
                                break;
                        }
                        break;
                    case (1):
                        System.out.println("Conta Poupanca");
                        System.out.println("Oque deseja fazer? 1.Depositar 2.Sacar 3. Calcular rendimento 4.Exibir dados da conta");
                        int opcao3 = scanner.nextInt();
                        switch (opcao3) {
                            case (1):
                                System.out.println("Qual o valor que deseja depositar? ");
                                cp.setValor(scanner.nextDouble());
                                cp.depositar();
                                break;
                            case (2):
                                System.out.println("Qual o valor que deseja sacar? ");
                                cp.setValor(scanner.nextDouble());
                                cp.sacar();
                                break;
                            case 3:
                                if (cp.getSaldo() > 0) {
                                    cp.calcularRendimento();
                                } else {
                                    System.out.println("Você precisa ter saldo na conta para calcular o rendimento.");
                                }
                                break;

                            case (4):
                                cp.exibirDados();
                                break;

                        }
                        break;

                }
                System.out.println("Deseja fazer outras operações, digite S, caso nâo queira digite N");
                r = scanner.next();

            } while (r.equalsIgnoreCase("S"));

            System.out.println("Deseja cadastrar um novo usuário, digite S");
            r2 = scanner.next();
        } while (r2.equalsIgnoreCase("S"));
    }
}