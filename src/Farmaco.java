/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samll
 */
public abstract class Farmaco {
    public int numDosis;
    public String nombre;
    public double precio;
    public String proveedor;

    public Farmaco() {
    }
    public Farmaco(int numDosis, String nombre, double precio, String proveedor) {
        this.numDosis = numDosis;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
    }
    
    public String datosFarmaco(){
        String dt="Nombre del Farmaco: " + this.nombre + "\n" +
                "Proveedor del Farmaco: " + this.proveedor + "\n" +
                "Numero de docis: " + this.numDosis + "\n" +
                "Precio del Farmaco: $" + this.precio + "\n";
        return dt;
    }
    
    abstract String datosPorCategorias();
    
}
