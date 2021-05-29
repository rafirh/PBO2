/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum2;

/**
 *
 * @author rafir
 */
public class Bola {
    private double jarijari;
  
  void setJariJari(double jari2){
    this.jarijari = jari2;
  }

  void showDiameter(){
    double res = this.jarijari * 2;
    System.out.println("Diameter nya adalah : "+ res + " cm");
  }

  void showLuasPermukaan(){
    double res = 4 * Math.PI * Math.pow(this.jarijari, 2);
    System.out.println("Luas permukaannya adalah : "+ res + " cm kuadrat");
  }

  void showVolume(){
    double res = (4/3) * Math.PI * Math.pow(this.jarijari, 3);
    System.out.println("Volumenya adalah : "+ res + " cm kubik");
  }
}
