package tiendaElectronica;

public class Electrodomesticos {
    
    //Constantes
    private static final long PRECIO_BASE =112;//euros
    private static final String COLOR = "blanco";
    private static final char CONSUMO_ENERGETICO = 'F';
    private static final double PESO = 5;
    
    
    //Atributos
    public long precioBase;
    private String color;
    private char consumoEnergetico;
    private double peso;
    
    
    /**
     * Constructor por defecto
     */
    public Electrodomesticos() {
        this.precioBase = PRECIO_BASE;
        this.color = COLOR;
        this.consumoEnergetico = CONSUMO_ENERGETICO;
        this.peso = PESO;
    }
    
    /**
     * Constructor con dos parametros
     * @param precioBase
     * @param peso
     */
    public Electrodomesticos(long precioBase, double peso) {
        this();
        this.precioBase = precioBase;
        this.peso = peso;
    }

    /**
     * Constructor con todos los atributos
     * @param precioBase
     * @param peso
     * @param consumoEnergetico
     * @param color
     */
    public Electrodomesticos(long precioBase, double peso, char consumoEnergetico, String color) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.consumoEnergetico = consumoEnergetico;
        this.color = color;
        precioFinal();
        comprobarColor(color);
    }

    //METODOS Get
    /**
     * @return the precioBase
     */
    public long getPrecioBase() {
        return precioBase;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @return the consumoEnergetico
     */
    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }
    
    //METODOS PUBLICOS 
    /**
     * Metodo que comprueba si la letra esta dentro de las categorias correspondientes al consumo energetico 
     * @param consumoEnergetico 
     * @return booleano
     */
    public boolean comprobarConsumoEnergetico(char consumoEnergetico) {
        boolean estaLetra = false;
        char letras[]= {'A','B','C','D','E','F'};
        for (int i = 0; i < letras.length; i++) {
            if (consumoEnergetico==letras[i]) {
                this.consumoEnergetico = consumoEnergetico;
                estaLetra = true;
            }else {
                this.consumoEnergetico = CONSUMO_ENERGETICO;
            } 
        }
        return estaLetra;
    }
    
    /**
     * Metodo que comprueba si el color del electrodomestico se encuentra en  la lista de colores,
     * si no se da el color por defecto blanco.
     * @param color
     */
    public void comprobarColor(String color) {
        String colores[] = {"blanco","negro","azul","rojo","gris"};
        
        for (int i = 0; i < colores.length; i++) {
            if (colores[i].equalsIgnoreCase(color)) {
                this.color = color;
            }else {
                this.color = COLOR;
            }
        }
    }
    
    /**
     * Metodo que calcula el precio final segun las caracteristicas del consumo energetico y 
     * el peso del electrodomestico
     * @return precioFinal
     */
    public double precioFinal() {
        
        double aumento=0;
        while(comprobarConsumoEnergetico(consumoEnergetico)!= false) {
          //Para aumentar el precio segun el consumo energetico
            if (consumoEnergetico=='A') {
                aumento+= 100;
            }else {
                if(consumoEnergetico=='B') {
                    aumento+= 80;
                }else {
                    if (consumoEnergetico=='C') {
                        aumento+= 60;
                    }else {
                        if (consumoEnergetico=='D') {
                            aumento+= 50;
                        }else {
                            if (consumoEnergetico=='E') {
                                aumento+= 30;
                            }else {
                                aumento+= 10;
                            }
                        }
                    }
                }
            }
        }
        
        
        if (peso>80) {//para aumentar el precio segun el tamano
            aumento+=100;
        }else {
            if (peso<80 && peso>=50) {
                aumento+=80;
            }else {
                if (peso<50 && peso>=20) {
                    aumento+=50;
                }else {
                    aumento+=10;
                }
            }
        }
        return precioBase+aumento;
    }
    
}
