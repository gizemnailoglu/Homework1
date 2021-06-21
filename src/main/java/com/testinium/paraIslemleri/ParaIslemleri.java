package com.testinium.paraIslemleri;

import com.testinium.musteri.Musteri;

public class ParaIslemleri {

    public void ParaCek(Musteri musteri,double tutar){
        if(musteri.getHesapBakiyesi()>=tutar){
            musteri.setHesapBakiyesi(musteri.getHesapBakiyesi()-tutar);
        }else{
            System.out.println("Bakiyeniz yetersiz");

        }
    }
    public void ParaYatir(Musteri musteri,double tutar){
        musteri.setHesapBakiyesi(musteri.getHesapBakiyesi()+tutar);
    }
}
