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
        Conversiones miConversion = moneda.laConversion();
        System.out.println(miConversion);
        Monedas miMoneda = new Monedas(miConversion);
        System.out.println("La moneda a transformar es: " + miMoneda.getMoneda1()
                + " en: " + miMoneda.getMoneda2() + " y la conversion de 1 " + miMoneda.getMoneda1()
                + " es " + miMoneda.getConversion() + " " + miMoneda.getMoneda2());

        Scanner teclado = new Scanner(System.in);
        while (opcion != 7) {
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("");
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