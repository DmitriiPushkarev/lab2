package ru.pushkarev.MySecondTestAppSpringBoot.service;

import org.springframework.stereotype.Service;
import ru.pushkarev.MySecondTestAppSpringBoot.model.Positions;

import java.time.Year;

@Service
public class AnnualBonusServiceImpl implements AnnualBonusService{
    @Override
    public double calculate(Positions positions, double salary, double bonus, int workDays) {
        int currentYear = Year.now().getValue();
        int daysInYear;
        boolean leapYear = (
                currentYear > 1584 &&
                        (
                                (currentYear % 400 == 0) ||
                                        (currentYear %4 == 0 && currentYear % 100 != 0)
                        )
        );
        if (leapYear)
            daysInYear = 366;
        else
            daysInYear = 365;
        return salary * bonus * daysInYear * positions.getPositionsCoefficient() / workDays;
    }

    @Override
    public double calculateQuarterlyBonus(Positions positions, double salary, double bonus) {
        if (positions.isIsManager()) {
            return salary * bonus * positions.getPositionsCoefficient() + 50;
        } else {
            return salary * bonus * positions.getPositionsCoefficient();
        }
    }
}
