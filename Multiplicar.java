import java.util.Scanner;
public class Multiplicar {
    int tabla, i, operacion;

    Scanner m = new Scanner(System.in);
    public Multiplicar( ){
        tabla=0;
        i=0;
        operacion=0;
    }


    public int  tablasMultiplicar() {
        System.out.println("TABLAS DE MULTIPLICAR:");
        System.out.println("Ingresar numero: ");
        tabla = m.nextInt(); // el usuario ingresa el numero de la tabla de  multiplicar

        for (i = 1; i <= 10; i++) {
            operacion = tabla * i;
            System.out.println(tabla + " x " + i + " = " + operacion);
        }System.out.println("\nFinalizado"); return 0;




    }


}








