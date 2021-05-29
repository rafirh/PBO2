/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1;

/**
 *
 * @author rafir
 */
public class Bus {
    private double penumpang, maxPenumpang;
    private int counter;
    public double penumpangBaru;
    
    //konstruktor
    public Bus(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    //method mutator
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if (temp > maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
            counter++;
        }
    }
    
    public void getPenumpang(int password){
        if(password==24){
            System.out.println("Password Benar");
        }
        else{
            System.out.println("Password salah");
        }
    }
    
    public double getAverage(){
        double average = penumpang / counter;
        return average;
    }
    
    public void cetakpenumpang(){
        System.out.println("Penumpang Bus sekarang adalah "+ penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + maxPenumpang);
    }
}