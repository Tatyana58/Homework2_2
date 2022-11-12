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
        long trillion = 400L;
        float smallDecimal =-0.1f;
        double bigDecimal = 0.6666666;
        System.out.println("Значение переменной billion с типом int равно " + billion);
        System.out.println("Значение переменной hundred с типом byte равно " + hundred);
        System.out.println("Значение переменной thousand с типом short равно " + thousand);
        System.out.println("Значение переменной trillion с типом int равно " + trillion);
        System.out.println("Значение переменной smallDecimal с типом float равно " + smallDecimal);
        System.out.println("Значение переменной bigDecimal с типом double равно " + bigDecimal);

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
        int teacherLP = 23;
        int teacherAS = 27;
        int teacherEA = 30;
        int sumList = 480;
        int sumChild=teacherEA+teacherAS+teacherLP;
        int listChild=sumList/sumChild;
        System.out.println("На каждого ученика рассчитано "+ listChild+ " листов бумаги..." );

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

        byte min2 = 16;
        int min20 = 20*min2;
        System.out.println("За 20 минут машины произвела бутылок "+min20+" штук");
        int dayMin=24*60;
        int day1=dayMin*min2;
        System.out.println("За сутки машины произвела бутылок "+day1+" штук");
        int day3=dayMin*3*60;
        System.out.println("За 3 дня машины произвела бутылок "+day3+" штук");
        int day28=dayMin*28*60*min2;
        System.out.println("За месяц состоящий из 28 дней машины произвела бутылок "+day28 +" штук");
        int day29=dayMin*29*60*min2;
        System.out.println("За месяц состоящий из 29 дней машины произвела бутылок "+day29 +" штук");
        int day30=dayMin*30*60*min2;
        System.out.println("За месяц состоящий из 30 дней машины произвела бутылок "+day30 +" штук");
        int day31=dayMin*31*60*min2;
        System.out.println("За месяц состоящий из 31 дня машины произвела бутылок "+day31 +" штук");

        //Задача 5.
        //На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
        // На один класс уходит 2 банки белой и 4 банки коричневой краски.
        // Сколько банок каждой краски было куплено?
        //
        //Выведите результат задачи в консоль в формате
        // "В школе, где … классов, нужно … банок белой краски и … банок коричневой краски".


    }
}