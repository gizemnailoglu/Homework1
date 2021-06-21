
import com.sun.javafx.collections.MappingChange;
import com.testinium.musteri.BireyselMusteri;
import com.testinium.musteri.KurumsalMusteri;
import com.testinium.musteri.Musteri;
import com.testinium.paraIslemleri.ParaIslemleri;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Hoşgeldiniz");


        Map<String,Musteri> map=new HashMap<String,Musteri>();

            map.put("1",new BireyselMusteri("Gizem","Nailoğlu","123456789",45312.00,"Ata2 sitesi,Üsküdar/İstanbul"));
            map.put("2",new KurumsalMusteri("Ali","Yılmaz","1275469",94857.50,"Testinium"));
            map.put("3",new BireyselMusteri("Yaren" , "Duran" , "73352873", 100.00 , "Malta mahallesi , İzmit/Kocaeli"));
            map.put("4",new KurumsalMusteri("Ozan", "Aydın", "3834321" , 1927.50 , "Intertech"));
            map.put("5", new BireyselMusteri("Ayhan", "Kader", "1824749037" , 3540385.00, "Bağcılar mah, Güneşli cad İstanbbul"));


            for(Map.Entry<String, Musteri> entry:map.entrySet()){
                String key=entry.getKey();
                Musteri b=entry.getValue();

                System.out.println("Müşteri hesap numarası:"+key);
                System.out.println(b.toString());
        }
            Scanner scanner=new Scanner(System.in);

            ParaIslemleri paraIslemleri=new ParaIslemleri();
            System.out.println("İşlem yapılacak hesap numarasını giriniz :");
            String hesapNo=scanner.nextLine();
            scanner=new Scanner(System.in);
            System.out.println("Para çekme için 1, Para yatırma için 2'yi tuşlayınız");
            int secim=scanner.nextInt();
            scanner=new Scanner(System.in);
            if(secim==1){
                System.out.println("Çekilecek tutarı giriniz:");
                double tutar=scanner.nextDouble();
                System.out.println(map.get(hesapNo).toString());
               paraIslemleri.ParaCek(map.get(hesapNo),tutar);
                System.out.println(map.get(hesapNo).toString());
            }
            else if(secim ==2){
                System.out.println("Yatırılacak tutarı giriniz:");
                double tutar=scanner.nextDouble();
                System.out.println(map.get(hesapNo).toString());
                paraIslemleri.ParaYatir(map.get(hesapNo),tutar);
                System.out.println(map.get(hesapNo).toString());
            }
        }
    }

