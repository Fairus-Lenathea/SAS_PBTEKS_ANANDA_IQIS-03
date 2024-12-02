// Import library untuk membaca input dari pengguna
import java.util.Scanner;

// Kelas untuk mengelola pendataan makanan di hutan
public class MisiMenjagaHutan {
    // Metode utama untuk menjalankan program pendataan
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input
        // Membantu kita berinteraksi dengan pengguna
        Scanner input = new Scanner(System.in);
        
        // Variabel untuk menyimpan total makanan yang terkumpul
        // Berguna untuk melacak jumlah keseluruhan
        int totalMakanan = 0;
        
        // Penghitung untuk melacak jumlah iterasi pendataan
        // Membantu memberi nomor urut pada setiap input
        int iterasi = 0;
        
        // Perulangan untuk proses pendataan makanan
        // Menggunakan do-while untuk memastikan minimal satu kali input
        do {
            // Tambah nomor iterasi setiap kali perulangan
            iterasi++;
            
            // Tampilkan prompt untuk memasukkan jumlah makanan
            // Memberi informasi kepada pengguna iterasi ke berapa
            System.out.printf("Pendataan Makanan Ke-%d: ", iterasi);
            
            // Ambil input jumlah makanan dari pengguna
            int jumlahMakanan = input.nextInt();
            
            // Kondisi untuk menghentikan pendataan
            // Memungkinkan pengguna keluar dengan input negatif
            if (jumlahMakanan < 0) {
                System.out.println("--- Pendataan Ditutup ---");
                break;
            }
            
            // Tentukan status makanan (genap/ganjil)
            // Menggunakan operator ternary untuk pemeriksaan cepat
            String statusMakanan = (jumlahMakanan % 2 == 0) ? 
                "Genap dan Bisaji Dibagi Rata Makanannya" : 
                "Aii... Ganjilki, Tambai Satu Makanan Lagi";
            
            // Tampilkan informasi status makanan
            // Memberikan umpan balik langsung kepada pengguna
            System.out.println("Status: Makanan " + jumlahMakanan + " adalah " + statusMakanan);
            
            // Akumulasi total makanan
            // Menambahkan setiap input ke total keseluruhan
            totalMakanan += jumlahMakanan;
            
        } while (true);  // Perulangan berkelanjutan hingga ada perintah break
        
        // Tampilkan total makanan yang terkumpul
        // Memberikan ringkasan akhir dari proses pendataan
        System.out.println("\nIni Total Makanan Yang Sudah Terkumpul: " + totalMakanan);
        
        // Tutup scanner untuk mencegah kebocoran sumber daya
        // Praktik baik dalam manajemen memori
        input.close();
    }
}