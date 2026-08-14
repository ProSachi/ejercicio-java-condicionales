import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int EDAD = 18;
        int edadUsuario;
        Scanner leer = new Scanner(System.in);

        System.out.println("Digame su edad: ");
        edadUsuario = leer.nextInt();
        if (edadUsuario >= EDAD) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No eres mayor de edad");
        }
        leer.close();
    }
}