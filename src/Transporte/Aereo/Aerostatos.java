package Transporte.Aereo;
public class Aerostatos extends Aereo {
    private String tipoCarga;
    private String tipoPropulsion;
    private String alcance;
    private String autonomia;
    private String velocidad;

    public Aerostatos(String tipoCarga,String tipoPropulsion, String alcance, String autonomia, String velocidad, String conduccion, String medio) {
        super(conduccion,medio);
        this.tipoCarga = tipoCarga;
        this.tipoPropulsion = tipoPropulsion;
        this.alcance = alcance;
        this.autonomia = autonomia;
        this.velocidad = velocidad;
    }

    public void SetCarga(String tipoCarga){
        this.tipoCarga = tipoCarga;
    }
    public void SetPropulsion(String impulso){
        this.tipoPropulsion = tipoPropulsion;
    }
    public void SetAlcance(String alcance){this.alcance = alcance;}
    public void SetAuto(String autonomia){this.autonomia = autonomia;}
    public void SetVelocidad(String velocidad){this.velocidad = velocidad;}
    public String getTipoCarga() {
        return tipoCarga;
    }
    public String getPropulsion() {
        return tipoPropulsion;
    }
    public String getAlcance() {
        return alcance;
    }
    public String getAuto() {
        return autonomia;
    }

    public String getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return  "\n    Uso: " + tipoCarga +
                "\n    Tipo de propulsión: "+tipoPropulsion+
                "\n    Alcance: "+alcance+
                "\n    Autonomía: "+autonomia+
                "\n    Velocidad: "+velocidad;
    }
}