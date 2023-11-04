/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4p2_grupo1;

import java.util.Date;

/**
 *
 * @author casti
 */
public class Jugadores {
    private String nombre;
    private int edad;
    private double sueldo;
    private Equipo equipo;
    private Date duracion_contrato;

    public Jugadores() {
    }
    
    public Jugadores(String nombre, int edad, double sueldo, Date duracion_contrato) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.duracion_contrato = duracion_contrato;
    }

    public Jugadores(String nombre, int edad, double sueldo, Equipo equipo, Date duracion_contrato) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.equipo = equipo;
        this.duracion_contrato = duracion_contrato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Date getDuracion_contrato() {
        return duracion_contrato;
    }

    public void setDuracion_contrato(Date duracion_contrato) {
        this.duracion_contrato = duracion_contrato;
    }
}
