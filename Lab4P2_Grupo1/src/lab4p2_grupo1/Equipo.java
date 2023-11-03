/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_grupo1;

/**
 *
 * @author casti
 */
public class Equipo {
    
    private String nombre;
    private String deporte;
    private int puntos;
    private int PartidosJugados;
    private int PartidosGanados;
    private int PartidosPerdidos;

    public Equipo() {
        
    }

    public Equipo(String nombre, String deporte, int puntos, int PartidosJugados, int PartidosGanados, int PartidosPerdidos) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.puntos = puntos;
        this.PartidosJugados = PartidosJugados;
        this.PartidosGanados = PartidosGanados;
        this.PartidosPerdidos = PartidosPerdidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPartidosJugados() {
        return PartidosJugados;
    }

    public void setPartidosJugados(int PartidosJugados) {
        this.PartidosJugados = PartidosJugados;
    }

    public int getPartidosGanados() {
        return PartidosGanados;
    }

    public void setPartidosGanados(int PartidosGanados) {
        this.PartidosGanados = PartidosGanados;
    }

    public int getPartidosPerdidos() {
        return PartidosPerdidos;
    }

    public void setPartidosPerdidos(int PartidosPerdidos) {
        this.PartidosPerdidos = PartidosPerdidos;
    }

    @Override
    public String toString() {
        return "\nEquipo " + "\nNombre: " + nombre + "\nDeporte: " + deporte + "\nPuntos: " + puntos + "\nPartidos Jugados: " + PartidosJugados + "\nPartidos Ganados: " + PartidosGanados + "\nPartidos Perdidos: " + PartidosPerdidos + "\n";
    }
    
     
    
    
}
