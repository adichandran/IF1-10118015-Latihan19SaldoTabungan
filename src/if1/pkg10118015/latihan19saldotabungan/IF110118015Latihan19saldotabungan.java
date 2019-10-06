/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan19saldotabungan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : menghitung saldo dengan bunga 15% selama beberapa bulan
 */
public class IF110118015Latihan19saldotabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // membuat kurensi indonesia
        DecimalFormat ind = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp.");
        formatRp.setMonetaryDecimalSeparator('.');
        formatRp.setGroupingSeparator('.');
        ind.setDecimalFormatSymbols(formatRp);
        
        double saldo = 2500000;
        double hbunga;
        for (int i=1; i <= 6; i++) {
            hbunga = (saldo * 0.15);
            saldo = (int) (saldo + hbunga);
            System.out.printf("Saldo di bulan ke-"+ i + " %s%n",ind.format(saldo));
        }
    }
}
