package tiendaElectronica;

import static org.junit.Assert.*;

import org.junit.Test;

public class ElectoTest {

 
    @Test
    public void testPrecioFinal() {
        
        Electrodomesticos resultado = new Electrodomesticos();
        double actual = resultado.precioFinal('D', 35);
        double esperado = 212;

        assertEquals(esperado, actual);
    }

}
