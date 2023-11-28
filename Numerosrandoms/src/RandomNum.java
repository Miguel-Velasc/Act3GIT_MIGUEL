import java.util.Random;

public class RandomNum {

    public static void main(String[] args) {
        mostrarNumerosAleatorios(30);
    }

    public static void mostrarNumerosAleatorios(int cantidad) {
        Random random = new Random();

        System.out.println(cantidad + " números aleatorios entre 1 y 10:");

        for (int i = 0; i < cantidad; i++) {
            int numeroAleatorio = random.nextInt(10) + 1;
            System.out.print(numeroAleatorio + " ");
        }
    }
}
