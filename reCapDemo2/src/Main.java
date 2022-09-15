public class Main {
    public static void main(String[] args) {
        double[] myList = {1.2, 6.3, 4.3, 5.6}; //new yapmadan aynı işlemi yapıyor otomatik oluşturuyor.
        double total = 0;   //0 Başlangıç değeri boş default tanımlıyoruz.
        double max = myList[0]; //mylist 0. elemanını en büyük sayı seçtik . Max isim sadece
        for (double number : myList) {
            if (max < number) {  //Eğer max numaradan küçükse
                max = number;  //max = numara oluyor.

            }
            total = total + number;  //Yukardaki 0 değeri tanımlanan totali + number:Mylist yaptığımız kısmı topluyor.
            System.out.println(number); //Sayıları yazdırmak için number
        }
        System.out.println("Toplam =" + total);
        //total + number deki toplamayı yapıp sonucu çıkarıyor.
        System.out.println("En Büyük =" + max); //Aynı şekilde print olarak + max dedik böylece en büyük sayıyı verdi.

    }
}