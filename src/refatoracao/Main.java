package refatoracao;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PrintStream writer = System.out;
        Scanner scanner = new Scanner(System.in);
        int numTermos;
        int primeiroTermo;
        int razao;

        numTermos = leNmrTermos(scanner, writer);
        primeiroTermo = lePrimeiroTermo(scanner, writer);
        razao = leRazaoPA(scanner, writer);
        imprimeTermos(writer, primeiroTermo, numTermos, razao);
        retornaSoma(writer, primeiroTermo, numTermos, razao);

        writer.close();
        scanner.close();
    }

    public static void imprimeTermos(PrintStream writer, int primeiroTermo, int numTermos, int razao) {
        int posicao;
        int termo;
        for (posicao = 1; posicao <= numTermos; posicao++) {
            termo = primeiroTermo + ((posicao - 1) * razao);
            writer.printf("a%d=%d\n", posicao, termo);
        }
    }

    public static void retornaSoma(PrintStream writer, int primeiroTermo, int numTermos, int razao) {
        int soma;
        soma = ((primeiroTermo + (primeiroTermo + (numTermos - 1) * razao)) * numTermos) / 2;
        writer.printf("A soma é:%d\n", soma);
    }

    public static int leNmrTermos(Scanner scanner, PrintStream writer) {
        int num;
        do {
            writer.println("Digite o número de termos de PA:");
            num = scanner.nextInt();
        } while (num < 2);
        return num;
    }

    public static int lePrimeiroTermo(Scanner scanner, PrintStream writer) {
        int num;
        do {
            writer.println("Digite o primeiro termo de PA:");
            num = scanner.nextInt();
        } while (num < 1);
        return num;
    }

    public static int leRazaoPA(Scanner scanner, PrintStream writer) {
        int num;
        do {
            writer.println("Digite a razão de PA:");
            num = scanner.nextInt();
        } while (num < 1);
        return num;
    }
}
