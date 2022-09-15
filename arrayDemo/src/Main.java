import javax.sound.midi.SysexMessage;

public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Engin";
        String ogrenci2 = "Gökhan";
        String ogrenci3 = "Salih";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println("---------------------------");



        String[] ogrenciler = new String[4];  //Dizi tanımlama
        ogrenciler[0]="Engin"; //[] kullanarak numarasını belirleyebiliyoruz. + isim tag verebiliyoruz.
        ogrenciler[1]="Gökhan";
        ogrenciler[2]="Salih";
        ogrenciler[3]="Ecem";


        //length eleman sayısını belirlediğimize göre sıralama yapıyor. 0 dan başlıyor.
        for(int i=0;i<ogrenciler.length;i++){
            System.out.println(ogrenciler[i]);
            System.out.println("------------------------");
        }
        //ogrenciler dizisindeki her bir elemanı gez komutu.
        // Tag verdiklerinin tamamını sıralıyor.Grup haline getiriyoruz burda. i<ogrenciler Dediğimiz yer
        for(String ogrenci:ogrenciler){
            System.out.println(ogrenci);
        }


    }
}