package Transporte.Maritimo;
import Transporte.Transporte;

public class Maritimo extends Transporte {
    private String longitudCasco;

    public Maritimo(String longitudCasco,String medio) {
        super(medio);
        this.longitudCasco = longitudCasco;
    }
}