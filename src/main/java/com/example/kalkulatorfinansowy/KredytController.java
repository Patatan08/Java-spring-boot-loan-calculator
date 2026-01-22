package com.example.kalkulatorfinansowy;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class KredytController {
    @Autowired
    private KredytSerwis kredytSerwis;
    @PostMapping("/oblicz")
    public BigDecimal calculateRate (@RequestBody KredytRequest request) {

        BigDecimal installment = kredytSerwis.calculateRate(
                request.getAmount(),
                request.getAnnualInterestRate(),
                request.getMonths()
        );
        return installment;
    }

    }

