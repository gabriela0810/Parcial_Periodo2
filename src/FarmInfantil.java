/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author samll
 */
public class FarmInfantil extends Farmaco implements AdministarExistencias{
    public double docisPorEdad;
    public int nExistencias;

    public FarmInfantil(double docisPorEdad, int numDosis, String nombre, double precio, String proveedor) {
        super(numDosis, nombre, precio, proveedor);
        this.docisPorEdad = docisPorEdad;
    }

    @Override
    String datosPorCategorias() {
        String dt="Docis para por la edad del infante: " + this.docisPorEdad + "\n";
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
