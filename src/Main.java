import java.util.regex.MatchResult;

public class Main {
    public static void main(String[] args) {


        // Блок 1: Задание 1:

        System.out.println("Задание 1");
        int lad = 15_000; // Ежемесячное пополнение
        int Summa = 0; // Сумма накоплений
        int Month = 0; // Месяц
        while (Summa < 2_459_000) {
            Month++;
            Summa = Summa + (Summa / 100) + lad;
            System.out.println(Summa + " руб.");
            System.out.println("Месяц" + " " + Month + " " + "сумма накоплений равна" + " " + Summa + "рублей");
            System.out.println("============================================================================");
        }
        // Задание 2
        System.out.println(" Задание 2");

        byte i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
            System.out.println(" \n " + "========================================");
        }
        for (; i >= 1; i--) {
            System.out.print(i + " ");
            System.out.println("\n " + "=======================================");


            // Задание 3
        }
        System.out.println("Задание");

        int Y = 12000000; // Население
        int perYear = 17;  // 17 челове на 1000
        byte dying = 8;  // 8 человек на 1000
        int Y_perYear_dying = perYear - dying * Y / 1000;
        for (int j = 1; j <= 10; j++) {
            Y = Y + Y_perYear_dying;
            System.out.println("Год " + " " + j + " " + ". Численность населения составляет " + "" + Y + "" + " человек.");


        }


        // Напишите программу, которая выводит в консоль сумму накоплений.

        //   Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется ещё 7%.

        // Первоначальная сумма вклада Василия составляет 15 тысяч рублей.

        //  Задание 1
        //  Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму
        //  в 12 миллионов рублей при условии, что процент банка от накоплений не меняется, а всегда равен 7%.
        //   Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.


        // Блок 2 Звдвние 1

        double Schet = 15000;
        int month = 1;
        while (Schet <= 12000000) {


            Schet = Schet + Schet * 0.07;
            Schet = Math.round(Schet * 100.0) / 100.0;
            System.out.println("Сумма накоплений " + Schet + " руб. Месяц " + month);
            month++;

            System.out.println(" ===========================================================");


            // Блок 2 Задание 2


            double Schet_2 = 15_000;
            int month_2 = 0;
            while (Schet_2 <= 12000000) {
                month_2++;
                Schet_2 = Schet_2 + Schet_2 * 0.07;
                Schet_2 = Math.round(Schet_2 * 100.0) / 100.0;
                if (month_2 % 6 == 0) {
                    System.out.println("Сумма накоплений " + Schet_2 + " руб. Месяц " + month_2);

                    System.out.println("================================================================");


                }
                // Задание 3
                System.out.println(" Задание 3");

                double Schet_3 = 15_000; // Cумма на счёте в банке;
                int month_3 = 1;
                while (month_3 <= 108) {
                    Schet_3 = Schet_3 + Schet_3 * 0.07;
                    Schet_3 = Math.round(Schet_3 * 100.0) / 100.0;
                    if (month_3 % 6 == 0) {
                        System.out.println("Сумма накоплений " + Schet_3 + " руб. Месяц " + month_3);
                    }
                    month_3++;


                }

                // Блок 2 Задание 4

                System.out.println("Задание 4");

                int Friday = 6;
                for (; Friday < 31; Friday = Friday + 7) {
                    System.out.println("Сегодня пятница, " + Friday + "-е число. Необходимо поготовить отчёт.");

                    System.out.println("=======================================================");
                    // Блок 3 Задание 1
                    System.out.println("Задание 1");


                    int cometFliesBy = 79;
                    int OurYear = 2022;
                    for (; cometFliesBy <= 2132; cometFliesBy = cometFliesBy + 79) {
                        if (cometFliesBy > 1817 && cometFliesBy <= OurYear) {
                            System.out.println(cometFliesBy + "год. Пролетела комета");
                        }
                        if (cometFliesBy > OurYear && cometFliesBy <= 2132) {
                            System.out.println(cometFliesBy + "год. Ещё разок залетит");

                            System.out.println("=======================================================");


                            // Задание 2
                            System.out.println(" Задание 2");

                            for (int a = 1; a <= 10; a++) {
                                System.out.println("2 * " + a + " = " + a * 2);

                                System.out.println("======================================");
                            }
                        }

                    }
                }

            }
        }
    }
}