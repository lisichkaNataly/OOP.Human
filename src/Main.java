public class Main {
    public static void main(String[] args) {
        Human human = new Human("Максим", "Минск", 1987, "бренд-менеджер");
        System.out.println();
        Human human1 = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        System.out.println();
        Human human2 = new Human("Катя", null, 1994, "продакт-менеджер");
        System.out.println();
        Human human3 = new Human("Артем", "Москва", 1995, "директор по развитию бизнеса");
        Human human4 = new Human("Владимир", "Казань", 2001, null);

        printInfo(human);
        printInfo(human1);
        printInfo(human2);
        printInfo(human3);
        printInfo(human4);

    }

    private static void printInfo(Human human) {
        System.out.println("Привет!Меня зовут " + human.name + "."+
                "Я из города - " + human.getTown() + "." +
                "Я родился в " + human.getYearOfBirth() + " году." +
                "Я работаю на должности: " + human.post + "." + " Будем знакомы!" );
    }
}