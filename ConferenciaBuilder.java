import java.util.List;

public class ConferenciaBuilder implements EventoBuilder {
    private Evento evento;

    public ConferenciaBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.evento = new Evento();
        this.evento.setTipoEvento("Conferencia");
    }

    @Override
    public void construirNombre(String nombre) { this.evento.setNombre(nombre); }

    @Override
    public void construirFecha(String fecha) { this.evento.setFecha(fecha); }

    @Override
    public void construirLugar(String lugar) { this.evento.setLugar(lugar); }

    @Override
    public void construirParticipantes(List<String> oradores) {
        // Aquí podrías agregar lógica específica de conferencias, como validar credenciales
        this.evento.setParticipantes(oradores);
    }

    @Override
    public Evento obtenerResultado() {
        Evento resultado = this.evento;
        this.reset(); // Listo para construir otra conferencia
        return resultado;
    }
}
