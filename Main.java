import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int EDAD = 18;
        int edadUsuario;
        String poseerLicencia;
        Scanner leer = new Scanner(System.in);

        System.out.println("Digame su edad: ");
        edadUsuario = leer.nextInt();
        
        System.out.println("Tienes licencia de conducción: Si o No ");
        poseerLicencia = leer.next().toLowerCase();



        if (edadUsuario >= EDAD && poseerLicencia =="si") {
            System.out.println("Puede conducir");
        } else {
            System.out.println("No puede condicir");
        }

        leer.close();
    }
}