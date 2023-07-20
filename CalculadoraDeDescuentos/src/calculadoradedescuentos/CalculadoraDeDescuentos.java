package calculadoradedescuentos;

import calculadoradedescuentos.entities.Calculadora;
import calculadoradedescuentos.services.CalculadoraService;


public class CalculadoraDeDescuentos {

    public static void main(String[] args) {
       
        CalculadoraService cs = new CalculadoraService();
        Calculadora c = new Calculadora();
        cs.crearCalculadora(c);        
        cs.descuentoMaximo(c);
        
    }

}
