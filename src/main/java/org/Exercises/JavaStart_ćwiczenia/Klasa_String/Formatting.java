package org.Exercises.JavaStart_ćwiczenia.Klasa_String;

public class Formatting {
    public static void main(String[] args) {

        String firstName = "Jan";
        String lastName = "Kowalski";
        int age = 23;
        char gender = 'M';
        double height = 1.89;
        System.out.printf("Imię: %s, Nazwisko: %s, Wiek: %d, Płeć: %c, Wzrost: %f%n", firstName, lastName, age, gender, height);

        String format = "Imię: %s, Nazwisko: %s, Wiek: %d, Płeć: %c, Wzrost: %f%n";
        String output = String.format(format, firstName, lastName, age, gender, height);
        System.out.println(output);

    }
}
