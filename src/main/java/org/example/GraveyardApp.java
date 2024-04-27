import java.util.Scanner;

public class GraveyardApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FlowerSelection flowerSelection = new FlowerSelection();
        CoffinSelection coffinSelection = new CoffinSelection();
        BurialSelection burialSelection = new BurialSelection();
        Farewell farewell = new Farewell();
        DateInput dateInput = new DateInput();
        CorpseInput corpseInput = new CorpseInput();
        GraveDepthInput graveDepthInput = new GraveDepthInput();
        Mourning mourning = new Mourning();
        Resurrection resurrection = new Resurrection();
        PsychicInvitation psychicInvitation = new PsychicInvitation();

        flowerSelection.selectFlowers(scanner);
        coffinSelection.selectCoffin(scanner);
        burialSelection.selectBurialPlace(scanner);
        farewell.bidFarewell(scanner);
        dateInput.inputDate(scanner);
        corpseInput.inputNumberOfCorpses(scanner);
        graveDepthInput.inputGraveDepth(scanner);
        mourning.mourn(scanner);
        resurrection.resurrect(scanner);
        psychicInvitation.invitePsychic(scanner);

        scanner.close();
    }
}

class FlowerSelection {
    public void selectFlowers(Scanner scanner) {
        int choice;
        do {
            System.out.println("Какой букет Вы возьмёте на похороны?:");
            System.out.println("1. Цветы, которые Вы принесли с собой");
            System.out.println("2. Цветы купленные у нас");
            while (!scanner.hasNextInt()) {
                System.out.println("Некорректный ввод. Введите цифру 1 или 2.");
                scanner.next(); // очистка буфера
            }
            choice = scanner.nextInt();

            if (choice != 1 && choice != 2) {
                System.out.println("Извините, но такого выбора нет в списке");
            }
        } while (choice != 1 && choice != 2);

        if (choice == 1) {
            System.out.println("Вы взяли цветы, которые принесли с собой");
        } else if (choice == 2) {
            System.out.println("Вы приобрели цветы для похорон у нас");
        }
    }
}

class CoffinSelection {
    public void selectCoffin(Scanner scanner) {
        int choice;
        do {
            System.out.println("Выберите гроб: ");
            System.out.println("1. Обычный");
            System.out.println("2. Hello Kitty");
            System.out.println("3. Лучше кремация!");
            while (!scanner.hasNextInt()) {
                System.out.println("Некорректный ввод. Введите цифру 1, 2 или 3.");
                scanner.next(); // очистка буфера
            }
            choice = scanner.nextInt();

            if (choice < 1 || choice > 3) {
                System.out.println("Извините, но такого выбора нет в списке");
            }
        } while (choice < 1 || choice > 3);

        switch (choice) {
            case 1:
                System.out.println("Вы выбрали обычный гроб");
                break;
            case 2:
                System.out.println("Вы выбрали гроб Hello Kitty");
                break;
            case 3:
                System.out.println("Как жестоко... Вы решили кремировать человека");
                break;
        }
    }
}

class BurialSelection {
    public void selectBurialPlace(Scanner scanner) {
        int choice;
        do {
            System.out.println("Выберите место захоронения: ");
            System.out.println("1. Возле семейного кладбища");
            System.out.println("2. На общем кладбище");
            System.out.println("3. Я же сказал кремация, поэтому заберу собой прах в вазе");
            while (!scanner.hasNextInt()) {
                System.out.println("Некорректный ввод. Введите цифру 1, 2 или 3.");
                scanner.next(); // очистка буфера
            }
            choice = scanner.nextInt();

            if (choice < 1 || choice > 3) {
                System.out.println("Извините, но такого выбора нет в списке");
            }
        } while (choice < 1 || choice > 3);

        switch (choice) {
            case 1:
                System.out.println("Вы решили похоронить человека возле семейного кладбища");
                break;
            case 2:
                System.out.println("Вы решили похоронить человека на общем кладбище");
                break;
            case 3:
                System.out.println("Вы забрали собой прах покойного");
                break;
        }
    }
}

class Farewell {
    public void bidFarewell(Scanner scanner) {
        int choice;
        do {
            System.out.println("Как Вы будете прощаться с покойником: ");
            System.out.println("1. Скажу добрые слова перед захоронением");
            System.out.println("2. Буду читать молитву");
            System.out.println("3. Скажу, что он так и невернул мне деньги, которые брал в долг");
            while (!scanner.hasNextInt()) {
                System.out.println("Некорректный ввод. Введите цифру 1, 2 или 3.");
                scanner.next(); // очистка буфера
            }
            choice = scanner.nextInt();

            if (choice < 1 || choice > 3) {
                System.out.println("Извините, но такого выбора нет в списке");
            }
        } while (choice < 1 || choice > 3);

        switch (choice) {
            case 1:
                System.out.println("Вы сказали добрые слова на последок");
                break;
            case 2:
                System.out.println("Вы прочитали молитву");
                break;
            case 3:
                System.out.println("Жаль, но деньги Вы уже не получите");
                break;
        }
    }
}

class DateInput {
    public void inputDate(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Введите дату (ГГГГ ММ ДД): ");
        String dateString = scanner.nextLine();

        String[] dateParts = dateString.split(" ");

        System.out.println("Вы ввели дату: " + dateParts[0] + " " + dateParts[1] + " " + dateParts[2]);
    }
}

class CorpseInput {
    public void inputNumberOfCorpses(Scanner scanner) {
        int numberOfCorpses;
        do {
            System.out.println("Введите количество трупов для хоронения:");
            while (!scanner.hasNextInt()) {
                System.out.println("Некорректный ввод. Введите целое число.");
                scanner.next(); // очистка буфера
            }
            numberOfCorpses = scanner.nextInt();

            if (numberOfCorpses <= 0) {
                System.out.println("Некорректный ввод. Введите положительное число.");
            }
        } while (numberOfCorpses <= 0);

        System.out.println("Количество трупов для хоронения: " + numberOfCorpses);
    }
}

class GraveDepthInput {
    public void inputGraveDepth(Scanner scanner) {
        int depth;
        do {
            System.out.println("Введите глубину могилы в метрах:");
            while (!scanner.hasNextInt()) {
                System.out.println("Некорректный ввод. Введите целое число.");
                scanner.next(); // очистка буфера
            }
            depth = scanner.nextInt();

            if (depth <= 0) {
                System.out.println("Некорректный ввод. Введите положительное число.");
            }
        } while (depth <= 0);

        System.out.println("Глубина могилы составляет " + depth + " метров.");
    }
}

class Mourning {
    public void mourn(Scanner scanner) {
        scanner.nextLine();
        System.out.println("Введите имя ушедшего: ");
        String deceasedName = scanner.nextLine();

        System.out.println("Имя ушедшего: " + deceasedName);
    }
}

class Resurrection {
    public void resurrect(Scanner scanner) {
        System.out.println("Кого Вы воскресите: ");
        String resurrectedName = scanner.nextLine();

        System.out.println("Имя воскрешенного: " + resurrectedName);
    }
}

class PsychicInvitation {
    public void invitePsychic(Scanner scanner) {
        String answer;
        do {
            System.out.println("Хотите ли вы пригласить экстрасенса (да/нет)? ");
            answer = scanner.nextLine().toLowerCase();

            if (!answer.equals("да") && !answer.equals("нет")) {
                System.out.println("Некорректный ввод. Пожалуйста, ответьте \"да\" или \"нет\".");
            }
        } while (!answer.equals("да") && !answer.equals("нет"));

        if (answer.equals("да")) {
            System.out.println("Вы решили пригласить экстрасенса.");
        } else {
            System.out.println("Вы решили не приглашать экстрасенса.");
        }
    }
}
