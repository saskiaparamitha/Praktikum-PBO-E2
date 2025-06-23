/* Nama File : Koleksi.java
 * Deskripsi : 
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 08 Mei 2025
 */

package Tugas;

import java.util.ArrayList;

public class Koleksi <T> {
    private int nbelm;
    private ArrayList<T> wadah;

    // Konstruktor
    public Koleksi(){
        this.nbelm = 0;
        this.wadah = new ArrayList<>();
    }

    // Method
    // Fungsi
    public T getIsi(int index){
        if (index >= 0 && index < nbelm){
            return wadah.get(index);
        }
        return null;
    }

    public void T setIsi(int index, T e){
        if (index >= 0 && index < nbelm){
            wadah.set(index, e);
        }
    }

    public int getSize(){
        return this.nbelm;
    }

    public void setSize(int x){
        this.nbelm = x;
    }

    public void add(T e){
        wadah.add(e);
        nbelm++;
    }

    public T delete(T e){
        if (nbelm > 0) {
            T e = wadah.remove(nbelm -1);
            nbelm--;
            return e;
        }
        return null;
    }

    public void showAll(){
        for (int i = 0; i < nbelm; i++){

        }
    }
}
