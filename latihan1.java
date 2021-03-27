import java.util.Scanner;
public class latihan1 {
    public static void main(String [] args){
        Scanner objek = new Scanner(System.in);
        int menu, pilihan, total_sementara, total_akhir, jumlah;
        total_sementara = 0;
        total_akhir = 0;
        latihan1 diskon1 = new latihan1();
        diskon diskon2 = new diskon();

        System.out.println("\n<<<<<<<>>SELAMAT DATANG DI UD KRISSNA>>>>>>>>>>>\n");
        System.out.println("\n<<<<<<<Barang yang tersedia di UD Krisna>>>>>>>>\n");
        System.out.println(" Daftar Minuman dan Cemilan     Harga\n");
        System.out.println("1. Aqua                         Rp.3000 \n");
        System.out.println("2. Teh Botol                    Rp.5000 \n");
        System.out.println("3. Susu Dancow                  Rp.15000\n");
        System.out.println("4. Sari Roti                    RP.4000 \n");
        System.out.println("5. Waffle Tanggo                Rp.7000 \n");
    do {
        System.out.println("\nSilakan Pilih Menu Yang Anda Inginkan: ");
        menu = objek.nextInt();
        System.out.println("Masukkan jumbalah barang: ");
        jumlah = objek.nextInt();

        if (menu == 1) {
            System.out.println("Anda Membeli Aqua");
            total_sementara= jumlah * 3000;
            System.out.println("Sub total harga = Rp. " + total_sementara);
        } else if (menu == 2) {
            System.out.println("Anda Membeli Teh Botol");
            total_sementara = jumlah * 5000;
            System.out.println("Sub total harga = Rp. " + total_sementara);
        } else if (menu == 3) {
            System.out.println("Anda Membeli Susu Dancow");
            total_sementara = jumlah * 15000;
            System.out.println("Sub total harga = Rp. " + total_sementara);
        } else if (menu == 4) {
            System.out.println("Anda Membeli Sari Roti");
            total_sementara = jumlah * 4000;
            System.out.println("Sub total harga = Rp. " + total_sementara);
        } else if (menu == 5) {
            System.out.println("Anda Membeli Waffl Tanggo");
            total_sementara = jumlah * 7000;
            System.out.println("Sub total harga = Rp. " + total_sementara);
        } else {
            System.out.println("Inputan Adan Salah! Mohon Masukan Pilihan Angka 1 sampai 5");
        }
        System.out.println("\nApakah anda ingin berbelanja lagi?");
        System.out.println("Tekan 1 jika ya, Dan 2 jika tidak");
        pilihan= objek.nextInt();
        total_akhir = total_akhir + total_sementara;

    }while (pilihan !=2);
        System.out.println("\nTotal balnja anda = Rp. " + total_akhir);
        diskon2.hitung1(total_akhir);
    }
}
