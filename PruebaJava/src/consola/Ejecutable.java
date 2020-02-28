package consola;

import productos.Lavadora;
import productos.Televisor;
import tiendaElectronica.Electrodomesticos;
/**
 * 
 * @author Karla Gomez
 * 28 de Febrero, 2020
 */
public class Ejecutable {

    public static void main(String[] args) {
        /**
         * Se crea un Array de largo 10
         */
        Electrodomesticos [] lista = new Electrodomesticos[10];
        
        lista[0]= new Lavadora(200, 10, "rojo", 'B', 60);
        lista[1]= new Televisor(500, "gris", 'C', 30, 50, false);
        lista[2]= new Electrodomesticos(700, 35,'D',"gris");
        lista[3]= new Lavadora(350, 50);
        lista[4]= new Televisor(150, 45);
        lista[5]= new Televisor(600, "rojo", 'A', 100, 20, true);
        lista[6]= new Electrodomesticos(250, 55);
        lista[7]= new Televisor();
        lista[8]= new Lavadora();
        lista[9]= new Electrodomesticos();
        
        /**
         * Se recorre la lista a traves de un for y segun la posicion se utiliza el instanceof
         * para comparar si corresponde a Electrodomestico, Lavadora o Televisor
         */
        for (int i = 0; i < lista.length; i++) {
            if (lista[i]instanceof Electrodomesticos) {
                double resultado = lista[i].precioFinal();
                //Muestra por pantalla el precio final del Electrodomestico
                System.out.println("El electrodomestico "+ i +" tiene un precio de: "+resultado+" euros");
            }
            if (lista[i]instanceof Lavadora) {
                double resultado2 = lista[i].precioFinal();
                //Muestra el resultado final del Electrodomestico Lavadora
                System.out.println("La lavadora "+ i +" tiene un precio de: "+resultado2+" euros");
            }
            if (lista[i]instanceof Televisor) {
                double resultado3 = lista[i].precioFinal();
                //Muestra el resultado final del Electrodomestico Televisor
                System.out.println("La lavadora "+ i +" tiene un precio de: "+resultado3+" euros");
            }
        }
        /**
         * El programa no imprime por pantalla el precio final de los Electrodomesticos y se cree
         * que es debido a un error en el ciclo 'for'. 
         */
    }
}
