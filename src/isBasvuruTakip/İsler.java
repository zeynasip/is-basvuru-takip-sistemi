/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bp2_1621221085_zeynep_nasip_odev1;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author asus
 */
public class İsler {

    String isverenAdi,
            isverenSoyadi,
            firmaAdi,
            isAdi,
            isDetay,
            isİl,
            cinsiyet;
    int yas, isverenNo,isId;

    static ArrayList<İsler> isIlanlari = new ArrayList();

    public İsler(String isverenAdi, String isverenSoyadi, int isverenNo, 
                 String firmaAdi, String isAdi, int yas, String cinsiyet, 
                 String isİl, String isDetay,int isId) {
        this.isverenAdi = isverenAdi;
        this.isverenSoyadi = isverenSoyadi;
        this.isverenNo = isverenNo;
        this.firmaAdi = firmaAdi;
        this.isAdi = isAdi;
        this.yas = yas;
        this.cinsiyet = cinsiyet;
        this.isİl = isİl;
        this.isDetay = isDetay;
        isIlanlari.add(this);
        this.isId = isId;
    }

    

    
}
