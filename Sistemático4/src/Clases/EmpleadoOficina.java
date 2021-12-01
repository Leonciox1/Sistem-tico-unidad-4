package Clases;

/**
 * @author D
 * @version 1.0
 * @created 30-nov.-2021 13:53:01
 */
public class EmpleadoOficina extends Empleado {

	public EmpleadoOficina(){

	}

    public EmpleadoOficina(int id, String nombre, String apelldios, double salarioBase, double horasExtras) {
        super(id, nombre, apelldios, salarioBase, horasExtras);
    }

  
    @Override
    public String toString() {
        return "EmpleadoOficina { Id: "+ this.getId()  + ",Nombre: " + this.getNombre() + ",Apelldios: " + this.getApelldios()
                         + ",Salario base: "+ this.getSalarioBase() + ", Horas extras: " + this.getHorasExtras() + '}';
    }
    
            
        
public void finalize() throws Throwable {
    super.finalize();
}

}//end EmpleadoOficina