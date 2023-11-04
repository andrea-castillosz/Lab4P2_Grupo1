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

public class EquipoVolley extends Equipo{
    
    private int puntoanotado;
    private int puntorecibido;
    private int setganado, setperdido;
    private ArrayList<Jugadores> jugadores = new ArrayList<>();

    public EquipoVolley() {
        super();
    }

    public EquipoVolley (int puntoanotado, int puntorecibido, int setganado, int setperdido, String nombre, String deporte, int puntos, int partidojugado, int ganado, int perdido) {
        super(nombre, deporte, puntos, partidojugado, ganado, perdido);
        this.puntoanotado = puntoanotado;
        this.puntorecibido = puntorecibido;
        this.setganado = setganado;
        this.setperdido = setperdido;
    }

    public int getPuntoanotado() {
        return puntoanotado;
    }

    public void setPuntoanotado(int puntoanotado) {
        this.puntoanotado = puntoanotado;
    }

    public int getPuntorecibido() {
        return puntorecibido;
    }

    public void setPuntorecibido(int puntorecibido) {
        this.puntorecibido = puntorecibido;
    }

    public int getSetganado() {
        return setganado;
    }

    public void setSetganado(int setganado) {
        this.setganado = setganado;
    }

    public int getSetperdido() {
        return setperdido;
    }

    public void setSetperdido(int setperdido) {
        this.setperdido = setperdido;
    }

    public ArrayList<Jugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugadores> jugadores) {
        for (Jugadores jugadore : jugadores) {
            try {
                if (jugadores.size()>=10&&jugadores.size()<=18) {
                    this.jugadores = jugadores;
                }
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Cantidad de jugadores no cumplen con el requisito deseado para jugar");
            }
        }

    }

    @Override
    public String toString() {
        return "puntoanotado=" + puntoanotado + ", puntorecibido=" + puntorecibido + ", setganado=" + setganado + ", setperdido=" + setperdido + ", jugadores=" + jugadores + '}';
    }
    
}
