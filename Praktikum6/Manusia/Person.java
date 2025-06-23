/* Nama File : Person.java
 * Deskripsi : Kelas representasi Person
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 24 Apr 2025
*/

public class Person {
    private String name;

    public Person(String name) { 
        this.name = name;
    }

    public boolean isAsleep(int hr) {
        return hr > 22 || hr < 7;
    }

    public String toString() {
        return name;
    }
    

    public void status(int hr){
        if (this.isAsleep(hr)){
            System.out.println("Now offline : " + this);
        } else {
            System.out.println("Now online : " + this);
        }
    }
}
