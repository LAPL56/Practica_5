package Transporte.Aereo;
import Transporte.Transporte;

public class Aereo extends Transporte {
    private String conduccion;
    public Aereo(String conduccion,String medio){
        super(medio);
        this.conduccion = conduccion;
    }
}
