import java.util.List;

public class DirectorEventos {
    
    // Ejecuta los pasos de construcción en el orden correcto
    public void construirEventoEstandar(EventoBuilder builder, String nombre, String fecha, String lugar, List<String> participantes) {
        builder.reset();
        builder.construirNombre(nombre);
        builder.construirFecha(fecha);
        builder.construirLugar(lugar);
        builder.construirParticipantes(participantes);
    }
}
