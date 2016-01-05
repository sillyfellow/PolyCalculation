package org.whybenormal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sands on 05/01/16.
 */
public class PolyEval {

    private static final Pattern monomial = Pattern.compile("([+-])?(\\d+(?:\\.?\\d*))?x(?:\\^(\\d+))?");

    public static double UniVariate(String polynomial, double x) {
        Matcher m = monomial.matcher(polynomial);
        double total = 0.0;
        while (m.find()) {
            total += evaluateXMonomial(m, x);
        }
        return total;
    }

    private static double evaluateXMonomial(Matcher monomial, double x) {
        // find the sign, if any.
        double sign = ("-".equals(monomial.group(1))) ? -1.0 : 1.0;

        // extract the coefficient, if any.
        String coefficient_str = monomial.group(2);
        double coefficient_val = (coefficient_str == null) ? 1.0 : Double.parseDouble(coefficient_str);

        // extract the exponent, if any
        String exponent_str = monomial.group(3);
        int exponent_val = (exponent_str == null) ? 1 : Integer.parseInt(exponent_str);

        // compute.
        return (sign * coefficient_val * Math.pow(x, exponent_val));
    }
}
