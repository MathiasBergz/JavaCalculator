import java.util.InputMismatchException;
import java.util.Scanner;

public class Subtracao {
    private double value1;
    private double value2;
    private double result;
    private boolean error = false;

    public Subtracao() {

    }

    public void menuSubtracao(Scanner sc) {
        do {
            try {
                System.out.println("Digite o primeiro número: ");
                this.value1 = sc.nextDouble();
                System.out.println("Digite o segundo número: ");
                this.value2 = sc.nextDouble();
                this.result = this.value1 - this.value2;
            } catch (InputMismatchException ime) {
                System.err.println("Digite apenas números");
                this.error = true;
            }
        } while(this.error);
    }

    public void escreverResultado() {
        System.out.println("O resultado da subtração " + value1 + " " + value2 + " é: " + result);
    }
}
