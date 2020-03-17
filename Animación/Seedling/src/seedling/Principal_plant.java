/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package seedling;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Isabel Cristina
 */
public class Principal_plant {
    
    static int contador=0;  //muestra en que imagenes esta
    planta_Frame plant = new planta_Frame();

    Timer timer;
    TimerTask tarea;
    
    ArrayList<Double> listaNotas = new ArrayList<Double>();

    
    public void calcularPorcentajeNota(){
        Scanner notaScanner = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Ingresar nota");

        double nota = notaScanner.nextDouble();  // Read user input
        listaNotas.add(nota);
        double sumaNotas = 0.0;
        double notaAcumulada;
        for (int i = 0; i < listaNotas.size(); i++) {
            sumaNotas += listaNotas.get(i);
        }
        notaAcumulada = sumaNotas / listaNotas.size();
        System.out.println("Nota acumulada: " + notaAcumulada);
        recibirNota(notaAcumulada);
    }
    
    public void recibirNota(double nota){
        
        if(nota >= 0 && nota < 1){
            notaBaja();
        }
        else if(nota >= 1 && nota < 2){
            notaAceptable();
        }
        else if(nota >= 2 && nota < 3){
            notaMedia();
        }
        else if(nota >= 3 && nota < 4){
            notaAlta();
        }
        else if(nota >= 4 && nota <= 5){
            notaSuperior();
        }
    }
    
    public void notaBaja(){
        plant.setVisible(true);
        Icon icono;
        icono = new ImageIcon(getClass().getResource("/iconosE1/from0to1.gif"));
        plant.jLabel1.setIcon(icono);
        calcularPorcentajeNota();
    }
    
    public void notaAceptable(){
        plant.setVisible(true);
        Icon icono;
        icono = new ImageIcon(getClass().getResource("/iconosE1/from1to2.gif"));
        plant.jLabel1.setIcon(icono); 
        calcularPorcentajeNota();
    }
    
    public void notaMedia(){
        plant.setVisible(true);
        Icon icono;
        icono = new ImageIcon(getClass().getResource("/iconosE1/from2to3.gif"));
        plant.jLabel1.setIcon(icono); 
        calcularPorcentajeNota();                
    }
    
    public void notaAlta(){
        plant.setVisible(true);
        Icon icono;
        icono = new ImageIcon(getClass().getResource("/iconosE1/from3to4.gif"));
        plant.jLabel1.setIcon(icono); 
        calcularPorcentajeNota(); 
    }
    
    public void notaSuperior(){
        plant.setVisible(true);
        Icon icono;
        icono = new ImageIcon(getClass().getResource("/iconosE1/from4to5.gif"));
        plant.jLabel1.setIcon(icono); 
        calcularPorcentajeNota(); 
    }

}
