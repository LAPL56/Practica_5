package Transporte.Terrestre;
public class Electricos extends Terrestre {
    private String tipoCarga;
    private String NumEjes;
    private String alcance;
    private String autonomia;
    private String velocidad;

    public Electricos(String tipoCarga,String NumEjes, String alcance, String autonomia, String velocidad, String regulado, String medio) {
        super(regulado,medio);
        this.tipoCarga = tipoCarga;
        this.NumEjes = NumEjes;
        this.alcance = alcance;
        this.autonomia = autonomia;
        this.velocidad = velocidad;
    }

    public void SetCarga(String tipoCarga){
        this.tipoCarga = tipoCarga;
    }
    public void SetNumEjesing(){this.NumEjes = NumEjes;}
    public void SetAlcance(String alcance){this.alcance = alcance;}
    public void SetAuto(String autonomia){this.autonomia = autonomia;}
    public void SetVelocidad(String velocidad){this.velocidad = velocidad;}
    public String getTipoCarga() { return tipoCarga;
    }
    public String getNumEjes(){ return NumEjes;
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
        return "\n    Modelo: " + tipoCarga +
                "\n    Número de Ejes: "+NumEjes+
                "\n    Alcance: "+alcance+
                "\n    Autonomía: "+autonomia+
                "\n    Velocidad: "+velocidad;
    }
}
