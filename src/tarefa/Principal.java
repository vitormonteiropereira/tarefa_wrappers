package tarefa;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor numérico: ");

        int valorPrimitivo = scanner.nextInt();

        Integer valorWrapper = valorPrimitivo;

        System.out.println("Valor primitivo: " + valorPrimitivo);
        System.out.println("Valor wrapper: " + valorWrapper);
    }
}
