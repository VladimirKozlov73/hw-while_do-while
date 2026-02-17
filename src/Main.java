public class Main {
    public static void main(String[] args) {
        /* Задание 1
         Скрипт, который определяет все пятницы в месяце и выводит напоминание о сдаче еженедельного отчета.
         */
        int firstFriday = 2;

        for (int date = 1; date <= 31; date++) {
            if (date >= firstFriday && (date - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет.");
            }
        }
        System.out.println();

        /* Задание 2
         программа для отслеживания дистанции на марафоне, которая каждые 500 метров от старта и до самого финиша
         выводит мотивационные сообщения.
         */
        int distance = 42195;
        int step = 500;

        //Первая версия программы с циклом do-while
        int distanceTraveled = 0;

        do {
            System.out.println("Держитесь! Осталось " + (distance - distanceTraveled) + " метров");
            distanceTraveled += step;
        } while (distanceTraveled < distance);
        System.out.println();

        //Вторая версия программы с циклом for
        distanceTraveled = 0;

        for (; distanceTraveled < distance; distanceTraveled += step) {
            System.out.println("Держитесь! Осталось " + (distance - distanceTraveled) + " метров");
        }
        System.out.println();

       /* Задание 3
         Модуль предварительного расчета стоимости парковки, в соответствии с бюджетом, с учетом того, что каждый пятый
         день парковка бесплатная.
        */
        int dailyPayment = 100;

        //Первый вариант с циклом do-while
        int budget = 2275;
        int dayCounter = 1;

        do {
            if (dayCounter % 5 == 0) {
                dayCounter++;
                continue;
            }
            budget -= dailyPayment;
            dayCounter++;
        } while (budget - dailyPayment >= dailyPayment);
        System.out.println("Автомобиль можно оставить на " + dayCounter + " дней.");
        System.out.println("--------");

        //Второй вариант с циклом for
        budget = 2275;
        dayCounter = 1;

        for (; budget - dailyPayment >= dailyPayment; dayCounter++){
            if (dayCounter % 5 == 0) continue;
            budget -= dailyPayment;
        }
        System.out.println("Автомобиль можно оставить на " + dayCounter + " дней!");
        System.out.println();

        /* Задание 4
         Рассчитать, сколько месяцев понадобится пользователю, чтобы накопить 12 000 000 ₽. Пользователь ежемесячно
         добавляет по 15 000 ₽, и каждые полгода банк начисляет 7% от суммы накоплений. Условия не меняются в течение
         всего срока.
        */

        int month = 0;
        int total = 0;

        do {
            month++;

            if (month % 6 == 0) {
                total += total * 7 / 100;
            }

            total += 15000;
            System.out.println(month + "-й месяц: " + total + " ₽");

            if (total >= 12000000L) break;
        } while (true);
        System.out.println();

        /* Задание 5
         умная зарядка, которая экономит ресурс аккумулятора и предотвращает сильный перегрев:
            Устройство заряжается на 2% каждую минуту.
            Каждые 10 минут, когда устройство перегревается, зарядка прерывается на 2 минуты.
            После трех таких перегревов зарядка прекращается и выводится сообщение
                «Зарядка прекращена. Текущий заряд: ...%».
            В конце зарядки выводится общее время, потраченное на процесс.
        */

        int charge = 20;
        int minute = 0;
        int overheats = 0;

        while (charge < 100) {
            minute++;

            if (minute % 10 == 0) {
                overheats++;

                if (overheats > 3) {
                    System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                    break;
                }

                minute += 2;
                continue;
            }

            charge += 2;
            if (charge > 100) charge = 100;
        }

        System.out.println("Время зарядки составило " + minute + " минут");
    }
}