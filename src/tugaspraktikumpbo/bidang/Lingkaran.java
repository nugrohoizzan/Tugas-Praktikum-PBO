/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspraktikumpbo.bidang;

/**
 *
 * @author ASUS
 */
public class Lingkaran implements HitungBidang {
    public double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double getJariJari() {
        return jariJari;
    }

    public void setJariJari(double jariJari) {
        this.jariJari = jariJari;
    }
    
    @Override
    public double Luas(){
        return Math.PI * this.jariJari * this.jariJari;
    }
    
    @Override
    public double Keliling(){
        return 2 * Math.PI * jariJari;
    }
    
}
