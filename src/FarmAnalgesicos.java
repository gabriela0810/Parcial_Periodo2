/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samll
 */
public class FarmAnalgesicos extends Farmaco implements AdministarExistencias{
    public String tipoAplicacion;
    public int nExistencias;
    
    public FarmAnalgesicos(String tipoAplicacion, int numDosis, String nombre, double precio, String proveedor) {
        super(numDosis, nombre, precio, proveedor);
        this.tipoAplicacion = tipoAplicacion;
    }

    @Override
    String datosPorCategorias() {
        String dt="Tipo de Aplicacion: " + this.tipoAplicacion + "\n";
        return dt;
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
    public void agregarExistencias(int n) {
        this.nExistencias+=n;
    }
    
    @Override
    public void venExistencias(int n) {
        this.nExistencias-=n;
    }
    
}
