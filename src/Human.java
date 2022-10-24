public class Human {

   public int yearOfBirth;
   public String name;
   public String town;
   public String post;


    Human(String name, String town, int yearOfBirth, String post) {
        this.name = name;
        this.town = town;
        this.post = post;
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }

        if (name == null) {
            this.name = "Информация не указана";
        } else {
            this.name = name;

            if (town == null) {
                this.town = "Информация не указана";
            } else {
                this.town = town;
            }

            if (post == null) {
                this.post = "Информация не указана";
            } else {
            this.post = post;
        }
    }


}}
