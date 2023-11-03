/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_grupo1;

import java.util.ArrayList;

/**
 *
 * @author casti
 */
public abstract class TablasPosicion {
    
    ArrayList<Equipo> ListaEquipos = new ArrayList();

    public TablasPosicion() {
        
    }

    public ArrayList<Equipo> getListaEquipos() {
        return ListaEquipos;
    }

    public void setListaEquipos(ArrayList<Equipo> ListaEquipos) {
        this.ListaEquipos = ListaEquipos;
    }

    @Override
    public String toString() {
        return "\nTablasPosicion" + "\nListaEquipos: " + ListaEquipos + "\n";
    }
    
    public abstract ArrayList<Equipo> Ordenamiento();
    
}
