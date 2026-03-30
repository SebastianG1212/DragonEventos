public class MusicaElectronicaFactory extends EventoFactory {

    @Override
    public Evento crearEvento(String tipo) {
        if (tipo.equalsIgnoreCase("taller")) {
            return new TallerMusicaElectronica();
        } else if (tipo.equalsIgnoreCase("concierto")) {
            return new ConciertoMusicaElectronica();
        }
        return null;
    }
}
