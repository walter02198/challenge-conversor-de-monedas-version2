package calculos;

import conversiones.Conversiones;

public class LasMonedas extends Monedas  {
    String dolar = "USD";
    String pesosArgentinos = "ARS";
    String pesosColombianos = "COP";
    String reales = "BRL";
    public int opcionConver;
    public double value;
    public String convertir() {
        if (opcionConver == 1) {
           moneda1="dolar";
            moneda2="Pesos Argentinos";
            return dolar + "/" + pesosArgentinos;
        } else if (opcionConver == 2) {
            moneda1="Pesos Argentinos";
            moneda2="Dolar";
            return pesosArgentinos + "/" + dolar;
        } else if (opcionConver == 3) {
            moneda1="Dolar";
            moneda2="Reales";
            return dolar + "/" + reales;
        } else if (opcionConver == 4) {
            moneda1="Reales";
            moneda2="Dolar";
            return reales + "/" + dolar;
        } else if (opcionConver == 5) {
            moneda1="Dolar";
            moneda2="Pesos Colombianos";
            return dolar + "/" + pesosColombianos;
        } else if (opcionConver == 6) {
            moneda1="Pesos Colombianos";
            moneda2="Dolar";
            return pesosColombianos + "/" + dolar;
        }
        return null;
    }
    public double getValue() {
        return value;
    }
    @Override
        public String toString() {
        return "El resultado de transformar "+ getValue()+" "
                +getMoneda1()+ " a "+getMoneda2()+" es: " + getValue()*getConversion()+" "+getMoneda2();
    }
}


