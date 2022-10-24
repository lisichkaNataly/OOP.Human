public class Human {

    int yearOfBirth;
    String name;
    String town;
    String post;


    Human(String name, String town, int yearOfBirth, String post) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.post = post;
    }

    void human() {
        System.out.println("Привет!Меня зовут " + name + ".");
        System.out.println("Я из города - " + town + " .");
        System.out.println("Я родился в " + yearOfBirth + " году.");
        System.out.println("Я работаю на должности: " + post );
        System.out.println("Будем знакомы!");

    }



}
