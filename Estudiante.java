import java.util.Scanner;

public class Estudiante {
    int hermanos, edad, selector;
    float salario;
    String nombre,apellido,carrera,aplica;
    Scanner e= new Scanner(System.in);

    public String aplicaBecas(){
        System.out.println("Nombre: ");
        nombre=e.next();
        System.out.println("Apellido: ");
        apellido=e.next();
        System.out.println("Edad: ");
        edad=e.nextInt();
        System.out.println("Numero de Hermanos: ");
        hermanos=e.nextInt();
        System.out.println("Salario: ");
        salario=e.nextFloat();
        if(hermanos>=3&& salario<=5&& edad>=15 &&edad<=30){
            aplica="Si aplica en el programa de Becas";
        }
        else {
            aplica="No aplica para el programa de Becas";
        }
        System.out.println("Elija el numero de la carrera desea estudiar: \n"+"1. Ingenieria de Sistemas \n2. Enfermeria \n3. Psicologia " +
                "\n4. Ingenieria Civil");
        selector=e.nextInt();
        if(selector==1){
            carrera="Ingenieria de Sistemas";
        }
        else if (selector==2){
            carrera= "Enfermeria";
        }
        else  if (selector==3){
            carrera="Psicologia";
        }
        else if(selector==4){
            carrera="Ingenieria Civil";
        }
        else {
            carrera="No ha elegido una Carrera";
        }

        return "Nombre completo: " +nombre+" "+apellido+" \nEdad: "+edad+"\nCantidad de hermanos: "+hermanos+
                "\nSalario: "+ salario+"\nCarrera a Estudiar: "+carrera+"\n"+aplica;
    }

}
