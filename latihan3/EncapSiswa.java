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
public class EncapSiswa {
    private String name, address;
    private int absen;

    public int getAbsen() {
        return absen;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAbsen(int absen) {
        this.absen = absen;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}