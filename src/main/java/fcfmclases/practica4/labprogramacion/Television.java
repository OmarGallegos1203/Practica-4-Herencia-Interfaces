package fcfmclases.practica4.labprogramacion;
/** PRACTICA 4 "CLASES ABSTRACTAS+INTERFACES"
 * CLASE HIJA 
 * @since 12/02/2022
 * @author Omar Gallegos
 */
public class Television extends DispositivoElectronico{
    @Override
    public void encender(){
    System.out.println("ENCENDIENDO TELEVISION...");
    System.out.println("                  \tTELEVISION ENCENDIENDA!");
    }
    //PROPIEDADES
    private String color;
    //METODOS
    public String cambiarCanal(){
    return "CANAL CAMBIADO!";
    }
    //
    public String subirVolumen(){
    return "SUBIENDO VOLUMEN!"; 
    }
    //METODOS PARA LA INTERFACE
    public String configResol(){
    return "CONFIGURANDO RESOLUCION!";
    }
    public String configColor(){
    return "CONFIGURANDO COLOR!";
    }
    public String configSonido(){
    return "CONFIGURANDO SONIDO!";
    }

   //ENCAPSULAMIENTO DE COLOR (GET Y SET)
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
 