public class Auto extends Vehiculo {

    public Auto(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void encender() {
        System.out.println("El auto " + getMarca() + " " + getModelo() + " está encendiendo con llave.");
    }
}
// Forzar reconocimiento de Java
