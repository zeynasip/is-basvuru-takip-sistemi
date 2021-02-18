/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_1621221085_zeynep_nasip_odev1;

import java.security.PublicKey;
import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class Basvuran {

    static String ad,
            soyad,
            meslek,
            egitim,
            il,
            cinsiyet;
    static int basvuranId;
    static int yas, numara;

    static ArrayList<Basvuran> basvuranlar = new ArrayList();

    public Basvuran(int basvuranId, String ad, String soyad,
            String meslek, String egitim, String il, String cinsiyet,
            int yas, int numara) {
        this.basvuranId = basvuranId;
        this.ad = ad;
        this.soyad = soyad;
        this.meslek = meslek;
        this.egitim = egitim;
        this.il = il;
        this.cinsiyet = cinsiyet;
        this.yas = yas;
        this.numara = numara;
        basvuranlar.add(this);

    }

}
