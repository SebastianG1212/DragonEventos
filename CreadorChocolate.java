public class ChocolateFactory extends EventoFactory {

    @Override
    public Evento crearEvento(String tipo) {
        if (tipo.equalsIgnoreCase("taller")) {
            return new TallerChocolate();
        } else if (tipo.equalsIgnoreCase("concierto")) {
            return new ConciertoChocolate();
        }
        return null;
    }
}
