
import java.util.Locale;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author 888
 */
public class Electrico extends Vehiculo {

    private int capacidad;
    private double tiempo;
    private double consumo;

    public Electrico() {

        super();
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void altaVehiculo() {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        super.altaVehiculo();
        System.out.println("Dime capacidad total bateria : ");
        capacidad = sc.nextInt();
        System.out.println("Cuanto tiempo dura la carga : ");
        tiempo = sc.nextDouble();
        System.out.println("Dime consumo de Wh/km : ");
        consumo = sc.nextDouble();

        // return nuevo.toString();
    }

    @Override
    public String toString() {
        return "Vehiculo Electrico " + super.toString() + " " + "capacidad=" + capacidad + ", tiempo=" + tiempo + ", consumo=" + consumo + "autonia" + autonomia()+"gasto" + calculargasto()+'}';
    }

    public double calculargasto() {

        double gasto;

        gasto = 100 * 20 * consumo;

        return gasto;

    }

    public double autonomia() {

        double autonomia;

        autonomia = capacidad * consumo;

        return autonomia;

       
    }

}
