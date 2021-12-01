/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Clases.EmpleadoProduccion;
import Interface.IOperaciones;
import java.util.ArrayList;

/**
 *
 * @author
 */
public class DEmpleadoProduccion implements IOperaciones {
    ArrayList <EmpleadoProduccion> lista = new ArrayList();
    @Override
    public void agregarRegistro(Object registro) {
        lista.add((EmpleadoProduccion) registro);
    }

    @Override
    public Object mostrarRegistros(Object registro) {
        System.out.println(registro);
        System.out.println();
        return null;
    }
    
}
