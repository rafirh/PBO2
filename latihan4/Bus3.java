/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan4;

/**
 *
 * @author rafir
 */
public class Bus3 {
    private int penumpang, maxPenumpang;
    //konstruktor
    public Bus3(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    //method mutator
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if (temp > maxPenumpang){
            System.out.println("Penumpang melebihi kuota");
        }else{
            this.penumpang = temp;
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
    
    public void cetakpenumpang(){
        System.out.println("Penumpang Bus sekarang adalah "+ penumpang);
        System.out.println("Penumpang maksimum seharusnya adalah " + maxPenumpang);
    }
}