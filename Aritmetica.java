import java.util.Scanner;
//operaciones aritmeticas de 2 numeros
public class Aritmetica {
    int selector;
    float division, num1, num2;
    Scanner t=new Scanner(System.in);
    public float operacionesAritmeticas(){
        System.out.println("Ingresar primer valor: ");
        num1=t.nextFloat();// el usuario agrega el primer valor
        System.out.println("Ingresar segundo valor: ");
        num2=t.nextFloat();//el usuarioagrega el segundo valor
        System.out.println("Para sumar presionar 1 \npara restar presionar 2 \n" +
                "para multiplicar presionar 3 \npara dividir presionar 4 ");
        selector=t.nextInt(); // el usuario elige que operacion quiere efectuar seleccionando los numeros 1,2,3 o 4
        if(selector==1){
            System.out.println("La suma de ambos numeros es= " +(num1+num2));
        }
        else if (selector==2){
            System.out.println("La diferencia entre ambos numeros es= " +(num1-num2));
        }
        else if(selector==3){
            System.out.println("La multiplicacion de ambos numeros es= " +(num1*num2));
        }
        else if (selector==4){
            division=num1/num2;
            System.out.println("La division entre ambos numeros es= " + division);
        }
        else { //se muestra un mensaje por pantalla cuando se elige un numero diferente a los asignados
            System.out.println("no se ha seleccionado ninguna operacion valida ");
        }
        System.out.println("\n"+"\nFinalizado");
        return 0;
    }


}
