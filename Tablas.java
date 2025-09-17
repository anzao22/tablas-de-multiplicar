import java.util.Scanner;

public class Tablas {

    // For para imprimir la tabla de multiplicar de ese número desde 1 hasta 10. 

    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        System.out.println("🤓Quiero saber la tabla del❓: ");
        int x = sc.nextInt();
         sc.close();
        
        // Ciclo for para la tabla de multiplicar
            System.out.println("🔢La tabla del "+x+" es 📝:");

        for (int i = 1; i <= 10; i++) { //empieza en 1, max. 10, aumenta de a 1
            System.out.println(x + " x " + i + " = " + (x * i));//mostrar formato # x # = multiplicación
        }
     }
}
