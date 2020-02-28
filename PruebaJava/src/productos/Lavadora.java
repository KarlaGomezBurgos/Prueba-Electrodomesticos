package productos;

import tiendaElectronica.Electrodomesticos;

public class Lavadora extends Electrodomesticos {
    
    //CONSTANTE
    private static final double CARGA = 5;
    
    //ATRIBUTO
    private double carga;
    
    /**
     * Constructor por defecto
     */
    public Lavadora() {
        super();
        this.carga = CARGA;
    }
    /**
     * Constructor con dos parametros
     * @param precioBase
     * @param peso
     */
    public Lavadora(long precioBase, double peso) {
        super(precioBase, peso );
    }
    
    /**
     * Constructor con todos los atributos 
     * @param precioBase
     * @param carga
     * @param color
     * @param consumoEnergetico
     * @param peso
     */
    public Lavadora(long precioBase, double carga, String color, char consumoEnergetico,
            double peso) {
        super(precioBase, peso, consumoEnergetico, color);
        this.carga = carga;
    }

    //METODO GET
    /**
     * @return the carga
     */
    public double getCarga() {
        return carga;
    }
    
    //METODO PUBLICO
    /**
     * Metodo que llama precioFinal de la clase padre, donde al precio final del 
     * electrodomestico se agrega el valor correspondiente a la caracteristica de lavadora
     */
    public double precioFinal() {
        double aumento=super.precioFinal();
        if (carga>30) {//se le agregan 50 euros
            return aumento+=50;
        }
    return aumento;
    }

}
