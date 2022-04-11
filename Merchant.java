
public class Merchant {
    private  String namaMerchant;
    private  String namaProduk;
    private  double hargaMakanan;
    
    Merchant(String namaMerchant, String namaProduk, double hargaMakanan){
        setNamaMerchant(namaMerchant);
        setNamaProduk(namaProduk);
        setHargaMakanan(hargaMakanan);
    }
    public void setNamaMerchant(String namaMerchant){
        this.namaMerchant = namaMerchant;
    }
    
    public void setNamaProduk(String namaProduk){
        this.namaProduk = namaProduk;
    }
    
    public void setHargaMakanan(double hargaMakanan){
        this.hargaMakanan = hargaMakanan;
    }
    
    public String getNamaMerchant(){
        return namaMerchant;
    }
    
    public String getNamaProduk(){
        return namaProduk;
    }
    
    public double getHargaMakanan(){
        return hargaMakanan;
    }
}
