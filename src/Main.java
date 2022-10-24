public class Main {
    public static void main(String[] args) {
        Human human = new Human("Максим", "Минск", 1987, "бренд-менеджер");
        System.out.println();
        Human human1 = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        System.out.println();
        Human human2 = new Human("Катя", null, 1994, "продакт-менеджер");
        System.out.println();
        Human human3 = new Human("Артем", "Москва", 1995, "директор по развитию бизнеса");

        System.out.println("Привет!Меня зовут " + human.name + "."+
                "Я из города - " + human.town + "." +
                "Я родился в " + human.yearOfBirth + " году." +
                "Я работаю на должности: " + human.post + "." + " Будем знакомы!" );

        System.out.println("Привет!Меня зовут " + human1.name + "."+
                "Я из города - " + human1.town + "." +
                "Я родился в " + human1.yearOfBirth + " году." +
                "Я работаю на должности: " + human1.post + "." + " Будем знакомы!" );

        System.out.println("Привет!Меня зовут " + human2.name + "."+
                "Я из города - " + human2.town + "." +
                "Я родился в " + human2.yearOfBirth + " году." +
                "Я работаю на должности: " + human2.post + "." + " Будем знакомы!" );

        System.out.println("Привет!Меня зовут " + human3.name + "."+
                "Я из города - " + human3.town + "." +
                "Я родился в " + human3.yearOfBirth + " году." +
                "Я работаю на должности: " + human3.post + "." + " Будем знакомы!" );



    }
}