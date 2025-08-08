public class Main {
    public static void main(String[] args) {
        Vehiculo miAuto = new Auto("Toyota", "Corolla");
        Vehiculo miMoto = new Motocicleta("Yamaha", "FZ25");

        miAuto.encender();
        miMoto.encender();
    }
}
