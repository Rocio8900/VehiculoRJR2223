
package vehiculo;

/**
 *
 * @author IES Aguadulce
 */
public class Main {
    
      public static void main(String[] args) {
        VehiculoJimenezRuizRocio2223 miVehiculoJimenezRuizRocio2223;
        int stockActual;
        
        miVehiculoJimenezRuizRocio2223 = new VehiculoJimenezRuizRocio2223("Seat",18000,100);
        operativaVehiculosJimenezRuizRocio2223(miVehiculoJimenezRuizRocio2223, 50); 
        stockActual = miVehiculoJimenezRuizRocio2223.obtenerStock();
        System.out.println("El stock actual es"+ stockActual );
    }

    public static void operativaVehiculosJimenezRuizRocio2223(VehiculoJimenezRuizRocio2223 miVehiculoJimenezRuizRocio2223, int cantidad) {
        try
        {
            System.out.println("Venta de Vehiculos");
            miVehiculoJimenezRuizRocio2223.vender(20);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender");
        }
        
        try
        {
            System.out.println("Compra de Vehiculos");
            miVehiculoJimenezRuizRocio2223.comprar(100);
        } catch (Exception e)
        {
            System.out.print("Fallo al comprar");
        }
    }

}
    
