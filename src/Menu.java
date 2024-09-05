import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Menu m = new Menu();
        m.showMenu(sc);
    }

    public void showMenu(Scanner sc) {
        int op = 0;
        Soma sum = new Soma();
        System.out.println("Bem vindo");
        System.out.println("Este programa é uma calculadora onde opera com dois números");
        do {
            try {
                System.out.println("Digite a operação desejada");
                System.out.println("--------------------------");
                System.out.println("-     1) Soma            -");
                System.out.println("-     2) Subtração       -");
                System.out.println("-     3) Multiplicação   -");
                System.out.println("-     4) Divisão         -");
                System.out.println("-     0) Sair            -");
                System.out.println("--------------------------");
                op = sc.nextInt();
                switch(op) {
                    case 0:
                        System.exit(0);
                    case 1:
                        sum.menuSoma(sc);
                        sum.escreverResultado();
                        System.exit(0);
                    case 2:
                        //subtração
                    case 3:
                        //multiplicação
                    case 4:
                        //divisão
                    default:
                        System.out.println("Opção inválida");
                }
            } catch(InputMismatchException ime) {
                System.err.println("Digite apenas números, tente novamente");
                op = 0;
            }
        } while(op > 0);
    }
}
