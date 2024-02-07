package org.Exercises.JavaStart_ćwiczenia.Kalkulator_płac;

public class PaymentCalculator {
    private final static double ZUS = 1000;

    public static double nettoYearPayment(Employee employee) {
        return employee.getSalary() * 12;
    }
    public static double bruttoYearPayment(Employee employee){
        double netto = employee.getSalary();
        double tax = netto * 0.23;
        return 12 * (netto + tax + ZUS);
    }
}
