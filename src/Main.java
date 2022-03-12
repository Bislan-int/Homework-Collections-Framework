import java.util.*;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> map = new TreeMap<>();

        System.out.print("Введите число участников которых вы хотите зарегистрировать: ");
        int nums = scanner.nextInt();
        System.out.println("Если хотите завершить процесс досрочно, введите букву -W- в поле -имя-");
        scanner.nextLine();

        for (int i = 1; i <= nums; i++) {
            System.out.println("Данные №" + i);
            System.out.print("Введите имя: ");
            String name = scanner.nextLine();
            if (name.equals("w") || name.equals("W")) {
                System.out.println("Процесс завершон. Данных введено " + (i - 1));
                break;
            }
            System.out.print("Введите год рождения: ");
            int yer = scanner.nextInt();
            scanner.nextLine();
            if (yer < 1900 || yer > calendar.get(Calendar.YEAR)) {
                System.out.println("Некоректный ввод!");
                break;
            }
            map.putIfAbsent(yer, name);
        }
        System.out.println("\nГод - Имя\n------------");
        for (Integer s : map.keySet()) {
            System.out.println(s + " - " + map.get(s));
        }
    }
}