import java.util.ArrayList;
import java.util.List;

public class Evento {
    private String nombre;
    private String fecha;
    private String lugar;
    private String tipoEvento;
    private List<String> participantes = new ArrayList<>();

    // Getters y Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    public void setLugar(String lugar) { this.lugar = lugar; }
    public void setTipoEvento(String tipoEvento) { this.tipoEvento = tipoEvento; }
    public void setParticipantes(List<String> participantes) { this.participantes = participantes; }

    @Override
    public String toString() {
        return "Evento [" + tipoEvento + "] '" + nombre + "' | Fecha: " + fecha + 
               " | Lugar: " + lugar + " | Participantes: " + participantes;
    }
}
