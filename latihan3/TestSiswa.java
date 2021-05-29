/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan3;

/**
 *
 * @author rafir
 */
public class TestSiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EncapSiswa siswa = new EncapSiswa();
        siswa.setName("Julian");
        siswa.setAbsen(23);
        siswa.setAddress("Malang");
        
        System.out.print("Name : " + siswa.getName()
        + "\nAbsen : " + siswa.getAbsen() + 
         "\nAddress : " + siswa.getAddress()+ "\n");
    }
    
}
