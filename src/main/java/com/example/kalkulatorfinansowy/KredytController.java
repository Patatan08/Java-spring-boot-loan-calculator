package com.example.kalkulatorfinansowy;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class KredytController {
    @PostMapping("/oblicz")
    public BigDecimal obliczRate(@RequestBody KredytRequest request) {

        BigDecimal installment = KredytSerwis.calculateRate(
                request.getAmount(),
                request.getAnnualInterestRate(),
                request.getMonths()
        );
        return installment;
    }

    }

