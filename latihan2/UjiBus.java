/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;

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
        Bus busBesar = new Bus(40);
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(15);//menumbahkan 15 penumpang 
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(5);//menumbahkan 5 penumpang 
        busBesar.cetak();
        
        //penambahan penumpang
        busBesar.addPenumpang(26);//menumbahkan 26 penumpang 
        busBesar.cetak();
    }
    
}
