package com.testinium.musteri;

public class KurumsalMusteri  extends  Musteri{

    public String sirketAdi;

    public KurumsalMusteri(String ad, String soyad, String tcKimlik, double hesapBakiyesi,String sirketAdi) {
        super(ad, soyad, tcKimlik, hesapBakiyesi);
        this.sirketAdi=sirketAdi;
    }


    public String getSirketAdi(){
       return sirketAdi;
   }

   public void setSirketAdi(String sirketAdi){
       this.sirketAdi = sirketAdi;
   }
    @Override
    public String toString() {
        return "Kurumsal Müşteri: "+super.toString()+" Şirket Adı:"+getSirketAdi();
    }
}
