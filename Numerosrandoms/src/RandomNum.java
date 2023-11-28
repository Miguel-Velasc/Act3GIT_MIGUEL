import java.util.Random;

public class RandomNum  {

    public static void main(String[] args) {
        mostrarNumerosAleatorios();
    }

    public static void mostrarNumerosAleatorios() {
        Random random = new Random();

        System.out.println("20 números aleatorios entre 1 y 10:");

        for (int i = 0; i < 20; i++) {
            int numeroAleatorio = random.nextInt(10) + 1;
            System.out.print(numeroAleatorio + " ");
        }
    }
}
