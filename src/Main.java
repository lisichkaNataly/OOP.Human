public class Main {
    public static void main(String[] args) {
        Human human = new Human("Максим", "Минск", 1987, "бренд-менеджер");
        human.human();
        System.out.println();
        Human human1 = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        human1.human();
        System.out.println();
        Human human2 = new Human("Катя", "Калининград", 1994, "продакт-менеджер");
        human2.human();
        System.out.println();
        Human human3 = new Human("Артем", "Москва", 1995, "директор по развитию бизнеса");
        human3.human();



    }
}