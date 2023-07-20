
import calculadoradedescuentos.entities.Calculadora;
import calculadoradedescuentos.services.CalculadoraService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTests {

    public CalculadoraTests() {
    }
    
    CalculadoraService cs = new CalculadoraService();
    Calculadora calc1;
    Calculadora calc2;
    Calculadora c;


    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {        
        //objeto seteado con descuento menor a descuento maximo
        calc1 =  new Calculadora(100, 20, 50);
        //objeto seteado con descuento mayor a descuento maximo
        calc2 = new Calculadora(100, 50, 20);
        c = new Calculadora();
        
    }

    @After
    public void tearDown() {
    }

    @Test

    public void testCrearCalculadora() {   
        assertNotNull(calc1);
    }

    
    @Test
    
    public void testDescuentoMaximo(){
        //probamos primero descuento < a descuentoMaximo
        c.setDescuento(20);
        c.setDescuentoMaximo(50);
        //preguntar como se hace para evaluar esto cuando no se esta pasando el objeto como parametro en el metodo porque esta siendo instanciado en la clase servicio y no en el main.
        int resultado = cs.descuentoMaximo(c);
        assertEquals(20, resultado);
        System.out.println("correcto");
        
        //probamos ahora descuento > a descuentoMaximo
        c.setDescuento(50);
        c.setDescuentoMaximo(20);
        assertEquals(20,resultado);
        System.out.println("correcto");
    }


}
