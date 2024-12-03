import java.util.Scanner;

public class calculadora {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("~Calculadora~");
    System.out.println("Digite o primeiro número: ");
    double primeiroNumero = scanner.nextDouble();

    System.out.println("Escolha a operação (+, -, *, /): ");
    char operador = scanner.next().charAt(0);

    System.out.println("Digite o segundo número: ");
    double segundoNumero = scanner.nextDouble();

    double resultadoOperacao = 0;
    boolean operacaoValida = true;

  switch (operador) {
    case '+':
      resultadoOperacao = primeiroNumero + segundoNumero;
      break;
    case '-':
      resultadoOperacao = primeiroNumero - segundoNumero;
      break;
    case '*':
      resultadoOperacao = primeiroNumero * segundoNumero;
      break;
    case '/':
      if(segundoNumero != 0){
        resultadoOperacao = primeiroNumero / segundoNumero;
      }else{
        System.out.println("Erro: Não é possível dividir por 0");
        operacaoValida = false;
      }
      break;
    default:
      System.out.println("Erro: Operador inválido, digite um operador válido.");
      operacaoValida = false;
    }
    if (operacaoValida){
      System.out.println("Resultado: " + resultadoOperacao);
    }
    scanner.close();
  }
}
