/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_1621221085_zeynep_nasip_odev1;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class Uye{
    
    static ArrayList <Uye> uyeler = new ArrayList();
    
    
    String ad;
    String soyad;
    String kullaniciAd;
    String sifre;
    int id;
    String uyelikTuru;
    

    public Uye(String ad, String soyad, String kullaniciAd, String sifre, int id, String uyelikTuru) {
        this.ad = ad;
        this.soyad = soyad;
        this.kullaniciAd = kullaniciAd;
        this.sifre = sifre;
        this.id = id;
        this.uyelikTuru = uyelikTuru;
        uyeler.add(this);
    }

    
    
    
    
}
