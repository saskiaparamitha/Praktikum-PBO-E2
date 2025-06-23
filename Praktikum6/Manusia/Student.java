/* Nama File : Student.java
 * Deskripsi : Kelas representasi Student
 * Pembuat   : Saskia Putri Paramitha
 * Tanggal   : Kamis, 24 Apr 2025
*/

public class Student extends Person {
    public Student (String name){
        super(name);
    }

    @Override
    public boolean isAsleep(int hr){
        return hr > 22 && hr < 8;
    }
}
