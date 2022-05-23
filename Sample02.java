public class Sample02 {
    public static void main(String[] args) {

        int firstNumber;
        firstNumber = 43;

        int secondNumber = 34;

        System.out.println(addition(firstNumber, secondNumber));
        finish();
    }

    public static int addition(int first, int second){
        int result = first + second;
        return result;
    }

    public static void finish(){
        System.out.println("process completed..");
    }

}
// Bir variable ismi ilk defa yazıldığında, isminden önce veri türü yazılmalıdır.
// 4. satır: firstNumber ilk defa kullandığı için önce veri türü int yazıldı. (int, tam sayı veri türüdür)
// 4. ve 5. satır: variable'ın ilk değer ataması, ilk kullanımında yapılabileceği gibi daha sonra da yapılabilir.
// 7. satırda: secondNumber ilk defa kullanıldığı için veri türü yazılmış ve aynı anda değer ataması da gerçekleşmiş.
// 2. satırda { işaretiyle başlayan kapsam, 11. satırda } işaretiyle bitmiştir.
// Variable'lar tanımlandıkları kapsam dışında geçersizdir.
// Bu sebeple 13. satırdaki metoda firstNumber ve secondNumber, metot çağrılırken argüman olarak gönderilmelidir.
// 9. satır: addition(firstNumber, secondNumber) ifadesi bir metodun argümanlı şekilde çağrılmasıdır.
// metotlar argümanlı ve argümansız olabilir. addition() şeklinde tanımlansaydı, argümansız çağrılabilirdi.
// finish() argümansız çalışan bir metot olduğu için, 10. satırda finish() şeklinde çalıştırılabilmiştir.
// 13. satırda static'ten sonraki "int" ile 18. satırdaki "void" metodun geriye döndüreceği değerin veri türüdür.
// addition metodu çalışırsa geriye dönen değer int türünde, finish çalışırsa void yani geriye değer dönmeyecek demektir.
// Bu sebeple addition() metodunun içinde return anahtar kelimesi varken, finish() metodunda return yoktur.
// 9. satırdan 13. satıra variable'lar gönderilirken, firstNumber first'e, secondNumber ise second'a aktarılarak addition() içinde işleme girmiştir.
// 9. satırdaki System.out.println() içindeki addition(firstNumber, secondNumber) ifadesini 15. satırdaki "result" doldurmaktadır.
