import java.util.Scanner;

public class Promedio {
    Scanner f=new Scanner(System.in);
   private float nota1, nota2, nota3;
    float promediofn;

    public float getPromediofn() {
        System.out.println("ingrese la Primera nota: ");
        nota1=f.nextFloat();
        System.out.println("ingrese la Segunda nota: ");
        nota2=f.nextFloat();
        System.out.println("ingrese la Tercera nota: ");
        nota3=f.nextFloat();
        promediofn=(nota1+nota2+nota3)/3;
        if(promediofn>=75){
            System.out.println("Aprobado!!! ");
        }
        else{
        System.out.println("Reprobado!!! ");}
        return promediofn;
    }



}
