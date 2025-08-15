package com.finJavaAPI.FinJavaAPI.domain.entity;

import java.util.UUID;

public class Monthly {
    private final UUID id;
    private final UUID userId;
    private final String month;
    private final String year;
    private final double income;
    private final double expenses;
    private final double savings;
    private final double totalIncome;
    private final double totalExpenses;
    private final double totalSavings;

    public Monthly(UUID id, UUID userId, String month, String year, double income, double expenses, double savings,
                   double totalIncome, double totalExpenses, double totalSavings) {
        this.id = id;
        this.userId = userId;
        this.month = month;
        this.year = year;
        this.income = income;
        this.expenses = expenses;
        this.savings = savings;
        this.totalIncome = totalIncome;
        this.totalExpenses = totalExpenses;
        this.totalSavings = totalSavings;
    }

    public UUID getId() { return id; }
    public UUID getUserId() { return userId; }
    public String getMonth() { return month; }
    public String getYear() { return year; }
    public double getIncome() { return income; }
    public double getExpenses() { return expenses; }
    public double getSavings() { return savings; }
    public double getTotalIncome() { return totalIncome; }
    public double getTotalExpenses() { return totalExpenses; }
    public double getTotalSavings() { return totalSavings; }
}
