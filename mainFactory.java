public class Main {
    public static void main(String[] args) {

        EventoFactory factoryMusica = new MusicaElectronicaFactory();
        Evento evento1 = factoryMusica.crearEvento("taller");
        Evento evento2 = factoryMusica.crearEvento("concierto");

        evento1.mostrarDetalle();
        evento2.mostrarDetalle();

        System.out.println("----------------");

        EventoFactory factoryChocolate = new ChocolateFactory();
        Evento evento3 = factoryChocolate.crearEvento("taller");
        Evento evento4 = factoryChocolate.crearEvento("concierto");

        evento3.mostrarDetalle();
        evento4.mostrarDetalle();
    }
}
