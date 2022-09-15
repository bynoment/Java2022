public class Main {
    public static void main(String[] args) {
        char grade = 'F';

        switch (grade) {
            case 'A':
                System.out.println("Sınıfı geçtin aferin");
                break;
            case 'B':
                System.out.println("İyi bir not");
                break;
            case 'C':
                System.out.println("Fena değil");
                break;
            case 'D':
                System.out.println("Kalıyodun az daha");
                break;
            case 'F':
                System.out.println("Malesef kaldın");
                break;
            default:
                System.out.println("Geçersiz not girildi Girilebilecekler A-B-C-D-F");
        }
    }
}