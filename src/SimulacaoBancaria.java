import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;
        //double deposito = 0;
        //double saque = 0;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:

                    System.out.println("Digite o valor a ser depositado: ");
                    double deposito = scanner.nextDouble();
                    saldo = saldo + deposito;
                    System.out.println("Saldo atual: "+String.format("%.1f",saldo));
                    break;
                case 2:

                    System.out.println("Digite o valor a ser sacado: ");
                    double saque = scanner.nextDouble();
                    if(saque>saldo){
                        System.out.println("Saldo insuficiente");
                    }else{
                        saldo = saldo - saque;
                        System.out.println("Saldo atual: "+String.format("%.1f",saldo));
                    }
                    break;
                case 3:

                    System.out.println("Saldo atual: "+String.format("%.1f",saldo));
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}