public class Main {
    public static void main(String[] args) {
        System.out.println("Домашняя работа 2_2 ПЕРЕМЕННЫЕ ");
        //Задание 1
        // Объявите переменные типа int, byte, short, long, float, double.
        // Название переменных может быть любым, но если состоит из двух слов и более,
        // должно придерживаться правила camelCase.
        // Выведите в консоль значение каждой переменной в формате
        // "Значение переменной … с типом … равно …"

        int billion = 1000000000;
        byte hundred = 100;
        short thousand = 30000;
        long trillion = 4000000000L;
        float smallDecimal =-0.1f;
        double bigDecimal = 0.6666666;
        System.out.println("Задание 1 ");
        System.out.println("Значение переменной billion с типом int равно " + billion);
        System.out.println("Значение переменной hundred с типом byte равно " + hundred);
        System.out.println("Значение переменной thousand с типом short равно " + thousand);
        System.out.println("Значение переменной trillion с типом int равно " + trillion);
        System.out.println("Значение переменной smallDecimal с типом float равно " + smallDecimal);
        System.out.println("Значение переменной bigDecimal с типом double равно " + bigDecimal);
        System.out.println(" ");


        //Задание 2
        //27.12 ,  987 678 965 549 , 2.786 , false, 569 , -159 , 27897 , 67
        //Объявите переменные всех типов, присвойте им любые значения (инициализируйте их).

        float numF = 27.12f;
        long numl = 987678965549L;
        byte numBt = 67;
        boolean numBl=false;
        char sumbol=569;
        short numSh = -159;
        int numIt = 27897;
        double numDbl=2.786;


        //Задание 3
        //Трое школьных учителей, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        //У Людмилы Павловны 23 ученика , у Анны Сергеевны 27 учеников и у Екатерины Андреевны – 30 учеников.
        //Три учительницы закупили все вместе 480 листов бумаги на все три класса.
        // Посчитайте, сколько достанется листов каждому ученику.
        //Результат задачи выведите в консоль в формате "На каждого ученика рассчитано … листов бумаги".
        byte teacherLP = 23;
        byte teacherAS = 27;
        byte teacherEA = 30;
        short sumList = 480;
        short sumChild= (short) (teacherEA+teacherAS+teacherLP);
        short listChild= (short) (sumList/sumChild);
        System.out.println("Задание 3 ");
        System.out.println("На каждого ученика рассчитано "+ listChild+ " листов бумаги..." );
        System.out.println(" ");

        //Задание 4
        // Производительность машины для изготовления бутылок - 16 бутылок за 2 минуты. Какая производительность машины будет:
        //
        //за 20 минут
        //в сутки
        //за 3 дня
        //за 1 месяц
        //Рассчитывайте продолжительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
        //
        //Результаты подсчетов выведите в консоль в формате "За … машины произвела бутылок … штук "
        System.out.println("Задание 4 ");
        byte min2 = 16;
        short min20 = (short) (20*min2);
        System.out.println("За 20 минут машины произвела бутылок "+min20+" штук");
        short dayMin=24*60;
        short day1= (short) (dayMin*min2);
        System.out.println("За 1 сутки машины произвела бутылок "+day1+" штук");
        int day3=dayMin*3*60*min2;
        System.out.println("За 3 дня машины произвела бутылок "+day3+" штук");
        int day28=dayMin*28*60*min2;
        System.out.println("За месяц состоящий из 28 дней машины произвела бутылок "+day28 +" штук");
        int day29=dayMin*29*60*min2;
        System.out.println("За месяц состоящий из 29 дней машины произвела бутылок "+day29 +" штук");
        int day30=dayMin*30*60*min2;
        System.out.println("За месяц состоящий из 30 дней машины произвела бутылок "+day30 +" штук");
        int day31=dayMin*31*60*min2;
        System.out.println("За месяц состоящий из 31 дня машины произвела бутылок "+day31 +" штук");
        System.out.println(" ");

        //Задача 5.
        //На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        // На один класс уходит 2 банки белой и 4 банки коричневой краски.
        // Сколько банок каждой краски было куплено?
        //
        //Выведите результат задачи в консоль в формате
        // "В школе, где … классов, нужно … банок белой краски и … банок коричневой краски".
        System.out.println("Задание 5 ");
        byte scoolRoom=120;
        byte wait=2;
        byte broun=4;
        byte room1= (byte) (wait+broun);
        byte totalRoom= (byte) (scoolRoom/room1);
        byte sumWait= (byte) (totalRoom*wait);
        byte sumBraun= (byte) (totalRoom*broun);
        System.out.println("В школе, где "+totalRoom+" классов, нужно "+sumWait+" банок белой краски и "+sumBraun+" банок коричневой краски");
        System.out.println("");

        //Задача 6.
        //Повар, когда готовит еду, взвешивает все продукты, чтобы добиться нужной консистенции.
        //То же делают и спортсмены, которые сидят на правильном питании и тщательно относятся к тому,
        // что и сколько они едят.
        //Вот один из рецептов, который использует наш спортсмен перед тренировкой:
        //Бананы – 5 штук (1 банан - 80 грамм);
        //Молоко – 200 мл (100 мл = 105 грамм);
        //Мороженое пломбир – 2 брикета по 100 грамм;
        //Яйца сырые – 4 яйца (1 яйцо - 70 грамм).
        //Смешать всё в блендере и готово.
        //Подсчитайте вес (количество грамм) такого спорт-завтрака, а затем переведите его в килограммы.
        //Результат напечатайте в консоль.
        //Важное условие: если в рецепт нужно добавить несколько единиц какого-то продукта (с определенным весом),
        // то нужно умножать количество единиц на вес в граммах.
        // Например, если в рецепте указано, что нужно добавить 5 бананов по 80 грамм,
        // то нужно количество (5 бананов) умножить на вес одного (80 грамм), а не считать самому общую сумму грамм.

        System.out.println("Задание 6 ");
        byte bananaWeight=80;
        byte bananaPieces=5;
        byte milkWeight=105;
        byte milkPieces=2;
        byte iceCreamWeight=100;
        byte iceCreamPieces=2;
        byte eggWeight=70;
        byte eggPieces=4;
        short totalBananaWeight= (short) (bananaWeight*bananaPieces);
        short totalMilkWeight= (short) (milkWeight*milkPieces);
        short totalIceCreamWeight= (short) (iceCreamWeight*iceCreamPieces);
        short totalEggWeight= (short) (eggWeight*eggPieces);
        short weingBreakfastGR= (short) (totalBananaWeight+totalEggWeight+totalMilkWeight+totalIceCreamWeight);
        System.out.println("Вес такого спорт-завтрака = "+weingBreakfastGR+" грамм.");
        float weingBreakfastKG = (short) weingBreakfastGR/1000f;
        System.out.println("Вес такого спорт-завтрака "+weingBreakfastKG+" килограмм.");
        System.out.println("");

        System.out.println("Задание 7 ");
        System.out.println("");
        System.out.println("Задание 8 ");
        System.out.println("");
    }
}