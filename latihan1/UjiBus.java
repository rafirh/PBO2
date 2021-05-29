/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author rafir
 */
public class UjiBus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //membuat objek dari kelas Bus
        Bus busMini = new Bus();
        
        //memasukkan nilai ke dalam atribut objek
        busMini.penumpang = 5;
        busMini.maxPenumpang =15;
        
        //menambahkan penumpang pada busMini
        busMini.penumpang = busMini.penumpang+5;
        //memanggil method cetak
        busMini.cetak();
        
        //mengurangi jumlah penumpang pada
        busMini.penumpang = busMini.penumpang-2;
        busMini.cetak();
        
        //menambahkan penumpang pada busMini
        busMini.penumpang = busMini.penumpang+8;
        busMini.cetak();
        
    }
    
}
