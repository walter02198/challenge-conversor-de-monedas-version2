import calculos.Monedas;
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

        Scanner teclado = new Scanner(System.in);
        while (opcion != 7) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el valor que desea convertir");
                    double valorAConvertir=teclado.nextDouble();
                    Conversiones miConversion = moneda.laConversion("USD","ARS");
                    Monedas miMoneda = new Monedas(miConversion);
                    double total=valorAConvertir* miMoneda.getConversion();
                    System.out.println("El valor de: " + valorAConvertir
                            + " [USD]" + "corresponde al valor final de=>>> "+
                            total + " [ARS]");
                    break;
                case 2:
                    System.out.println("Ingrese el valor que desea convertir");
                    double valorAConvertir2=teclado.nextDouble();
                    Conversiones miConversion2 = moneda.laConversion("ARS","USD");
                    Monedas miMoneda2 = new Monedas(miConversion2);
                    double total2=valorAConvertir2* miMoneda2.getConversion();
                    System.out.println("El valor de: " + valorAConvertir2
                            + " [ARS]" + "corresponde al valor final de=>>> "+
                            total2 + " [USD]");
                    break;
                case 3:
                    System.out.println("Ingrese el valor que desea convertir");
                    double valorAConvertir3=teclado.nextDouble();
                    Conversiones miConversion3 = moneda.laConversion("USD","BRL");
                    Monedas miMoneda3 = new Monedas(miConversion3);
                    double total3=valorAConvertir3* miMoneda3.getConversion();
                    System.out.println("El valor de: " + valorAConvertir3
                            + " [USD]" + "corresponde al valor final de=>>> "+
                            total3 + " [Reales]");

                    break;
                case 4:
                    System.out.println("Ingrese el valor que desea convertir");
                    double valorAConvertir4=teclado.nextDouble();
                    Conversiones miConversion4 = moneda.laConversion("BRL","USD");
                    Monedas miMoneda4 = new Monedas(miConversion4);
                    double total4=valorAConvertir4* miMoneda4.getConversion();
                    System.out.println("El valor de: " + valorAConvertir4
                            + " [Reales]" + "corresponde al valor final de=>>> "+
                            total4 + " [USD]");

                    break;
                case 5:
                    System.out.println("Ingrese el valor que desea convertir");
                    double valorAConvertir5=teclado.nextDouble();
                    Conversiones miConversion5 = moneda.laConversion("USD","COP");
                    Monedas miMoneda5 = new Monedas(miConversion5);
                    double total5=valorAConvertir5* miMoneda5.getConversion();
                    System.out.println("El valor de: " + valorAConvertir5
                            + " [USD]" + "corresponde al valor final de=>>> "+
                            total5 + " [COP]");

                    break;
                case 6:
                    System.out.println("Ingrese el valor que desea convertir");
                    double valorAConvertir6=teclado.nextDouble();
                    Conversiones miConversion6 = moneda.laConversion("COP","USD");
                    Monedas miMoneda6 = new Monedas(miConversion6);
                    double total6=valorAConvertir6* miMoneda6.getConversion();
                    System.out.println("El valor de: " + valorAConvertir6
                            + " [COP]" + "corresponde al valor final de=>>> "+
                            total6 + " [USD]");

                    break;
                case 7:
                    System.out.println("Gracias por utilizar nuestros servicios");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        }
    }
}