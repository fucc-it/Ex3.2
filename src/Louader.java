import java.util.Scanner;

public class Louader {
    public static void main(String[] args) {
        //создание классов
        Human human = new Human();
        Human.Leg leg = new Human.Leg();
        Human.Hand hand = new Human.Hand();
        Human.Head head = new Human.Head();
        //ввод
        Scanner in = new Scanner(System.in);
        //
        System.out.println("Опишите человека.");
        //
        System.out.println("Описание головы:");
        System.out.println("Цвет волос:");
        head.setColorHair(in.nextLine());
        System.out.println("Цвет глаз: ");
        head.setColorEyes(in.nextLine());
        //
        System.out.println("Опишите ноги:");
        System.out.println("Нога, с которой снимался размер:");
        leg.setLegLeftRight(in.nextLine());
        System.out.println("Размер ноги(целое число): ");
        leg.setSizeFoot(in.nextInt());
        //
        System.out.println("Опишите руки: ");
        System.out.println("Какое кол-во пальцев на данной руке?");
        hand.setNumberFinger(in.nextInt());
        //
        System.out.println("Фоторобот составлен...");
        System.out.println("Это был человек с " + head.getColorHair() + " волосами и " + head.getColorEyes() + " глазами.");
        System.out.println("У него был " + leg.getSizeFoot() + " размер ноги на " + leg.getLegLeftRight() + " ноге");
        System.out.println("Также он имел " + hand.getNumberFinger() + " пальцев");

    }
}

