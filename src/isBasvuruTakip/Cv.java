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
public class Cv {
    
    static String basvuranAdi,
           basvuranSoyadi,
           basvuranCinsiyet,
           basvuranEgitim,
           basvuranİl,
           basvuranMeslek;
    static int basvuranYas,
              basvuranTelNo,
              cvId;
    
    static ArrayList <Cv> cvler = new ArrayList();

    public Cv(String basvuranAdi, String basvuranSoyadi, String basvuranCinsiyet,
              String basvuranEgitim, String basvuranİl, String basvuranMeslek,
              int basvuranYas, int basvuranTelNo, int cvId){
              this.basvuranAdi = basvuranAdi;
              this.basvuranSoyadi = basvuranSoyadi;
              this.basvuranCinsiyet = basvuranCinsiyet;
              this.basvuranEgitim = basvuranEgitim;
              this.basvuranİl = basvuranİl;
              this.basvuranMeslek = basvuranMeslek;
              this.basvuranYas = basvuranYas;
              this.basvuranTelNo = basvuranTelNo;
              this.cvId = cvId;
              cvler.add(this);
    }
    
    
    
}
