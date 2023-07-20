package calculadoradedescuentos.entities;

public class Calculadora {

    //atributos
    private int precio;
    private int descuento;
    private int descuentoMaximo;

    public Calculadora() {
    }

    public Calculadora(int precio, int descuento, int descuentoMaximo) {
        this.precio = precio;
        this.descuento = descuento;
        this.descuento = descuentoMaximo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getDescuentoMaximo() {
        return descuentoMaximo;
    }

    public void setDescuentoMaximo(int descuentoMaximo) {
        this.descuentoMaximo = descuentoMaximo;
    }

    @Override
    public String toString() {
        return "Calculadora{" + "precio=" + precio + ", descuento=" + descuento + ", descuentoMaximo=" + descuentoMaximo + '}';
    }
    
    
    

}
