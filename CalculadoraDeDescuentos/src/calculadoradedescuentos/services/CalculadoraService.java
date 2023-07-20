package calculadoradedescuentos.services;

import calculadoradedescuentos.entities.Calculadora;
import java.util.Scanner;

public class CalculadoraService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Calculadora calc = new Calculadora();

    public Calculadora crearCalculadora(Calculadora c) {

        System.out.println("Ingresa el precio del producto");
        c.setPrecio(leer.nextInt());

        System.out.println("Ingresa el descuento");
        c.setDescuento(leer.nextInt());
        System.out.println(c.getDescuento());

        System.out.println("Ingresa el descuento maximo para ");
        c.setDescuentoMaximo(leer.nextInt());
        System.out.println(c.getDescuentoMaximo());

        return c;
    }

    public int descuentoMaximo(Calculadora c) {

        if (c.getDescuento() > c.getDescuentoMaximo()) {
            System.out.println("El descuento seleccionado excedia el descuento Maximo permitido");
            System.out.println("Se definio el descuento al maximo posible: " + c.getDescuentoMaximo());
            c.setDescuento(c.getDescuentoMaximo());
        } else {
            System.out.println("El descuento seleccionado es correcto");
            System.out.println("Se definio el descuento como: " + c.getDescuento());
        }
        return c.getDescuento();
    }



}
