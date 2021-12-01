package Clases;

/**
 * @author D
 * @version 1.0
 * @created 30-nov.-2021 13:52:52
 */
public class Empleado {
    private int id;
    private String nombre;
    private String apelldios;
    private double horasExtras;
    private double salarioBase;
    
    public Empleado(){

    } 
    

    public Empleado(int id, String nombre, String apelldios, double salarioBase, double horasExtras) {
        this.id = id;
        this.nombre = nombre;
        this.apelldios = apelldios;
        this.salarioBase = salarioBase;
        this.horasExtras = horasExtras;
    } 
    
    
    public void finalize() throws Throwable {

	}
	public double calcularSalarioBruto(){
                    
		return 0 ;
	}

	public double calcularSeguro(){
              return 0 ;
	}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApelldios() {
        return apelldios;
    }

    public void setApelldios(String apelldios) {
        this.apelldios = apelldios;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }


    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", apelldios=" + apelldios + ", horasExtras=" + horasExtras 
                + ", salarioBase=" + salarioBase +'}';
    }
    
  

}//end Empleado