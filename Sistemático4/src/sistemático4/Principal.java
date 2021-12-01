/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemático4;

import Clases.EmpleadoOficina;
import Clases.EmpleadoProduccion;
import Dao.DEmpleadoOf;
import Dao.DEmpleadoProduccion;

/**
 *
 * @author D
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmpleadoOficina empleado1 = new EmpleadoOficina(001, "Jason", "Esquivel", 1500.80, 4);
        EmpleadoOficina empleado2 = new EmpleadoOficina(002, "Jan", "Prado", 500.80, 2);
        EmpleadoOficina empleado3 = new EmpleadoOficina(003, "Leoncio", "Jesucristol", 2900.80, 18);
        
        DEmpleadoOf Empleados_Oficina = new DEmpleadoOf();
        
        Empleados_Oficina.mostrarRegistros(empleado1);
        Empleados_Oficina.mostrarRegistros(empleado2);
        Empleados_Oficina.mostrarRegistros(empleado3);
        
        EmpleadoProduccion empleado01 = new EmpleadoProduccion(120, "Jose", "Duran", 10000.00, 12, 6000);
        EmpleadoProduccion empleado02 = new EmpleadoProduccion(321, "Cesar", "Marin", 5000.00, 22, 9000);
        EmpleadoProduccion empleado03 = new EmpleadoProduccion(129, "Jose", "Munguia", 100.00, 30, 300);
         
        DEmpleadoProduccion Empleados_Produccion = new DEmpleadoProduccion();
        
        Empleados_Produccion.mostrarRegistros(empleado01);
        Empleados_Produccion.mostrarRegistros(empleado02);
        Empleados_Produccion.mostrarRegistros(empleado03);
    }
    
}