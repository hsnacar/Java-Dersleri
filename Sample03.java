import java.util.Scanner;

public class Sample03 {
    public static void main(String[] args) {

        System.out.println("Please input your age:");

        Scanner inputForumUser = new Scanner(System.in);

        int myAge = inputForumUser.nextInt();

        Human person = new Human();

        String myLifeStage = person.lifeStages(Math.abs(myAge));
        System.out.println("You are a " + myLifeStage);
    }

    public static class Human {
        public String lifeStages(int age) {
            return (age < 2) ? "baby"
                    : (age > 1 && age < 4) ? "toddler (childhood)"
                    : (age > 3 && age < 6) ? "preschooler (childhood)"
                    : (age > 5 && age < 13) ? "primary school (childhood)"
                    : (age > 12 && age < 20) ? "teenager"
                    : (age > 19 && age < 37) ? "young adult person"
                    : (age > 36 && age < 56) ? "adult person"
                    : (age > 55 && age < 66) ? "older adult person"
                    : "old person";
        }
    }
}

// Bu örnekte ele alınan konular: iç içe Class kullanımı, Scanner, Object create, ternary-nested
// 8. ve 12. satırlarda bir class'tan objenin (nesnenin) türetilmesini örnekledik. Kalıp şu şekilde: ClassAdi objeAdi = new ClassKurucuMetodu();
// Klavyeden bilgi giriş almak için Scanner sınıfını kullandık. 8. satırda inputForumUser nesnesi bu sınıfı kullanmak için türetildi.
// 10 satırda: myAge variable'ı inputForumUser nesnesinin nextInt() metodundan dönecek veriye eşitlendi.
// 12. satırda: Sample03 class'ının nested (iç) class'ı olan Human'dan person adında bir nesne türettik.
// 14. satırda: person nesnesinin metodu olan lifeStages'e kullancının girdiği (myAge'e eşitlediğimiz) yaşı gönderdik ve geri dönen veriyi myLifeStage'e eşitledik.
// myLifeStage'ın içini lifeStages() metodu doldurdu.
// En son ekrana girilen yaşa göre yaşam evresi yazdırıldı.
// 14. satırda: abs(), negatif girilebilecek sayının mutlak değerini alan Math sınıfına ait bir metodtur.
/* 20-28 satırlar arasında ternary kullanımı örneklendirildi.
    ternary syntax'ı şu şekildedir: (koşul) ? koşul true ise yapılacaklar : koşul false ise yapılacaklar
    örneğimizde age kontrol edilerek hangi koşul true ise, return ile geriye soru işaretinden sonraki "" içindeki ifade döndürülmektedir.
    buradaki ternary, if-else if-else kullanımının karşılığıdır.
    20. satır if
    28. satır else
    21-27 aralığındaki satırlar else if
 */