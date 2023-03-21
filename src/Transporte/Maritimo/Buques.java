package Transporte.Maritimo;
public class Buques extends Maritimo {
    private String tipoCarga;
    private String alcance;
    private String impulso;
    private String autonomia;
    private String velocidad;

    public Buques(String tipoCarga, String alcance,String impulso, String autonomia, String velocidad, String longitudCasco, String medio) {
        super(longitudCasco,medio);
        this.tipoCarga = tipoCarga;
        this.alcance = alcance;
        this.impulso = impulso;
        this.autonomia = autonomia;
        this.velocidad = velocidad;
    }

    public void SetCarga(String tipoCarga){
        this.tipoCarga = tipoCarga;
    }
    public void SetAlcance(String alcance){this.alcance = alcance;}
    public void SetImpulso(String impulso){
        this.impulso = impulso;
    }
    public void SetAuto(String autonomia){this.autonomia = autonomia;}
    public void SetVelocidad(String velocidad){this.velocidad = velocidad;}
    public String getTipoCarga() {
        return tipoCarga;
    }

    public String getAlcance() {
        return alcance;
    }
    public String getImpulso() {
        return impulso;
    }

    public String getAuto() {
        return autonomia;
    }

    public String getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return "\n    Tipo de carga: " + tipoCarga +
                "\n    Alcance: "+alcance+
                "\n    Impulso: "+impulso+
                "\n    Autonomía: "+autonomia+
                "\n    Velocidad: "+velocidad;
    }
}
