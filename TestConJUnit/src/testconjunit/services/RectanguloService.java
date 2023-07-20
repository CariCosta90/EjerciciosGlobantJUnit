
package testconjunit.services;

import testconjunit.entities.Rectangulo;


public class RectanguloService {
    
    public double calcularArea(Rectangulo r){
        return r.getAncho()*r.getLargo();
    }
    
    public double calcularPerimetro(Rectangulo r){
        return (r.getAncho()+r.getLargo())*2;
    }
}
