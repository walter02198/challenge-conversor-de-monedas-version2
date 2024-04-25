package calculos;

import conversiones.ConsultaConversion;
import conversiones.Conversiones;

public class Monedas {
    String moneda1;
    String moneda2;

    double valorEnDolares;
    double conversion;

    public Monedas() {
        this.moneda1 = getMoneda1();
        this.moneda2 = getMoneda2();
        this.conversion = getConversion();
    }

    public Monedas(Conversiones miConversiones) {//en este constructor
        this.moneda1 = miConversiones.base_code();
        this.moneda2 = miConversiones.target_code();
        this.conversion = miConversiones.conversion_rate();
    }

    public String getMoneda1() {
        return moneda1;
    }

    public String getMoneda2() {
        return moneda2;
    }

    public double getConversion() {
        return conversion;
    }

}
