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
public class Tabla {

    private String[][] tabla;

    public Tabla() {
        tabla = new String[10][10];
         for (int i = 0; i < 10; i++) {
        for (int j = 0; j < 10; j++) {
            tabla[i][j] = " ";
        }
    }
    }

    public String nyertesVizsgal(Jatekos aktJatekos, int oszlop, int sor) {

        String eredmeny = "";

        //sorban egyforma
        for ( oszlop = 0; oszlop < tabla.length; oszlop++) {// oszlopok száma
            for ( sor = 0; sor < tabla[oszlop].length - 3; sor++) {
                if (tabla[oszlop][sor].equals(aktJatekos.getJel())
                        && tabla[oszlop][sor + 1].equals(aktJatekos.getJel())
                        && tabla[oszlop][sor + 2].equals(aktJatekos.getJel())
                        && tabla[oszlop][sor + 3].equals(aktJatekos.getJel())) {
                    return aktJatekos.getJel() + " nyert";
                }
            }
        }

        //oszlopban egyforma
        for ( oszlop = 0; oszlop < tabla[0].length; oszlop++) {  // oszlopok száma
            for ( sor = 0; sor < tabla.length - 3; sor++) {    // tabla.length → sorok száma, csak addig, amíg 4 egymás alatt van
                if (tabla[sor][oszlop].equals(aktJatekos.getJel())
                        && tabla[sor + 1][oszlop].equals(aktJatekos.getJel())
                        && tabla[sor + 2][oszlop].equals(aktJatekos.getJel())
                        && tabla[sor + 3][oszlop].equals(aktJatekos.getJel())) {
                    return aktJatekos.getJel() + " nyert";
                }
            }
        }

        //átlókban egyforma
        for ( oszlop = 0; oszlop < tabla[0].length - 3; oszlop++) { // oszlopok száma
            for ( sor = 0; sor < tabla.length - 3; sor++) {
                if (tabla[sor][oszlop].equals(aktJatekos.getJel())
                        && tabla[sor + 1][oszlop + 1].equals(aktJatekos.getJel())
                        && tabla[sor + 2][oszlop + 2].equals(aktJatekos.getJel())
                        && tabla[sor + 3][oszlop + 3].equals(aktJatekos.getJel())) {
                    return eredmeny = aktJatekos.getJel() + " nyert";
                } else if (tabla[sor][oszlop + 3].equals(aktJatekos.getJel())
                        && tabla[sor + 1][oszlop + 2].equals(aktJatekos.getJel())
                        && tabla[sor + 2][oszlop + 1].equals(aktJatekos.getJel())
                        && tabla[sor + 3][oszlop].equals(aktJatekos.getJel())) {
                    return eredmeny = aktJatekos.getJel() + " nyert";
                }
            }
        }
        //döntetlen: mind betelt

        for ( oszlop = 0; oszlop < tabla[0].length; oszlop++) { // oszlopok száma
            for ( sor = 0; sor < tabla.length; sor++) {
                if (!tabla[sor][oszlop].equals(" ")) {
                    return eredmeny = "Döntetlen";
                } else {
                    return eredmeny = "Még nincs vége";
                }
            }
        }
        return eredmeny;

    }
 public void lepes(int sor, int oszlop, Jatekos aktJatekos) {// ez a megadott sor,oszlopba beteszi a játékos lépését
        tabla[sor][oszlop] = aktJatekos.getJel();
    }
}
