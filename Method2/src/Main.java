public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj =sehirVer();
        System.out.println(yeniMesaj);
        int sayi=topla2(5,7,5,7,2,8);
        System.out.println(sayi);

    }
                  // sadece bir işi yapan methodlardır, yani geri çıktı vermez
    public static void ekle(){
        System.out.println("Eklendi");

    }
    public static void sil(){
        System.out.println("Silindi");

    }
    public static void guncelle(){
        System.out.println("Güncellendi");

    }

    public static int topla(int sayi1,int sayi2) {
        return sayi1+sayi2;
    }
    //Variable arguments ile çalışmak, yani metoda istediğimiz kadar sayı gönderebiliriz
    public static  int topla2(int... sayilar){
        int toplam = 0;
        for(int sayi:sayilar){
            toplam+=sayi;
        }
       return toplam;
    }
    public  static  String sehirVer(){
         return "Ankara";
    }



}