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
public class İsveren {
    
        public static String ad;
        public static String soyad;
        public static String firma;
        public static int numara;
            int id;
            static ArrayList <İsveren> isverenler = new ArrayList();

     İsveren(int id,String ad, String soyad, String firma, int numara, ArrayList<İsveren>ilanlar) {
        this.ad = ad;
        this.soyad = soyad;
        this.firma = firma;
        this.numara = numara;
        this.id = id;
        ilanlar.add(this);
        isverenler.add(this);
    }
     
    
            
            

           
            
    
}
