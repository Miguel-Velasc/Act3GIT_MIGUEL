import java.util.Scanner;

public class NumerosIncremento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Introduce el segundo número (distinto al primero):");
        int numero2 = scanner.nextInt();

        // Validar que los números son distintos
        while (numero1 == numero2) {
            System.out.println("Los números deben ser distintos. Introduce el segundo número nuevamente:");
            numero2 = scanner.nextInt();
        }

        // Determinar el menor y mayor de los dos números
        int menor = Math.min(numero1, numero2);
        int mayor = Math.max(numero1, numero2);

        System.out.println("Números enteros comprendidos entre " + menor + " y " + mayor + ", incrementando de 7 en 7:");

        // Mostrar números incrementando de 7 en 7
        for (int i = menor; i <= mayor; i += 7) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
