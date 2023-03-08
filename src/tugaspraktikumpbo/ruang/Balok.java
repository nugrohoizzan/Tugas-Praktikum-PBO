/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikumpbo.ruang;

import tugaspraktikumpbo.bidang.PersegiPanjang;

/**
 *
 * @author ASUS
 */
public class Balok extends PersegiPanjang implements HitungRuang {
    
    private int tinggi;

    public Balok(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    @Override
    public double Volume() {
        return this.Luas()*this.tinggi;
    }

    @Override
    public double LuasPermukaan() {
        return 2*((this.panjang*this.lebar) + (this.panjang*this.tinggi) + (this.lebar*this.tinggi)) ;
    }
    
}
        
