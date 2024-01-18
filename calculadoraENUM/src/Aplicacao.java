import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        var primeiroValor = sc.nextDouble();

        System.out.println("Informe outro valor:");
        var segundoValor = sc.nextDouble();
        sc.nextLine(); //bug do scanner

        System.out.println("Informe uma operacão [+,-,*,/]");
        var operacao = sc.nextLine();
        var calculadora = Calculadora.from(operacao);
        var resultado = calculadora.calcular(primeiroValor, segundoValor);
        System.out.println(resultado);
    }

}
