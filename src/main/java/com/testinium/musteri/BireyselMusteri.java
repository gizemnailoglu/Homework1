package com.testinium.musteri;

public class BireyselMusteri extends  Musteri {


    public String evAdresi;

    public BireyselMusteri(String ad, String soyad, String tcKimlik, double hesapBakiyesi,String evAdresi) {
        super(ad, soyad, tcKimlik, hesapBakiyesi);
        this.evAdresi=evAdresi;
    }


    public String getEvAdresi(){
       return evAdresi;
   }

   public void setEvAdresi(String evAdresi){
       this.evAdresi = evAdresi;
   }

    @Override
    public String toString() {
        return "Bireysel Müşteri: "+super.toString()+" Ev Adresi:"+getEvAdresi();
    }
}