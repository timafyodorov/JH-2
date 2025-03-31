public class Main {
    public static void main(String[] args) {

        int[] costs = {156544, 2343, 65434, 239234, 43234};
        int sum = 0;
        for (int n = 0; n < costs.length; n++) {
            sum += costs[n];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        int[] weekCosts = {15435, 65843, 634, 2234, 46534};
        int min = weekCosts[0];
        int max = weekCosts[0];
        for (int k = 1; k < weekCosts.length; k++) {
            if (weekCosts[k] < min) {
                min = weekCosts[k];
            }
            if (weekCosts[k] > max) {
                max = weekCosts[k];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min +
                " рублей. Максимальная сумма трат за неделю составила " + max + " рублей");

        int[] monthCosts = {24214, 8534, 2674987, 546754, 6556};
        int total = 0;
        for (int m = 0; m < monthCosts.length; m++) {
            total += monthCosts[m];
        }
        int avg = total / monthCosts.length;
        System.out.println("Средняя сумма трат за месяц составила " + avg + " рублей");

        char[] name = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int j = name.length - 1; j >= 0; j--) {
            System.out.print(name[j]);
        }
    }
}