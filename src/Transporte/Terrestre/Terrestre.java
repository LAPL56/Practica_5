package Transporte.Terrestre;
import Transporte.Transporte;

public class Terrestre extends Transporte {
    private String regulado;

    public Terrestre(String clasificacion, String regulado) {
        super(clasificacion);
        this.regulado = regulado;
    }
}