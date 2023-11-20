public class Main {
    public static void main(String[] args) {
        //задача1
        System.out.println("задача №1.");
        int age = 14;
        if (age <= 18) {
            System.out.println("Еще рано, нужно подождать 18 лет.");
        }

        //задача2
        System.out.println("задача №2.");
        int temp = 10;
        if (temp <= 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        if (temp >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        //задача3
        System.out.println("задача №3.");
        int speed = 70;
        if (speed <= 60) {
            System.out.println("если скорость " + speed + " км/ч, то можно ездить спокойно.");
        }
        if (speed > 60) {
            System.out.println("если скорость " + speed + " км/ч, то придется заплатить штраф");
        }

        //задача4
        System.out.println("задача №4.");
        int age1 = 65;
        if (age1 >= 2 && age1 <=6) {
            System.out.println("тебе в детский сад.");
        }
        else if (age1 >= 7 && age1 <=18) {
            System.out.println("тебе в школу.");
        }
        else if (age1 > 18 && age1 <=24) {
            System.out.println("тебе пора в колледж.");
        }
        else if (age1 > 24 && age1 <=60) {
            System.out.println("тебе на работу.");
        }
        else if (age1 < 2) {
            System.out.println("тебе рано еще в детский сад");
        }
        else if (age1 >= 60) {
            System.out.println("тебе пора отдохнуть на пенсии");
        }

        //Задача5
        System.out.println("задача №5.");
        int age2 = 8;
        if (age2 < 5) {
            System.out.println("тебе нельзя на атракцион.");
        }
        else if (age2 >= 5 || age2 <=14) {
            System.out.println("только в сопровождении взрослого.");
        }
        else if (age2 > 14) {
            System.out.println("Доброго пути!!!");
        }

        //задача6
        System.out.println("задача №6.");
        short human = 147;
        byte totalplace = 102;
        byte seatplace = 60;
        if (human <= seatplace) {
            System.out.println("все " + human + " человек сидят");
        }
        if (human > seatplace && human <= totalplace) {
            int standingroom = human % seatplace;
            System.out.println(seatplace + " человек сидят, " + standingroom + " человек стоят.");
        }
        if (human > totalplace) {
            int standingroom = totalplace % seatplace;
            int rem = human % totalplace;
            System.out.println(seatplace + " человек сидят, " + standingroom +
                    " человек стоят, а " + rem + " человек не влезло");
        }


        //задача7
        System.out.println("задача №7");
        int one;
        int two;
        int three;
        int max;
        one = 145;
        two = 236;
        three = 222;
        max = one;
        if (max < two) {
            max = two;}
            else if (max < three) {
                max = three;
            }
        if (max < three) {
            max = three;
        }
        System.out.println("максимальным числом из " + one + ", " + two + ", " + three +
                " является " + max);
    }
}