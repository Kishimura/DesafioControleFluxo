import java.util.Scanner;

public class EquilibrandoSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();

       //TODO: Calcular o saldo atualizado de acordo com a descrição deste desafio.
       saldoAtual = valorDeposito - valorRetirada;

       String numeroFormatado = String.format("%.1f", saldoAtual);
       
       System.out.println("Saldo atualizado na conta: " + saldoAtual);

     //TODO: Imprimir o a saída de conforme a tabela de exemplos (uma casa decimal).1
    }
}