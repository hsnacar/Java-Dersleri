public class Sample01 {
    // main metot programın başlangıç noktasıdır
    /*
        public, bir erişim belirtecidir.
        main metodunun kullanımının herkese açık olduğunu ifade eder.
     */
    /*
        static, Class'tan bir nesne oluşturmaya gerek kalmadan
        hafızada yer ayırlamasını sağlar.
     */
    // void, geriye bir değer döndürülmediğini ifade eder
    /*
        Aşağıdaki metot, herkesin kullanımına açık, nesne oluşturulmaya gerek
        kalmadan hafızaya yüklenen ve geriye değer döndürmeyen bir metottur.
        Metodun ismi "main"dir.
     */
    // String[] args, metodun aldığı parametredir.
    // Class isimleri büyük harfle başlar ve dosya adı ile Class adı aynı olmalıdır
    // metot isimleri küçük harfle başlar ve metodun isminden sonra () vardır.
    // variable isimleri küçük harfle başlar

    public static void main(String[] args) {
        String url = "www.amazon.com";
        System.out.println(url);
    }
}
    // url, bir variable adıdır. String, url'nin veri türüdür.
    // System.out.println(url), ifadesi consola url'nin değerini çıktı olarak verir.

    // Java programında { işareti kapsamın başladığını gösterir, } işareti ise bittiğini.
    // Bu sebeple { işaretinden kaç tane varsa } işaretinden de o sayıda bulunur.
    // Java dosyaları src klasörünün içinde olmalıdır.