import java.util.Scanner;

public class clase {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Primer valor");
        int valor = leer.nextInt();
        System.out.println("SEgundo:");
        int valor2 = leer.nextInt();
        System.out.println(valor + "  :  " + valor2);
    }
}
