package List;

import java.util.ArrayList;

public class ListTest1 {
	public static void main(String[] args) {
        // Membuat objek ArrayList untuk menyimpan elemen-elemen
        StrukturList list = new StrukturList();

        // Menambahkan elemen di akhir list menggunakan metode add
        list.addTail(3);
        list.addTail(4);
        list.addTail(5);
        
        // Menampilkan setiap elemen yang terdapat di list
        
        list.displayElement();
    }
}
