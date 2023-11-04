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
public class TablaBasquet extends TablasPosicion {

    public TablaBasquet() {

    }

    public ArrayList<Equipo> Ordenamiento() {

        Equipo aux = new Equipo();

        for (int i = 0; i < ListaEquipos.size(); i++) {
            for (int j = 0; j < ListaEquipos.size() - i - 1; j++) {

                if (ListaEquipos.get(j) instanceof EquipoBasquet && ListaEquipos.get(j + 1) instanceof EquipoBasquet) {
                    if (ListaEquipos.get(j).getPartidosJugados() == ListaEquipos.get(j + 1).getPartidosJugados()) {
                        if (ListaEquipos.get(j).getPartidosGanados() == ListaEquipos.get(j + 1).getPartidosGanados()) {
                            if (((EquipoBasquet) ListaEquipos.get(j)).getPuntofavor() < ((EquipoBasquet) ListaEquipos.get(j + 1)).getPuntofavor()) {
                                aux = ListaEquipos.get(j + 1);
                                ListaEquipos.set(j + 1, ListaEquipos.get(j));
                                ListaEquipos.set(j, aux);
                            }
                        } else {
                            if (((EquipoBasquet) ListaEquipos.get(j)).getPartidosGanados() < ((EquipoBasquet) ListaEquipos.get(j + 1)).getPartidosGanados()) {
                                aux = ListaEquipos.get(j + 1);
                                ListaEquipos.set(j + 1, ListaEquipos.get(j));
                                ListaEquipos.set(j, aux);
                            }
                        }
                    } else { //si los jugados son iguales

                        if (ListaEquipos.get(j).getPartidosJugados() == ListaEquipos.get(j + 1).getPartidosJugados()) {
                            if (ListaEquipos.get(j).getPartidosGanados() == ListaEquipos.get(j + 1).getPartidosGanados()) {
                                if (ListaEquipos.get(j).getPartidosGanados() % ListaEquipos.get(j).getPartidosJugados() < ListaEquipos.get(j + 1).getPartidosGanados() % ListaEquipos.get(j + 1).getPartidosJugados()) {
                                    aux = ListaEquipos.get(j + 1);
                                    ListaEquipos.set(j + 1, ListaEquipos.get(j));
                                    ListaEquipos.set(j, aux);
                                }
                            }

                        }
                    }

                }
            }

        }
        return ListaEquipos;

    }
}
