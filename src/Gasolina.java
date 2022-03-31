
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
public class Gasolina extends Vehiculo {

    private double capacidad;
    private double consumo;
    
    public Gasolina(){
        
        super();
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
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
        System.out.println("Dime capacidad total del deposito: ");
        capacidad = sc.nextInt();
        System.out.println("Dime consumo de litros/km : ");
        consumo = sc.nextDouble();

    }

    @Override
    public String toString() {
        return "Vehiculo Gasolina " + super.toString() + " " + "capacidad=" + capacidad + ", consumo=" + consumo + "autonia" + autonomia()+"gasto" + calculargasto()+ '}';
    }
    
     public double calculargasto(){
        
        double gasto;
        
        gasto = 100*20*consumo;
        
        return gasto;
        
        
    }
        
            public double autonomia(){
        
                double autonomia;
                
                autonomia = capacidad *consumo;
                
                return autonomia;
                

        
    }


}
