/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c1ejercicio1;

import javax.swing.JOptionPane;

/**
 *
 * @author Aulas Heredia
 */
public class C1Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String nombre;
    double salariosemanal;
    double salariomensual;
    double deduccion;
    double deducciondesalario;
    double salarioneto;
    
    deduccion = 0.0934;
    nombre = JOptionPane.showInputDialog("Digite el nombre del trabajador:");
    salariosemanal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario semanal del trabajador: "));
    salariomensual = salariosemanal * 4;
    deducciondesalario = salariomensual * deduccion;
    salarioneto = salariomensual - deducciondesalario;
    
        System.out.println("El trabajador " + nombre + " recibe un salario semanal de: $" + salariosemanal + ", lo que significa un salario mensual de: $" + salariomensual);
        System.out.println("Y con las debidas deducciones de aproximadamente: $" + deducciondesalario + " recibe un salario neto de: $" + salarioneto);
    
    
    }             
}
