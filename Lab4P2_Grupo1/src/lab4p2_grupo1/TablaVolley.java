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
public class TablaVolley extends TablasPosicion {

    public TablaVolley() {

    }

    public ArrayList<Equipo> Ordenamiento() {

        Equipo aux = new Equipo();

        for (int i = 0; i < ListaEquipos.size(); i++) {
            for (int j = 0; j < ListaEquipos.size() - i - 1; j++) {

                if (ListaEquipos.get(j) instanceof EquipoVolley && ListaEquipos.get(j + 1) instanceof EquipoVolley) {
                    if (ListaEquipos.get(j).getPartidosJugados() == ListaEquipos.get(j + 1).getPartidosJugados()) {
                        if (ListaEquipos.get(j).getPartidosGanados() == ListaEquipos.get(j + 1).getPartidosGanados()) {
                            if (((EquipoVolley) ListaEquipos.get(j)).getSetganado() == ((EquipoVolley) ListaEquipos.get(j + 1)).getSetganado()) {
                                if (((EquipoVolley) ListaEquipos.get(j)).getPuntorecibido() < ((EquipoVolley) ListaEquipos.get(j + 1)).getPuntorecibido()) {
                                    aux = ListaEquipos.get(j + 1);
                                    ListaEquipos.set(j + 1, ListaEquipos.get(j));
                                    ListaEquipos.set(j, aux);

                                }
                            } else {
                                if (((EquipoVolley) ListaEquipos.get(j)).getSetganado()< ((EquipoVolley) ListaEquipos.get(j + 1)).getSetganado()) {
                                    aux = ListaEquipos.get(j + 1);
                                    ListaEquipos.set(j + 1, ListaEquipos.get(j));
                                    ListaEquipos.set(j, aux);

                                }
                            }
                        } else {
                            if (((EquipoVolley) ListaEquipos.get(j)).getPartidosGanados() < ((EquipoVolley) ListaEquipos.get(j + 1)).getPartidosGanados()) {
                                aux = ListaEquipos.get(j + 1);
                                ListaEquipos.set(j + 1, ListaEquipos.get(j));
                                ListaEquipos.set(j, aux);

                            }
                        }
                    }
                }

            }
        }
        
        return ListaEquipos;
        
    }

}
