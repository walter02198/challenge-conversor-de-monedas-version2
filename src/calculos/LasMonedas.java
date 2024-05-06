package calculos;

import conversiones.Conversiones;

public class LasMonedas  {
    public int opcionConver;
    public double valor;
    private double conversion;
    String moneda1;
    String moneda2;

    public LasMonedas() {

    }
    public String convertir() {
        if (opcionConver == 1) {
            return "USD/ARS";
        } else if (opcionConver == 2) {
            return "ARS/USD";
        } else if (opcionConver == 3) {
            return "USD/BRL";
        } else if (opcionConver == 4) {
            return "BRL/USD";
        } else if (opcionConver == 5) {
            return "USD/COP";
        } else if (opcionConver == 6) {
            return "COP/USD";
        }
        return null;
    }
    public  LasMonedas(Conversiones estaConversion){
        this.conversion=estaConversion.conversion_rate();
        this.moneda1 = estaConversion.base_code();
        this.moneda2=estaConversion.target_code();
    }
    public String getMoneda1() {
        if(moneda1.equals("USD")){
            return "Dolar";
        }else if(moneda1.equals("ARS")) {
            return "Pesos Argentinos";
        } else if(moneda1.equals("COP")) {
            return "Pesos Colombianos";
        } else if(moneda1.equals("BRL")) {
            return "Reales";
        }
        return null;
    }
    public String getMoneda2() {
        if(moneda2.equals("USD")){
            return "Dolar";
        }else if(moneda2.equals("ARS")) {
            return "Pesos Argentinos";
        } else if(moneda2.equals("COP")) {
            return "Pesos Colombianos";
        } else if(moneda2.equals("BRL")) {
            return "Reales";
        }
        return null;
    }
    public double getConversion() {
        return conversion;
    }
    @Override
    public String toString() {
        return "El Resultado de transformar: "+valor+" "+getMoneda1()+" en "+getMoneda2()
                +" es igual a "+getConversion()*valor+" "+getMoneda2();
    }
}




