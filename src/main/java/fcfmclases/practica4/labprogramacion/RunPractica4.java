package fcfmclases.practica4.labprogramacion;
/** PRACTICA 4 "CLASES ABSTRACTAS+INTERFACES"
 * CLASE HIJA 
 * @since 12/02/2022
 * @author Omar Gallegos
 */
public class RunPractica4 {
    public static void main(String[] args) {
        //SALIDA
        System.out.println("\tDISPOSITIVOS ELECTRONICOS");
        System.out.println("TELEVISION");
        //DATOS TELEVISION
        Television smartv = new Television();
        smartv.setMarca("Samsung");
        smartv.setModelo("QLED8K");
        smartv.setColor("#000000-Negro");
        //PRINT TELEVISION
        System.out.println("Marca: "+smartv.getMarca());
        System.out.println("Modelo: "+smartv.getModelo());
        System.out.println("Color: "+smartv.getColor());
        System.out.println("\t\"VERIFICACION DEL DISPOSITIVO\"");
        System.out.print("OPCION ENCENDER:\t");
        smartv.encender();
        System.out.println("OPCION CAMBIAR CANAL:\t"+smartv.cambiarCanal());
        System.out.println("OPCION SUBIR VOLUMEN:\t"+smartv.subirVolumen());
        System.out.println("OPCION CONFIGURACION RESOLUCION:\t\t"+smartv.configResol());//INTERFACE
        System.out.println("OPCION CONFIGURACION COLOR:\t\t\t"+smartv.configColor());//INTERFACE
        System.out.println("OPCION CONFIGURACION SONIDO:\t\t\t"+smartv.configSonido());//INTERFACE
        
        
        
        System.out.println("\t\"VERIFICACION DEL DISPOSITIVO TERMINADA\"");
        //DATOS CALCULADORA CIENTIFICA
        CalculadoraCientifica calcusio = new CalculadoraCientifica();
        calcusio.setMarca("Casio");
        calcusio.setModelo("fx-115ES PLUS");
        //PRINT CALCULADORA CIENTIFICA
        System.out.println("CALCULADORA CIENTIFICA");
        System.out.println("Marca: "+calcusio.getMarca());
        System.out.println("Modelo: "+calcusio.getModelo());
        System.out.println("\t\"VERIFICACION DEL DISPOSITIVO\"");
        System.out.print("OPCION ENCENDER:\t");
        calcusio.encender();
        System.out.println("OPCION SUMA:             7.5+13.56= "+calcusio.suma(7.5, 13.56));
        System.out.println("OPCION RSTA:             8.48-6.96= "+calcusio.resta(8.48, 6.96));
        System.out.println("OPCION MULTIPLICACION:   (6.16)*(1.38)= "+calcusio.multpli(6.16, 1.38));
        System.out.println("OPCION DIVISION:         20/19= "+calcusio.divi(20, 19));
        System.out.println("OPCION PORCENTAJE (RESTO):\t20/19= "+calcusio.porcentaje(238.00, 3.5));//INTERFACE
        System.out.println("OPCION RAIZ:\t\t\t 81= "+calcusio.raiz(81));//INTERFACE
        System.out.println("\t\"VERIFICACION DEL DISPOSITIVO TERMINADA\"");
    }
}
