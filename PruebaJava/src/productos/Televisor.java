package productos;

import tiendaElectronica.Electrodomesticos;

public class Televisor extends Electrodomesticos {
    
    //CONSTANTES
    private static final double RESOLUCION = 20;
    private static final boolean SINTONIZADOR_TNT = false;
    
    //ATRIBUTOS
    private double resolucion;
    private boolean sintoTDT;
    
    /**
     * Constructor por defecto
     */
    public Televisor() {
        super();
        this.resolucion= RESOLUCION;
        this.sintoTDT= SINTONIZADOR_TNT;
    }
    /**
     * Constructor con dos parametros
     * @param precioBase
     * @param peso
     */
    public Televisor(long precioBase, double peso) {
        super(precioBase, peso);
    }
    /**
     * Constructor con todos los atributos
     * @param precioBase
     * @param color
     * @param consumoEnergetico
     * @param peso
     * @param resolucion
     * @param sintoTDT
     */
    public Televisor(long precioBase, String color, char consumoEnergetico,
            double peso, double resolucion, boolean sintoTDT) {
        super(precioBase, peso, consumoEnergetico, color);
        this.resolucion=resolucion;
        this.sintoTDT = sintoTDT;
    }
    

    //METODOS GET 
    /**
     * @return the resolucion
     */
    public double getResolucion() {
        return resolucion;
    }

    /**
     * @return the sintoTDT
     */
    public boolean isSintoTDT() {
        return sintoTDT;
    }
    
    //METODOS 
    /**
     * Metodo que llama a precioFinal de la clase padre, donde al precio final 
     * del electrodomestico se agrega el valor 
     * correspondiente a las caracteristicas del televisor
     */
    public double precioFinal() {
        double aumento=super.precioFinal();
        if (resolucion>40) {
           aumento+=precioBase*1.3;
        }
        if (sintoTDT=true) {
            aumento+=50;
        }
        return aumento;
    }

}
