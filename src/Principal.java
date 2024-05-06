import calculos.*;
import conversiones.ConsultaConversion;
import conversiones.Conversiones;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int opcion = 0;

        String menu = """
                **********************************************************
                Sea bienvenido/a al conversor de Moneda =]
                                
                1) Dolar =>> Peso Argentino
                2) Peso Argentino =>> Dolar
                3) Dolar =>> Real Brasileño
                4) Real Brasileño =>> Dolar
                5) Dolar =>> Peso Colombiano
                6) Peso Colombiano =>> Dolar
                7) Salir
                Elija una opcion valida:
                **********************************************************
                """;
        ConsultaConversion moneda = new ConsultaConversion();
        LasMonedas conver = new LasMonedas();
        while (opcion != 7) {
            System.out.println(menu);
            Scanner teclado = new Scanner(System.in);
            opcion = teclado.nextInt();

            if(opcion<7 && opcion!=0) {
                System.out.println("Ingrese el valor que desea convertir");
                 var valorAConvertir = teclado.nextDouble();
                 teclado.nextLine();
                conver.opcionConver=opcion;
                Conversiones miConversion  = moneda.laConversion(conver);
                LasMonedas miMoneda=new LasMonedas(miConversion);
                miMoneda.valor=valorAConvertir;
                System.out.println(miMoneda);
            }else if(opcion!=7){
                System.out.println("Opcion no valida");
            }
        }
        System.out.println("Gracias por utilizar nuestros servicios");
    }
}

