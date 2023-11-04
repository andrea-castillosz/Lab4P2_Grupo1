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

public class EquipoBasquet extends Equipo{
    
    private int puntofavor, puntocontra;
    private ArrayList<Jugadores> jugadores = new ArrayList<>();

    public EquipoBasquet(){
        super();
    }

    public EquipoBasquet (int puntofavor, int puntocontra, String nombre, String deporte, int puntos, int partidojugado, int ganado, int perdido) {
        super(nombre, deporte, puntos, partidojugado, ganado, perdido);
        this.puntofavor = puntofavor;
        this.puntocontra = puntocontra;
    }

    public int getPuntofavor() {
        return puntofavor;
    }

    public void setPuntofavor(int puntofavor) {
        this.puntofavor = puntofavor;
    }

    public int getPuntocontra() {
        return puntocontra;
    }

    public void setPuntocontra(int puntocontra) {
        this.puntocontra = puntocontra;
    }

    public ArrayList<Jugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugadores> jugadores) {
        try {
            if (jugadores.size()>=8&&jugadores.size()<=15) {
                this.jugadores = jugadores;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Cantidad de jugadores no cumplen con el requisito deseado para jugar");
        }
    }

    @Override
    public String toString() {
        return "puntofavor=" + puntofavor + ", puntocontra=" + puntocontra + ", jugadores=" + jugadores + '}';
    }
    
}
