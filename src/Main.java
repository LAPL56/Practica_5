import Transporte.Aereo.Aerostatos;
import Transporte.Aereo.NoPresurizados;
import Transporte.Aereo.NoTripulados;
import Transporte.Aereo.Presurizados;
import Transporte.Maritimo.Barcos;
import Transporte.Maritimo.Buques;
import Transporte.Maritimo.Embarcaciones;
import Transporte.Maritimo.Submarinos;
import Transporte.Terrestre.*;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        int count = 1;
        //Transporte Aereo
        List<Aerostatos> aerostatos = new ArrayList<>();
        List<NoPresurizados> noPresurizados = new ArrayList<>();
        List<Presurizados> presurizados = new ArrayList<>();
        List<NoTripulados> noTripulados = new ArrayList<>();
        //Transporte Marítimo
        List<Buques> buques = new ArrayList<>();
        List<Embarcaciones> embarcaciones = new ArrayList<>();
        List<Barcos> barcos = new ArrayList<>();
        List<Submarinos> submarinos = new ArrayList<>();
        //Transporte Terrestre
        List<Electricos> electricos = new ArrayList<>();
        List<Ferroviario> ferroviarios = new ArrayList<>();
        List<NoMotorizados> noMotorizados = new ArrayList<>();
        List<Motorizados> motorizados = new ArrayList<>();

    //Transporte Aereo
        aerostatos.add(new Aerostatos("Helio", "Civil", "1500 km", "4 horas", "90 km/h", "Piloto", "Aire"));
        aerostatos.add(new Aerostatos("Gas", "Militar", "3000 km", "8 horas", "120 km/h", "Piloto", "Aire"));
        aerostatos.add(new Aerostatos("Helio", "Turístico", "500 km", "2 horas", "80 km/h", "Piloto", "Aire"));

        noPresurizados.add(new NoPresurizados("Pasajeros", "Turbina", "5000 km", "10 horas", "800 km/h", "Piloto", "Aire"));
        noPresurizados.add(new NoPresurizados("Carga", "Turbina", "3000 km", "8 horas", "700 km/h", "Piloto", "Aire"));
        noPresurizados.add(new NoPresurizados("Pasajeros", "Hélice", "2000 km", "4 horas", "500 km/h", "Piloto", "Aire"));

        presurizados.add(new Presurizados("Pasajeros", "Turbina", "10000 km", "12 horas", "900 km/h", "Piloto", "Aire"));
        presurizados.add(new Presurizados("Carga", "Turbina", "8000 km", "10 horas", "800 km/h", "Piloto", "Aire"));
        presurizados.add(new Presurizados("Carga", "Hélice", "5000 km", "6 horas", "600 km/h", "Piloto", "Aire"));

        noTripulados.add(new NoTripulados("Carga", "Eléctrico", "100 km", "1 hora", "50 km/h", "Autónomo", "Aire"));
        noTripulados.add(new NoTripulados("Reconocimiento", "Gasolina", "500 km", "4 horas", "100 km/h", "Autónomo", "Aire"));
        noTripulados.add(new NoTripulados("Exploración", "Eléctrico", "50 km", "1 hora", "30 km/h", "Autónomo", "Aire"));

    //Transporte Marítimo
        buques.add(new Buques("Carga", "Diesel", "15000 km", "30 días", "50 km/h", "Capitán", "Mar"));
        buques.add(new Buques("Pasajeros", "Diesel", "10000 km", "20 días", "60 km/h", "Capitán", "Mar"));
        buques.add(new Buques("Carga", "Gasolina", "8000 km", "15 días", "40 km/h", "Capitán", "Mar"));

        embarcaciones.add(new Embarcaciones("Pasajeros", "Diesel", "500 km", "1 día", "30 km/h", "Capitán", "Mar"));
        embarcaciones.add(new Embarcaciones("Pesca", "Gasolina", "200 km", "8 horas", "20 km/h", "Capitán", "Mar"));
        embarcaciones.add(new Embarcaciones("Turístico", "Gasolina", "100 km", "4 horas", "25 km/h", "Capitán", "Mar"));

        barcos.add(new Barcos("Carga seca", "500 km", "Diesel", "1 día", "30 km/h", "50 metros", "Mar"));
        barcos.add(new Barcos("Productos químicos", "800 km", "Gasolina", "2 días", "25 km/h", "60 metros", "Mar"));
        barcos.add(new Barcos("Pasajeros", "200 km", "Diesel", "8 horas", "35 km/h", "40 metros", "Mar"));

        submarinos.add(new Submarinos("Armamento", "1000 km", "Diesel", "20 días", "25 nudos", "70 m", "Agua"));
        submarinos.add(new Submarinos("Suministros", "2000 km", "Eléctrico", "30 días", "20 nudos", "80 m", "Agua"));
        submarinos.add(new Submarinos("Investigación", "500 km", "Nuclear", "60 días", "30 nudos", "90 m", "Agua"));

        //Transporte Terrestre
        electricos.add(new Electricos("Tesla Model S", "Eléctrico", "350 km", "3.2 s", "250 km/h", "Carretera", "Eléctrico"));
        electricos.add(new Electricos("Nissan Leaf", "Eléctrico", "240 km", "8.4 s", "144 km/h", "Ciudad", "Eléctrico"));
        electricos.add(new Electricos("BMW i3", "Eléctrico", "260 km", "7.3 s", "150 km/h", "Ciudad", "Eléctrico"));

        ferroviarios.add(new Ferroviario("Tren AVE", "Eléctrico", "700 km", "4 h", "320 km/h", "Alta velocidad", "Tren"));
        ferroviarios.add(new Ferroviario("Tren de Cercanías", "Eléctrico", "40 km", "1 h", "80 km/h", "Cercanías", "Tren"));
        ferroviarios.add(new Ferroviario("Tren de Carga", "Diésel", "Sin límite", "Sin límite", "60 km/h", "Carga", "Tren"));

        noMotorizados.add(new NoMotorizados("Bicicleta", "Muscular", "Sin límite", "Sin límite", "40 km/h", "Ciudad", "Bicicleta"));
        noMotorizados.add(new NoMotorizados("Patineta", "Muscular", "Sin límite", "Sin límite", "30 km/h", "Ciudad", "Patineta"));
        noMotorizados.add(new NoMotorizados("Patineta eléctrica", "Eléctrico", "30 km", "2 h", "35 km/h", "Ciudad", "Patineta"));

        motorizados.add(new Motorizados("Automóvil", "Gasolina", "900 km", "5 s", "350 km/h", "Carretera", "Automóvil"));
        motorizados.add(new Motorizados("Camión", "Diésel", "1200 km", "15 s", "120 km/h", "Carretera", "Camión"));
        motorizados.add(new Motorizados("Moto", "Gasolina", "400 km", "2.5 s", "300 km/h", "Carretera", "Moto"));

        //Transporte Terrestre
        System.out.println("\nTransporte Terrestre");
        System.out.println("    Eléctricos:");
        for (Electricos electrico : electricos) {
            System.out.println("- " + electrico.toString());
        }

        System.out.println("\n    Ferroviario:");
        for (Ferroviario ferroviario : ferroviarios) {
            System.out.println("- " + ferroviario.toString());
        }

        System.out.println("\n    No Motorizado:");
        for (NoMotorizados noMotorizado : noMotorizados) {
            System.out.println("- " + noMotorizado.toString());
        }

        System.out.println("\n    Motorizados:");
        for (Motorizados motorizado : motorizados) {
            System.out.println("- " + motorizado.toString());
        }

        //Transporte Maritimo
        System.out.println("\nTransporte Marítimo");
        System.out.println("\n    Buques:");
        for (Buques buque : buques) {
            System.out.println("- " + buque.toString());
        }

        System.out.println("\n    Embarcaciones:");
        for (Embarcaciones embarcacion : embarcaciones) {
            System.out.println("- " + embarcacion.toString());
        }

        System.out.println("\n    Barcos:");
        for (Barcos barco : barcos) {
            System.out.println("- " + barco.toString());
        }

        System.out.println("\n    Submarinos:");
        for (Submarinos submarino : submarinos) {
            System.out.println("- " + submarino.toString());
        }

        //Transporte Aereo
        System.out.println("\nTransporte Aereo");
        System.out.println("    Aerostatos:");
        for (Aerostatos aerostato : aerostatos) {
            System.out.println("- " + aerostato.toString());
        }

        System.out.println("\n    No presurizados:");
        for (NoPresurizados noPresurizado : noPresurizados) {
            System.out.println("- " + noPresurizado.toString());
        }

        System.out.println("\n    Presurizados:");
        for (Presurizados presurizado : presurizados) {
            System.out.println("- " + presurizado.toString());
        }

        System.out.println("\n   No Tripulado:");
        for (NoTripulados noTripulado : noTripulados) {
            System.out.println("- " + noTripulado.toString());
        }
    }
}

