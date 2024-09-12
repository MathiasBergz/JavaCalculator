import java.util.InputMismatchException;
import java.util.Scanner;

public class Multi {
    private double value1;
    private double value2;
    private double result;
    private boolean error = false;

    public Multi() {

    }

    public void menuMultiplicacao(Scanner sc) {
                System.out.println("Digite o primeiro número: ");
                this.value1 = sc.nextDouble();
                System.out.println("Digite o segundo número: ");
                this.value2 = sc.nextDouble();
                this.result = this.value1 * this.value2;
    }

    public void escreverResultado() {
        System.out.println("O resultado da soma " + value1 + " " + value2 + " é: " + result);
    }
}
