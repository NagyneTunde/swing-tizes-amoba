/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author nagyg
 */
public class Jatekos {

    private String nev;
    private String jel;

    public Jatekos() {
    }

    public Jatekos(String nev, String jel) {
        this.nev = nev;
        this.jel = jel;
    }

    public void lepesBeker() {// ez bekéri a játékos lépését és visszaadja egy stringben
        //gombkattintás, amit kattintott, az a lépés, a mainben a toggle buttonon

       
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getJel() {
        return jel;
    }

    public void setJel(String jel) {
        this.jel = jel;
    }

}
