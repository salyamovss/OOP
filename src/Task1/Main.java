package Task1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Passport passport = new Passport(1,"Symbat", "Saliamov",LocalDate.ofYearDay(2006,7),'M',"Kyrgyzstan");
        System.out.println(passport.toString());

      // todo: Test project

    }
}
