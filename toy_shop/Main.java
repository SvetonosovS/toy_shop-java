package toy_shop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Raffle r = new Raffle();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("""
                    Menu:
                    1 - Добавьте новую игрушку в призовой фонд
                    2 - Изменить частоту выпадения какой-либо игрушки
                    3 - Проведите розыгрыш и сохраните результаты
                    0 - EXIT
                    >\s""");
            var selection = in.next();
            switch (selection) {
                case "1" -> r.addToy();
                case "2" -> r.setFrequency();
                case "3" -> r.raffle();
                case "0" -> {
                    System.out.println("Программа не активна");
                    System.exit(0);
                }
                default -> System.out.println("Неправильный ввод. Попробуйте еще раз.");
            }
        } 
    } 
}