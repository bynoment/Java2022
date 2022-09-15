public class Main {
    public static void main(String[] args) {
        String[][] Sehirler = new String[3][3];  //Burda [][] Kaç adet kullanırsak o kadar veri açıyor.
        //[3][3] Olan kısım 3x3 tablo şeklinde düşün. 01 ,02,03 = 1.tab 10,11,12 = 2. tab 20,21,22 = 3.tab
        //şeklinde sıralama yaparak grupluyor.

        Sehirler[0][0] = "İstanbul";
        Sehirler[0][1] = "Bursa";
        Sehirler[0][2] = "Bilecik";
        Sehirler[1][0] = "Samsun";
        Sehirler[1][1] = "Ordu";
        Sehirler[1][2] = "Sinop";
        Sehirler[2][0] = "Ankara";
        Sehirler[2][1] = "Konya";
        Sehirler[2][2] = "Kayseri";

        for(int i = 0; i<=2;i++){ //for amacı satır 0 dan 2 ye kadar say. Sonra aşşağıdaki for a geç 0 dan 2 ye yaz. Sonrasında diğer slotun 0 dan 2 ye şeklinde
            System.out.println("---------");
            for(int j=0;j<=2;j++){   //Buradaki j nin amacı 2.sorgu yani 2.slota geçtiğinde baştan sıfırdan başla demek istiyor
               System.out.println(Sehirler [i][j]); //Burda Sehirler stringleri + 1. for daki i = ilk slot okuyup J ile 2. sorguyu yazıyor.
            }
        }

    }
}