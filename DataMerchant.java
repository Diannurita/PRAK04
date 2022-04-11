import java.util.*;

public class DataMerchant {
    static Scanner in = new Scanner(System.in);
    static Merchant merc[] = new Merchant[0];
    
    public static Merchant[] tambahMerchant(Merchant merchant){
        Merchant data[] = new Merchant[DataMerchant.merc.length+1];
        
        for(int i = 0; i < DataMerchant.merc.length; i++){
            data[i] = DataMerchant.merc[i];
        }
        data[DataMerchant.merc.length]=merchant;
        return data;
    }
    
    public static void tampilData(){
        for(Merchant mch1 : merc){
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.println("Nama Merchant   : "+ mch1.getNamaMerchant());
            System.out.println("Nama Produk     : "+ mch1.getNamaProduk());
            System.out.println("Harga           : "+ (int)mch1.getHargaMakanan());
        }
    }
    
    public static Merchant cariMerchant(String nama){
        for(int i = 0; i < DataMerchant.merc.length; i++){
            if(nama.equalsIgnoreCase(DataMerchant.merc[i].getNamaMerchant())){
                return DataMerchant.merc[i];
            }
        }
        return null;
    }
    
    public static void tampilMerchant(Merchant merchant){
        System.out.println("==Hasil Pencarian==");
        System.out.println("====Tampilan Data Merchant UBFood====");
        System.out.println("Nama Merchant   : "+ merchant.getNamaMerchant());
        System.out.println("Nama Produk     : "+ merchant.getNamaProduk());
        System.out.println("Harga           : "+ (int)merchant.getHargaMakanan());
    }
    
    public static void updateMerchant(Merchant merchant){
        System.out.print("Nama Merchant Baru : ");
        String nama = in.nextLine();
        System.out.print("Nama Produk Baru   : ");
        String produk = in.nextLine();
        System.out.print("Harga Baru         : ");
        int harga = in.nextInt();
        merchant.setNamaMerchant(nama);
        merchant.setNamaProduk(produk);
        merchant.setHargaMakanan(harga);
        System.out.println();
        System.out.println("==Data Hasil Update==");
        tampilData();
    }
}
