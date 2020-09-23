package com.abddhospital.bdd.hello_cucumber;

public class IsItFriday {
    static String isItFriday(String today) {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}
