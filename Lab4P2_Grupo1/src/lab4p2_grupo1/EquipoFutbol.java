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

public class EquipoFutbol extends Equipo{
    
    private int partidoganado, partidoperdido, partidoempatado;
    private int golafavor, golencontra;
    private ArrayList<Jugadores> jugadores=new ArrayList<>();

    public EquipoFutbol() {
        super();
    }

    public EquipoFutbol(int partidoganado, int partidoperdido, int partidoempatado, int golafavor, int golencontra, String nombre, String deporte, int puntos, int partidojugado, int ganado, int perdido) {
        super(nombre, deporte, puntos, partidojugado, ganado, perdido);
        this.partidoganado = partidoganado;
        this.partidoperdido = partidoperdido;
        this.partidoempatado = partidoempatado;
        this.golafavor = golafavor;
        this.golencontra = golencontra;
    }

    public int getPartidoganado() {
        return partidoganado;
    }

    public void setPartidoganado(int partidoganado) {
        this.partidoganado = partidoganado;
    }

    public int getPartidoperdido() {
        return partidoperdido;
    }

    public void setPartidoperdido(int partidoperdido) {
        this.partidoperdido = partidoperdido;
    }

    public int getPartidoempatado() {
        return partidoempatado;
    }

    public void setPartidoempatado(int partidoempatado) {
        this.partidoempatado = partidoempatado;
    }

    public int getGolafavor() {
        return golafavor;
    }

    public void setGolafavor(int golafavor) {
        this.golafavor = golafavor;
    }

    public int getGolencontra() {
        return golencontra;
    }

    public void setGolencontra(int golencontra) {
        this.golencontra = golencontra;
    }

    public ArrayList<Jugadores> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugadores> jugadores) {
        try {
            if (jugadores.size()<=22&&jugadores.size()>=15) {
                this.jugadores = jugadores;
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Cantidad de jugadores no cumplen con el requisito deseado para jugar");
        }
    }

    @Override
    public String toString() {
        return super.toString() + "partidoganado=" + partidoganado + ", partidoperdido=" + partidoperdido + ", partidoempatado=" + partidoempatado + ", golafavor=" + golafavor + ", golencontra=" + golencontra + ", jugadores=" + jugadores + '}';
    }
    
}
