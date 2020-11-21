/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119025.latihan58.tambahkurang;

/**
 *
 * @author User
 */
public class SelisihBilangan extends Bilangan{
    public void tampilSelisih(){
        int hitungSelisih = getX() - getY();
        System.out.println("Hasil selisih " + getX() + " - " + getY() + " = " + hitungSelisih);
    }
}
