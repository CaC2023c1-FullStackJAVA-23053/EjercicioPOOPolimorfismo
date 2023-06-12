package codoacodo.ejemplos;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Historial {

    private ArrayList<Facturable> facturables;
    
    public Historial() {
        facturables = new ArrayList<>();
    }
    
    public void agregarFacturable(Facturable f) {
        facturables.add(f);
    }

    public double montoTotalFacturado() {
        double acu = 0;
        for (Facturable f : facturables) {
            acu += f.getMontoFacturacion();
        }
        return acu;
    }

    public int cantServiciosSimples() {
        // Método a resolver...
        return 0;
    }

}