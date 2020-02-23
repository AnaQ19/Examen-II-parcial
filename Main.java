
public class Main {
    public static void main(String [] args){

        Multiplicar tabla1= new Multiplicar();
        Aritmetica operacion1= new Aritmetica();
        Promedio promedio1=new Promedio();
        Estudiante est1=new Estudiante();
       System.out.println(operacion1.operacionesAritmeticas());
       System.out.println(tabla1.tablasMultiplicar());
       System.out.println(promedio1.getPromediofn());
       System.out.println(est1.aplicaBecas());


    }
}
