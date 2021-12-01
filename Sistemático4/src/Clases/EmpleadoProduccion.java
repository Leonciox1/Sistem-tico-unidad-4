package Clases;

/**
 * @author D
 * @version 1.0
 * @created 30-nov.-2021 13:57:37
 */
public class EmpleadoProduccion extends Empleado {

    private double bono;

    public EmpleadoProduccion(){

    }

    public EmpleadoProduccion( int id, String nombre, String apelldios, double salarioBase,double horasExtras, double bono) {
        super(id, nombre, apelldios, horasExtras, salarioBase);
        this.bono = bono;
    }
            

public void finalize() throws Throwable {
    super.finalize();
}

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public String toString() {
        return "EmpleadoProduccion{Id: "+ this.getId()  + ",Nombre: " + this.getNombre() + ",Apelldios: " + this.getApelldios()
                                + ",Salario base: "+ this.getSalarioBase() + ", Horas extras: " + this.getHorasExtras()
                                + "bono=" + bono + '}';
    }
    
}//end EmpleadoProduccion