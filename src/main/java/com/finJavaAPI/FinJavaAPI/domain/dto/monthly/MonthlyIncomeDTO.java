package com.finJavaAPI.FinJavaAPI.domain.dto.monthly;

import java.util.UUID;

public record MonthlyIncomeDTO(
        UUID id,
        UUID userId,
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
