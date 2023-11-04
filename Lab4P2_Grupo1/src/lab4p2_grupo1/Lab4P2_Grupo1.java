/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab4p2_grupo1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author casti
 */
public class Lab4P2_Grupo1 {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Equipo> equipos = new ArrayList<>();
    static ArrayList<Jugadores> jugadores = new ArrayList<>();

    public static void main(String[] args) throws ParseException {
        Scanner leer = new Scanner(System.in);

        int op = 0;
        do {
            System.out.println("--MENU--");
            System.out.println("1.Equipos");
            System.out.println("2.Jugadores");
            System.out.println("3.Registrar Partidos");
            System.out.println("4.Tablas de Posición");
            System.out.println("5.Salir");
            System.out.print("Ingrese su opcion: ");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    menuEquipos();
                    break;
                case 2:
                    menujugador();
                    break;
                case 3:

                    break;
                case 4:
                    
                    
                    
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Ingrese un numero valido");
                    break;
            }
        } while (op != 5);

        menujugador();

    }

    public static void menuEquipos() {
        Scanner sc = new Scanner(System.in);
        Scanner sc_s = new Scanner(System.in);//para los strings

        int equi = 0; //equipos ingresados

        int op = 0;
        do {
            System.out.println("---EQUIPOS---");
            System.out.println("1.Ingresar equipo.\n"
                    + "2.Listar Equipos\n"
                    + "3.Buscar Equipo\n"
                    + "4.Modificar Equipo\n"
                    + "5.Eliminar Equipo\n"
                    + "6.Salir");
            System.out.println("Ingrese su opcion: ");
            op = sc.nextInt();
            System.out.println("");

            switch (op) {
                case 1: {
                    AgregarEquipo(equipos);
                    equi++;
                    System.out.println("");
                }
                break;

                case 2: {
                    if (equi == 0) {
                        System.out.println("Error, no hay equipos ingresados para listar.");
                        System.out.println("");
                        break;
                    }
                    ListarEquipo(equipos);
                    System.out.println("");
                }
                break;

                case 3: {
                    if (equi == 0) {
                        System.out.println("Error, no hay equipos ingresados para buscar.");
                        System.out.println("");
                        break;
                    }
                    BuscarEquipo(equipos);
                    System.out.println("");
                }
                break;

                case 4: {
                    if (equi == 0) {
                        System.out.println("Error, no hay equipos ingresados para modificar.");
                        System.out.println("");
                        break;
                    }
                    ModificarEquipo(equipos);
                    System.out.println("");
                }
                break;

                case 5: {
                    if (equi == 0) {
                        System.out.println("Error, no hay equipos ingresados para eliminar.");
                        System.out.println("");
                        break;
                    }
                    EliminarEquipo(equipos);
                    System.out.println("");
                    equi--;
                }
                break;

                case 6: {
                    System.out.println("Regresando al menu principal...");
                    System.out.println("");
                }
                break;

            }
        } while (op != 6);

    }

    public static void menujugador() throws ParseException {

        int op = 0;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("---MENU DE JUGADORES---\n"
                    + "1. Agregar un jugador\n"
                    + "2. Eliminar un jugador\n"
                    + "3. Transferencia de Jugador\n"
                    + "4. Lista de todos los jugadores\n"
                    + "5. Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    Equipo eq = new Equipo();
                    System.out.println("Ingrese el nombre: ");
                    String name = leer.next();
                    System.out.println("Ingrese la edad del jugador: ");
                    int edad = leer.nextInt();
                    System.out.println("Ingrese el sueldo del jugador: ");
                    double sueldo = leer.nextDouble();

                    boolean repetir = false;
                    while (!repetir) {
                        try {
                            System.out.println("Duracion de contrato: ");
                            String contract = leer.next();
                            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                            Date fechaend = df.parse(contract);
                            jugadores.add(new Jugadores(name, edad, sueldo, eq, fechaend));
                            System.out.println("Jugador agregado exitosamente");
                            repetir = true;
                        } catch (ParseException e) {
                            System.out.println("Lo ingresado no es valido");
                            repetir = false;
                        }
                    }

                    break;
                case 2:
                    listarJugadores(jugadores);
                    System.out.println("Ingrese ingrese el indice del jugador a eliminar: ");
                    int e = leer.nextInt();
                    if (e >= 0 & e < jugadores.size()) {
                        boolean valido = false;
                        while (!valido) {
                            System.out.println("Estas seguro de eliminar:[s/n] ");
                            char resp = leer.next().charAt(0);
                            switch (resp) {
                                case 's':
                                    System.out.println("Jugador " + jugadores.get(e).getNombre() + " ha sido eliminado");
                                    jugadores.remove(e);
                                    valido = true;
                                    break;
                                case 'n':
                                    System.out.println("Jugador no eliminado");
                                    valido = true;
                                    break;

                                default:
                                    System.out.println("Opcion ingresada no valida");
                                    valido = false;
                                    break;
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Usted desea: \n"
                            + "1. Agregar un jugador a un equipo\n"
                            + "2. Transferir a otro equipo un jugador");
                    int opt = leer.nextInt();
                    switch (opt) {
                        case 1:
                            int a = 0;
                            agregarAEquipo(a);
                            break;
                        case 2:
                            ListarEquipo(equipos);
                            System.out.println("Ingrese el indice del jugador el cual desea transferir a otro equipo ");
                            int t = leer.nextInt();
                            transferir(t, jugadores);
                        default:
                            System.out.println("Numero ingresado es invalido");
                            break;
                    }
                    break;
                case 4:
                    listarJugadores(jugadores);
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Numero ingresado es invalido: ");
                    break;
            }
        } while (op != 5);

    }

    public static void ModificarEquipo(ArrayList<Equipo> ListaEquipo) {
        Scanner sc = new Scanner(System.in);
        Scanner sc_s = new Scanner(System.in);//para los strings

        System.out.print("Ingrese el nombre del equipo a modificar: ");
        String Mnombre = sc_s.nextLine();
        System.out.println("");

        for (int i = 0; i < ListaEquipo.size(); i++) {
            Equipo equipo = ListaEquipo.get(i);
            if (equipo.getNombre().equalsIgnoreCase(Mnombre)) {
                System.out.print("Ingrese el nuevo nombre del equipo: ");
                String nombre = sc_s.nextLine();

                int dep = 0;
                String deporte = "";
                while (dep != 4) {
                    System.out.println("Ingrese el nuevo numero de deporte que practica (1/2/3): ");
                    System.out.println("1.Futbol\n 2.Basquetbol\n 3.Voleibol\n");
                    dep = sc.nextInt();
                    switch (dep) {
                        case 1: {
                            deporte = "Futbol";
                            dep = 4;
                        }
                        break;

                        case 2: {
                            deporte = "Basquetbol";
                            dep = 4;
                        }
                        break;

                        case 3: {
                            deporte = "Voleibol";
                            dep = 4;
                        }
                        break;

                        default:
                            System.out.println("Error, opcion no valida.");
                            break;
                    }
                }
                ListaEquipo.get(i).setNombre(nombre);
                ListaEquipo.get(i).setDeporte(deporte);
                System.out.println("¡Equipo modificado exitosamente!");
                return;
            }
        }
        System.out.println("Error, equipo no encontrado.");
    }

    public static void EliminarEquipo(ArrayList<Equipo> ListaEquipo) {
        Scanner sc_s = new Scanner(System.in);
        System.out.println("Ingrese el nombre del equipo a eliminar: ");
        String nombre = sc_s.nextLine();
        for (int i = 0; i < ListaEquipo.size(); i++) {
            Equipo equipo = ListaEquipo.get(i);
            if (equipo.getNombre().equalsIgnoreCase(nombre)) {
                ListaEquipo.remove(i);
                System.out.println("Equipo eliminado.");
                System.out.println("");
                return;
            }
        }
        System.out.println("Error, equipo no encontrado.");
        System.out.println("");

    }

    public static void AgregarEquipo(ArrayList<Equipo> ListaEquipo) {
        Scanner sc = new Scanner(System.in);
        Scanner sc_s = new Scanner(System.in);//para los strings

        System.out.print("Ingrese el nombre del equipo: ");
        String nombre = sc_s.nextLine();

        int dep = 0;
        String deporte = "";

        while (dep != 4) {
            System.out.println("Ingrese el numero de deporte que practica (1/2/3): ");
            System.out.println("1.Futbol\n 2.Basquetbol\n 3.Voleibol\n");
            dep = sc.nextInt();
            switch (dep) {
                case 1: {
                    deporte = "Futbol";
                    ListaEquipo.add(new EquipoFutbol(0, 0, 0, 0, 0, nombre, deporte, 0, 0, 0, 0));
                    dep = 4;
                }
                break;

                case 2: {
                    deporte = "Basquetbol";
                    EquipoBasquet basquetbol = new EquipoBasquet(0, 0, nombre, deporte, 0, 0, 0, 0);
                    ListaEquipo.add(basquetbol);
                    dep = 4;
                }
                break;

                case 3: {
                    deporte = "Voleibol";
                    EquipoVolley voleibol = new EquipoVolley(0, 0, 0, 0, nombre, deporte, 0, 0, 0, 0);
                    ListaEquipo.add(voleibol);
                    dep = 4;
                }
                break;

                default:
                    System.out.println("Error, opcion no valida.");
                    break;
            }
        }
        //Equipo Equipo= new Equipo(nombre, deporte, 0, 0, 0, 0);
        //ListaEquipo.add(Equipo);
        System.out.println("¡Equipo agregado exitosamente!");
    }

    public static void ListarEquipo(ArrayList<Equipo> ListaEquipo) {
        int x = 0;
        System.out.println("--LISTA DE EQUIPOS--");
        for (Equipo equipo : ListaEquipo) {

            System.out.println(ListaEquipo.indexOf(equipo) + "-" + equipo + "\n");
        }
    }

    public static void BuscarEquipo(ArrayList<Equipo> ListaEquipo) {
        Scanner sc_s = new Scanner(System.in);
        System.out.print("Ingrese el nombre del equipo a buscar: ");
        String Bnombre = sc_s.nextLine();
        for (Equipo equipo : ListaEquipo) {
            if (equipo.getNombre().equalsIgnoreCase(Bnombre)) {
                System.out.println("Nombre del equipo: " + equipo.getNombre());
                System.out.println("Deporte del equipo: " + equipo.getDeporte());
                return;
            }
        }
        System.out.println("Equipo no encontrado. :(");
    }

    public static void listarJugadores(ArrayList<Jugadores> players) {
        if (players.isEmpty()) {
            System.out.println("No hay jugadores aun");
        } else {
            System.out.println("Lista de jugadores agregados: ");
            for (Jugadores player : players) {
                System.out.println(players.indexOf(player) + "-" + player.getNombre() + "\n");

            }
        }
    }

    public static void agregarAEquipo(int i) {
        Scanner leer = new Scanner(System.in);
        if (jugadores.isEmpty()) {
            System.out.println("No hay jugadores");
        } else {
            listarJugadores(jugadores);
            System.out.println("Ingrese el indice del jugador que quiere agregar al equipo: ");
            i = leer.nextInt();
            if (i >= 0 && i < jugadores.size()) {
                ListarEquipo(equipos);
                System.out.println("Ingrese el indice del equipo al que quiere agregarlo: ");
                int equipoIndex = leer.nextInt();
                if (equipoIndex >= 0 && equipoIndex < equipos.size()) {
                    Equipo E = equipos.get(equipoIndex);
                    if (E instanceof EquipoFutbol) {
                        ((EquipoFutbol) E).getJugadores().add(jugadores.get(i));
                        jugadores.get(i).setEquipo(E);
                        System.out.println("Jugador agregado exitosamente");
                    } else if (E instanceof EquipoBasquet) {
                        ((EquipoBasquet) E).getJugadores().add(jugadores.get(i));
                        jugadores.get(i).setEquipo(E);
                        System.out.println("Jugador agregado exitosamente");
                    } else if (E instanceof EquipoVolley) {
                        ((EquipoVolley) E).getJugadores().add(jugadores.get(i));
                        jugadores.get(i).setEquipo(E);
                        System.out.println("Jugador agregado exitosamente");
                    }
                }
            }
        }
    }

    public static void transferir(int i, ArrayList<Jugadores> players) throws ParseException {
        double salary = 0;
        Scanner leer = new Scanner(System.in);
        if (players.isEmpty()) {
            System.out.println("No hay jugadores");
        } else {
            if (players.get(i).getEquipo() instanceof EquipoFutbol) {
                players.get(i).setEquipo(new Equipo());
                System.out.println("Ingrese el indice del equipo al que quiere agregarlo: ");
                int a = leer.nextInt();
                if (a >= 0 && a < equipos.size()) {

                    System.out.println("Ingrese el salario a pagar para el jugador: ");
                    salary = leer.nextDouble();
                    ((EquipoFutbol) equipos.get(a)).getJugadores().add(players.get(i));
                    players.get(i).setEquipo(equipos.get(a));
                    players.get(i).setSueldo(salary);
                    String contrato = leer.next();
                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    Date fecha = df.parse(contrato);

                    System.out.println("Jugador trasferido exitosamente");

                    players.get(i).setSueldo(salary);
                    players.get(i).setDuracion_contrato(fecha);

                }

            } else if (players.get(i).getEquipo() instanceof EquipoBasquet) {
                players.get(i).setEquipo(new Equipo());
                System.out.println("Ingrese el indice del equipo al que quiere agregarlo: ");
                int a = leer.nextInt();
                if (a >= 0 && a < equipos.size()) {
                    ((EquipoBasquet) equipos.get(a)).getJugadores().add(players.get(i));
                    players.get(i).setEquipo(equipos.get(a));
                    System.out.println("Ingrese el salario a pagar para el jugador: ");
                    salary = leer.nextDouble();
                    String contrato = leer.next();
                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    Date fecha = df.parse(contrato);

                    System.out.println("Jugador trasferido exitosamente");

                    players.get(i).setSueldo(salary);
                    players.get(i).setDuracion_contrato(fecha);
                }

            } else if (players.get(i).getEquipo() instanceof EquipoVolley) {
                players.get(i).setEquipo(new Equipo());
                System.out.println("Ingrese el indice del equipo al que quiere agregarlo: ");
                int a = leer.nextInt();
                if (a >= 0 && a < equipos.size()) {
                    ((EquipoVolley) equipos.get(a)).getJugadores().add(players.get(i));
                    players.get(i).setEquipo(equipos.get(a));
                    System.out.println("Ingrese el salario a pagar para el jugador: ");
                    salary = leer.nextDouble();
                    System.out.println("Ingrese la fecha de duracion de contrato: ");
                    String contrato = leer.next();
                    DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                    Date fecha = df.parse(contrato);

                    System.out.println("Jugador trasferido exitosamente");

                    players.get(i).setSueldo(salary);
                    players.get(i).setDuracion_contrato(fecha);

                }
            }
        }

    }
    
    public static void imprimirTabla(ArrayList<Equipo> listaTabla){
        TablasPosicion tablafut = new TablaFutbol();
        TablasPosicion tablavolley = new TablaVolley();
        TablasPosicion tablabasquet = new TablaBasquet();
        
        tablafut.setListaEquipos(equipos);
        tablavolley.setListaEquipos(equipos);
        tablabasquet.setListaEquipos(equipos);
        
        
        System.out.println("--TABLA DE BASQUET--");
        for (int i = 0; i < tablabasquet.getListaEquipos().size(); i++) {
            System.out.println(tablabasquet.getListaEquipos().get(i));
        }
        
        System.out.println("--TABLA DE FUTBOL--");
        for (int i = 0; i < tablafut.getListaEquipos().size(); i++) {
            System.out.println(tablabasquet.getListaEquipos().get(i));
        }
        
        System.out.println("--TABLA DE FUTBOL--");
        for (int i = 0; i < tablavolley.getListaEquipos().size(); i++) {
            System.out.println(tablabasquet.getListaEquipos().get(i));
        }
        
    }
    
    public static void RegistrarPartido(ArrayList<Equipo> ListaEquipo) {
        Random alea = new Random();
        Scanner sc = new Scanner(System.in);
        Scanner sc_s = new Scanner(System.in);//para strings

        System.out.println("Ingrese el nombre del primer equipo: ");
        String equipo1 = sc_s.nextLine();
        System.out.println("Ingrese el nombre del segundo equipo: ");
        String equipo2 = sc_s.nextLine();

        boolean equipo1Encontrado = false;
        boolean equipo2Encontrado = false;
        String deporteEquipo1 = "";
        String deporteEquipo2 = "";

        for (Equipo e : ListaEquipo) {
            if (e.getNombre().equalsIgnoreCase(equipo1)) {
                equipo1Encontrado = true;
                deporteEquipo1 = e.getDeporte();
            } else if (e.getNombre().equalsIgnoreCase(equipo2)) {
                equipo2Encontrado = true;
                deporteEquipo2 = e.getDeporte();
            }
        }

        if (equipo1Encontrado && equipo2Encontrado) {
            if (deporteEquipo1 == deporteEquipo2) {
                if (deporteEquipo1 == "Futbol") {
                    for (Equipo object : ListaEquipo) {
                        object.setPuntos(alea.nextInt(8-1) + 1);
                    }
                } else if (deporteEquipo1 == "Basquetbol") {
                    for (Equipo object : ListaEquipo) {
                        object.setPuntos(alea.nextInt((8-1) + 1));
                    }

                } else if (deporteEquipo1 == "Voleibol") {
                    for (Equipo object : ListaEquipo) {
                        object.setPuntos(alea.nextInt((8-1) + 1));
                        int gol = object.getPuntos();
                    }

                }
            } else {
                System.out.println("Los deportes no coinciden, intente de nuevo.");
            }
        } else {
            System.out.println("Uno de los equipos no fue encontrado.");
        }
    }

}
