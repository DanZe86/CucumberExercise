package utils;

import java.util.Random;

public class EmailGenerator {

    StringBuilder fakeEmail = new StringBuilder();
    String[] tab = new String[10];

    String[] domainTab = {"@wp.pl", "@test.com", "@twojastara.pl", "@losowadomena.com"};
//ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890

    public String generateEmail() {
        String[] letterTab = {"a", "b", "c", "d", "e", "f", "g", "h", "i",
                "j", "k", "l", "m", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            tab[i] = letterTab[random.nextInt(24)];
        }
        for (int j = 0; j < tab.length; j++) {
            fakeEmail = fakeEmail.append(tab[j]);
        }
       return fakeEmail + domainTab[random.nextInt(3)];

    }
}



