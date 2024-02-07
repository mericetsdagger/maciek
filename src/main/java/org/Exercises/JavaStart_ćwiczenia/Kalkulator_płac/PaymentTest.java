package org.Exercises.JavaStart_ćwiczenia.Kalkulator_płac;

public class PaymentTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Evo", "Evowski", 3500);
        double netto = PaymentCalculator.nettoYearPayment(employee1);
        double brutto = PaymentCalculator.bruttoYearPayment(employee1);
        System.out.println("Roczna wypłata netto to: " + netto );
        System.out.println("Roczna wypłata brutto to: " + brutto);
    }
}
