package fcfmclases.practica4.labprogramacion;
/**PRACTICA 4 "CLASES ABSTRACTAS+INTERFACES"
 * INTERFACE
 * @since 12/02/2022
 * @author Omar Gallegos
 */
public class CalculadoraCientifica extends DispositivoElectronico implements IOperacionesEstandar, IOperacionesAvanzadas{
    @Override
    public void encender() {
    System.out.println(" ENCENDIENDO CALCULADORA...");
    System.out.println("                       \t CALCULADORA CIENTIFICA ENCENDIENDA!");
    }
    //
    @Override
    public double suma(double a, double b){
    return a+b;
    }
    //
    @Override
    public double resta(double a, double b){
    return a-b;
    }
    //
    @Override
    public double multpli (double a, double b){
    return a*b;
    }
    //
    @Override
    public double divi (double a, double b){
    return a/b;
    }
    //
    @Override
    public double raiz(double a){
    return Math.sqrt(a);
    }
    //
    @Override
    public double porcentaje(double a, double b){
    return a%b;
    }
    
}
