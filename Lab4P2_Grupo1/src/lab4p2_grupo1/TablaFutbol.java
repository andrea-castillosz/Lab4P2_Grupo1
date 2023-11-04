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
public class TablaFutbol extends TablasPosicion {

    public TablaFutbol() {

    }

    public ArrayList<Equipo> Ordenamiento() {

        Equipo aux = new Equipo();

        for (int i = 0; i < ListaEquipos.size(); i++) {
            for (int j = 0; j < ListaEquipos.size() - i - 1; j++) {

                if (ListaEquipos.get(j) instanceof EquipoFutbol && ListaEquipos.get(j + 1) instanceof EquipoFutbol) {
                    if (ListaEquipos.get(j).getPuntos() == ListaEquipos.get(j + 1).getPuntos()) {
                        if (((EquipoFutbol) ListaEquipos.get(j)).getGolencontra() - ((EquipoFutbol) ListaEquipos.get(j)).getGolafavor() < ((EquipoFutbol) ListaEquipos.get(j + 1)).getGolencontra() - ((EquipoFutbol) ListaEquipos.get(j + 1)).getGolafavor()) {
                            aux = ListaEquipos.get(j + 1);
                            ListaEquipos.set(j + 1, ListaEquipos.get(j));
                            ListaEquipos.set(j, aux);
                        }
                    } else {
                        if (ListaEquipos.get(j).getPuntos() < ListaEquipos.get(j + 1).getPuntos()) {
                            aux = ListaEquipos.get(j + 1);
                            ListaEquipos.set(j + 1, ListaEquipos.get(j));
                            ListaEquipos.set(j, aux);
                        }
                    }

                }

            }
        }

        return ListaEquipos;

    }

}
