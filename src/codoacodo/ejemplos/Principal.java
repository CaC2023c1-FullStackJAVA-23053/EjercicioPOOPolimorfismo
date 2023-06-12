package codoacodo.ejemplos;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        Historial h = new Historial();
        h.agregarFacturable( new Insumo("Cartucho de tinta", 5, 1500, Tipo.PERIFERICO));
        h.agregarFacturable( new ServicioDeArmado() );
        h.agregarFacturable( new ServicioDeReparacion() );
        
        System.out.println(h.montoTotalFacturado());
    }

}