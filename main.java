import java.util.*;

public class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nama    : Dian Nurita Hasanah");
        System.out.println("NIM     : 215150600111028");
        System.out.println("----------------------------------------");
        System.out.println("-------Selamat Datang di UB Food--------");
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid","Bakso",8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes","Nasi Goreng Jawa",10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros","Ayam Kota Ekstra Nasi",10000));
        DataMerchant.tampilData();
        System.out.println();

        System.out.println(" Pilih tindakan : ");
        System.out.println(" 1. Tambah Merchant");
        System.out.println(" 2. Cari merchant");
        System.out.println(" 3. Update merchant");

        System.out.print("Silahkan pilih : ");
        int pilih = sc.nextInt();

        switch (pilih) {
            case 1:
                System.out.println("==Tambah Merchant Baru==");
                sc.nextLine();
                System.out.print("Nama Merchant   : ");
                String a = sc.nextLine();
                System.out.print("Nama Produk     : ");
                String b = sc.nextLine();
                System.out.print("Harga           : ");
                int c = sc.nextInt();

                DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(a, b, c));
                System.out.println();
                DataMerchant.tampilData();
                break;
            case 2 :
                System.out.println("Mau mencari merchant ? (y/t)");
                sc.nextLine();
                String ans = sc.nextLine();
                if (ans.equalsIgnoreCase("t")) {
                    DataMerchant.tampilData();
                } else {
                    sc.nextLine();
                    System.out.print("Cari merchant   : ");
                    String nama = sc.nextLine();
                    if (DataMerchant.cariMerchant(nama) == null) {
                        System.out.println("Merchant tidak diketahui");
                    } else {
                        DataMerchant.tampilMerchant(DataMerchant.cariMerchant(nama));
                    }
                }
                break;
            case 3 :
                System.out.println("Mau update merchant ? (y/t)");
                sc.nextLine();
                String jwb = sc.nextLine();
                if (jwb.equalsIgnoreCase("t")) {
                    DataMerchant.tampilData();
                } else {
                    System.out.print("Cari merchant   : ");
                    String nama = sc.nextLine();
                    if (DataMerchant.cariMerchant(nama) == null) {
                        System.out.println("Merchant tidak diketahui");
                    } else {
                        DataMerchant.updateMerchant(DataMerchant.cariMerchant(nama));
                    }
                }
        }
    }
}
