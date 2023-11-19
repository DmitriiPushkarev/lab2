package ru.pushkarev.MySecondTestAppSpringBoot.service;

import org.junit.jupiter.api.Test;
import ru.pushkarev.MySecondTestAppSpringBoot.model.Positions;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AnnualBonusServiceImplTest {

    @Test
    void calculate() {
        // given
        Positions position = Positions.HR;
        double bonus = 2.0;
        int workDays = 243;
        double salary = 100000.00;

        // when
        double result = new AnnualBonusServiceImpl().calculate(position, salary, bonus, workDays);

        // then
        double expected = 360493.8271604938;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void calculateQuarterlyBonus() {
        // given
        Positions position = Positions.PM;
        double bonus = 0.1;
        double salary = 500000.00;

        // when
        double result = new AnnualBonusServiceImpl().calculateQuarterlyBonus(position, salary, bonus);

        // then
        double expected = 550.0;
        assertThat(result).isEqualTo(expected);
    }
}