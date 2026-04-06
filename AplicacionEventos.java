import java.util.Arrays;

public class AplicacionEventos {
    public static void main(String[] args) {
        // Instanciamos al orquestador
        DirectorEventos director = new DirectorEventos();

        // 1. Construir una Conferencia
        ConferenciaBuilder builderConferencia = new ConferenciaBuilder();
        director.construirEventoEstandar(
                builderConferencia,
                "Tech Summit AI",
                "2026-05-15",
                "Auditorio Principal",
                Arrays.asList("Dr. Yann LeCun", "Dra. Fei-Fei Li")
        );
        Evento conferencia = builderConferencia.obtenerResultado();

        // 2. Construir un Evento Deportivo
        DeportivoBuilder builderDeportivo = new DeportivoBuilder();
        director.construirEventoEstandar(
                builderDeportivo,
                "Clásico Universitario",
                "2026-06-20",
                "Estadio Olímpico",
                Arrays.asList("Ingeniería CS", "Arquitectura")
        );
        Evento partidoFutbol = builderDeportivo.obtenerResultado();

        // Resultados
        System.out.println("--- Registro de Eventos (GoF Architecture) ---");
        System.out.println(conferencia.toString());
        System.out.println(partidoFutbol.toString());
    }
}
