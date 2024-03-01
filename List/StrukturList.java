package List;

public class StrukturList {
	private Node HEAD;
    

    // Fungsi untuk menambahkan elemen di akhir/tail list
    public void addTail(int data) {
    	Node posNode, curNode; 
        Node newNode = new Node(data); // Membuat node baru dengan data yang diberikan
        

        // Jika list kosong, maka node baru menjadi HEAD
        if (isEmpty()) {
            HEAD = newNode;
        } else {
             curNode = HEAD; // Mengatur curNode menjadi HEAD
            while (curNode.getNext() != null) { // Melakukan iterasi hingga curNode menunjuk ke node terakhir
                posNode = curNode;
            	curNode = curNode.getNext(); // Memperbarui curNode dengan node berikutnya
            }
            
       
            // Mengatur node berikutnya dari node terakhir menjadi node baru
            curNode.setNext(newNode);
        }
    }

    // Fungsi untuk mengecek apakah list kosong
    public boolean isEmpty() {
        return HEAD == null;
    } 
    
    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.getData() + " ");
            curNode = curNode.getNext();
        }
    }
}
