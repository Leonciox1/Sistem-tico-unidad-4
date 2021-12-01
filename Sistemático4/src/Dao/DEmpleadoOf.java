/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Clases.EmpleadoOficina;
import Interface.IOperaciones;
import java.util.ArrayList;



/**
 *
 * @author D
 */
public class DEmpleadoOf implements IOperaciones{  
    ArrayList<EmpleadoOficina> lista = new ArrayList();
    @Override
    public void agregarRegistro(Object registro) {
        lista.add((EmpleadoOficina) registro);
    }
    @Override
    public Object mostrarRegistros(Object registro) {
        System.out.println(registro);
        System.out.println();
        return null;
       
    }

}
