/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samll
 */
public class FarmDermocosmeticos extends Farmaco implements AdministarExistencias{
    public String aplicacion;
    public int nExistencias;

    public FarmDermocosmeticos(String aplicacion, int numDosis, String nombre, double precio, String proveedor) {
        super(numDosis, nombre, precio, proveedor);
        this.aplicacion = aplicacion;
    }

    @Override
    String datosPorCategorias() {
        String dt="Forma de aplicacion: " + this.aplicacion + "\n";
        return dt;
    }

    @Override
    public void agregarExistencias(int n) {
        this.nExistencias+=n;
    }

    @Override
    public int validarExistencias(int n) {
        if(this.nExistencias<n){
            int msj=1;
            return msj;
        }else{
            int msj=2;
            return msj;
        }
    }

    @Override
    public void venExistencias(int n) {
        this.nExistencias-=n;
    }
    
    
    
    
    
}
