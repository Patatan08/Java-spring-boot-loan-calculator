package com.example.kalkulatorfinansowy;

import org.springframework.stereotype.Service;
import java.math.BigDecimal;

@Service
public class KredytSerwis {

    public BigDecimal obliczRate(BigDecimal sum, BigDecimal LoanInterest, int months) {
        if(sum == null || LoanInterest == null || months <= 0){
            throw new RuntimeException("Podane dane są błędne");
        }
        BigDecimal years = new BigDecimal(months).divide(new BigDecimal(12), 10, BigDecimal.ROUND_HALF_UP);

        BigDecimal interest = sum
                .multiply(LoanInterest)
                .divide(new BigDecimal(100), 10, BigDecimal.ROUND_HALF_UP)
                .multiply(years);

        BigDecimal total = sum.add(interest);

        BigDecimal installment = total.divide(new BigDecimal(months), 2, BigDecimal.ROUND_HALF_UP);

        return installment;
    }
}