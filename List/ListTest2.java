package List;

import java.util.ArrayList;

public class ListTest2 {
	public static void main(String[] args) {
        // Membuat objek ArrayList untuk menyimpan elemen-elemen
        StrukturList list = new StrukturList();

        // Menambahkan elemen di akhir list menggunakan metode add
        list.addTail(3);
        list.addTail(2);
        list.addTail(1);
        list.addTail(7);
        
        // Menampilkan setiap elemen yang terdapat di list
        
        list.displayElement();
    }
}
