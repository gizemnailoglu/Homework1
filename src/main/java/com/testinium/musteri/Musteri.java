package com.testinium.musteri;

public class Musteri {

    public String ad;
    public String soyad;
    public String tcKimlik;
    public double hesapBakiyesi;



    public Musteri(String ad, String soyad, String tcKimlik, double hesapBakiyesi) {
        this.ad=ad;
        this.soyad=soyad;
        this.tcKimlik=tcKimlik;
        this.hesapBakiyesi=hesapBakiyesi;
    }


    public String getAd(){
        return ad;
    }

    public void setAd(String ad){
        this.ad = ad;
    }

    public String getSoyad(){
        return soyad;
    }

    public void setSoyad(String soyad){
        this.soyad = soyad;
    }

    public String getTcKimlik(){
        return tcKimlik;
    }
    public void setTcKimlik(String tcKimlik){
        this.tcKimlik = tcKimlik;
    }

    public double getHesapBakiyesi(){

        return hesapBakiyesi;
    }

    public void setHesapBakiyesi(double hesapBakiyesi){
        this.hesapBakiyesi= hesapBakiyesi;

    }

    @Override
    public String toString() {
        return " " +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", tcKimlik='" + tcKimlik + '\'' +
                ", hesapBakiyesi=" + hesapBakiyesi +
                ' ';
    }
}
