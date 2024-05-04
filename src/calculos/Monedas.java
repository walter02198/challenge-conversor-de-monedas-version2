package calculos;

import conversiones.Conversiones;

public class Monedas  {
String moneda1;
String moneda2;

public double valor;
    double conversion;


    public Monedas(Conversiones miConversiones) {//en este constructor
        this.conversion = miConversiones.conversion_rate();
        this.moneda1 = miConversiones.base_code();
        this.moneda2=miConversiones.target_code();
    }

    public Monedas() {

    }


    public String getMoneda1() {
        return moneda1;
    }

    public String getMoneda2() {return moneda2;}

    public double getConversion() {
        return conversion;
    }

    public double getValor() {
        return valor;
    }


    @Override
    public String toString() {
        return "El resultado de transformar "+getValor()+" "
                +getMoneda1()+ " a "+getMoneda2()+" es: " + getValor()*getConversion()+" "+getMoneda2();
    }
}

