
package ventaentrada;

public class Cliente {
    private String nombre;
    private int edad;
    //private double descuento;
    
    public Cliente(String nombre,int edad){
        this.nombre = nombre;
        this.edad = edad;
        //this.descuento = descuento;
}
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    //public double getDescuento(){
        //return descuento;
    
    //}
}
