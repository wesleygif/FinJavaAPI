package com.finJavaAPI.FinJavaAPI.domain.dto.monthly;

public record MonthlyIncomeRequest(
        String month,
        String year,
        double income,
        double expenses,
        double savings,
        double totalIncome,
        double totalExpenses,
        double totalSavings
) {
}
