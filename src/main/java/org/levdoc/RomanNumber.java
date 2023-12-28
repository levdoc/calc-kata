package org.levdoc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

enum RomanNumber {
    I(1),
    IV(4),
    V(5),
    IX(9),
    X(10),
    XL(40),
    L(50),
    XC(90),
    C(100),
    CD(400),
    D(500),
    CM(900),
    M(1000);

    private final int value;

    RomanNumber(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static List<RomanNumber> getRomanNumberListToRoman() {
        List<RomanNumber> result = Arrays.asList(RomanNumber.values());
        Collections.reverse(result);
        return result;
    }
}
