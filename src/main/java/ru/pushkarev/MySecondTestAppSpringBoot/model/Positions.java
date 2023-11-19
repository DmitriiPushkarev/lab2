package ru.pushkarev.MySecondTestAppSpringBoot.model;

import lombok.Getter;

@Getter
public enum Positions {
    DEV(2.2, false),
    HR(1.2, false),
    QA(1.9, false),
    ML(2.5, false),
    PM(0.01, true),
    TL(2.6, false);

    private final double positionsCoefficient;
    private final boolean IsManager;

    Positions(double positionsCoefficient, boolean isManager) {
        this.positionsCoefficient = positionsCoefficient;
        IsManager = isManager;
    }
}
