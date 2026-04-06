import java.util.List;

public class DeportivoBuilder implements EventoBuilder {
    private Evento evento;

    public DeportivoBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.evento = new Evento();
        this.evento.setTipoEvento("Deportivo");
    }

    @Override
    public void construirNombre(String nombre) { this.evento.setNombre(nombre); }

    @Override
    public void construirFecha(String fecha) { this.evento.setFecha(fecha); }

    @Override
    public void construirLugar(String lugar) { this.evento.setLugar(lugar); }

    @Override
    public void construirParticipantes(List<String> equipos) {
        // Lógica específica para equipos deportivos (ej. validar que sean al menos 2)
        this.evento.setParticipantes(equipos);
    }

    @Override
    public Evento obtenerResultado() {
        Evento resultado = this.evento;
        this.reset(); 
        return resultado;
    }
}
