import java.util.Scanner;

public class Calculate {

    int maxContainersInTruck = 12;
    int maxBoxesInContainer = 27;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Введите количество коробок: ");
    int boxesCount = scanner.nextInt();

    int containersCount = boxesCount / maxContainersInTruck;
        if (boxesCount % 27 != 0) {
        containersCount++;
    }

    int trucksCount = containersCount / maxBoxesInContainer;
        if (containersCount % 12 != 0) {
        trucksCount++;
    }

        System.out.println("Количество контейнеров: " + containersCount);
        System.out.println("Количество грузовиков: " + trucksCount);

}

