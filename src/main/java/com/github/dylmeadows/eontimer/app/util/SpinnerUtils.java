package com.github.dylmeadows.eontimer.app.util;

import javafx.scene.control.SpinnerValueFactory;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class SpinnerUtils {

    public static SpinnerValueFactory<Integer> createValueFactory(int min, int max) {
        return new SpinnerValueFactory.IntegerSpinnerValueFactory(min, max);
    }

    public static SpinnerValueFactory<Integer> createValueFactory(int min, int max, int initialValue) {
        return new SpinnerValueFactory.IntegerSpinnerValueFactory(min, max, initialValue);
    }

    public static SpinnerValueFactory<Integer> createValueFactory(int min, int max, int initialValue, int amountToStepBy) {
        return new SpinnerValueFactory.IntegerSpinnerValueFactory(min, max, initialValue, amountToStepBy);
    }
}
