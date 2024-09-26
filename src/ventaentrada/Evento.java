
package ventaentrada;


public class Evento {
    private String nombre;
    private String ubicacion;

    public Evento(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}