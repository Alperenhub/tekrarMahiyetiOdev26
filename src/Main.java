public class Main {
    public static void main(String[] args) {
    String mesaj = "Bugün hava çok güzel";
    String yeniMesaj = mesaj.substring(0,2);
    System.out.println(yeniMesaj);
    int toplam = topla2(4,5,6,7);


    }

    public static void ekle(){
        System.out.println("Eklendi");
    }
    public static void sil(){
        System.out.println("Silindi");
    }
    public static void guncelle(){
        System.out.println("Güncellendi");
    }
    public static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }
    public static int topla2(int... sayilar){
        int toplam=0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }
        return toplam;

    }
}