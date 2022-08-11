import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // task 1, куда мыслить дальше, застрял. Циклы дались тяжело!!!
        // почему в первой строке все норм, а во второй какая-то дичь, почему счёт идёт с 11???
        // по ходу разобрался методом тыка, но мне кажется сложновато уже, учитывайте, что много новичков, делайте уроки
        // подробнее, расписывайте вкладку шпаргалка, инфы мало!!!
        int i = 1;

        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        // task 2 Подсмотрел решение преподавателя. Не понятен принцип. Незачёт)
        int firstFridayDate = 5;

        for (int currentFriday = firstFridayDate; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница, " + currentFriday + "-е число. Необходимо подготовить отчет.");
        }

        // task 3
        // Вообще не понял условия, с чего начинать. Про методы LocalDate & get Year не слышал.
        // Как мне решать похожим образом?
        int currentYear = LocalDate.now().getYear();
        int lastAppearanceYear = 0;
        for (int year = 0; year <= currentYear + 100; year += 79) {
            lastAppearanceYear = year;
        }
        int previousAppearanceYear = 0;
        for (int year = 0; year < currentYear - 200; year += 79) {
            previousAppearanceYear = year;
        }

        // Вывести ниже все появления комет за предыдущие 200 лет + след. появление кометы
        for (int year = previousAppearanceYear; year <= lastAppearanceYear; year += 79) {
            System.out.println(year);
        }


    }
}