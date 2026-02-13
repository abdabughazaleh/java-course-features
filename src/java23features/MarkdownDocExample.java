package java23features;

import module java.base;

/**
 * Calculates tax for a given amount.
 *
 * ## Features
 * - Supports VAT
 * - Supports custom tax rules
 *
 * **Example**
 *
 * ```java
 * double result = taxService.calculate(100);
 * ```
 *
 * @param amount the original amount
 * @return calculated tax value
 */
public class MarkdownDocExample {
    public double calculate(double amount) {
        return amount * 0.15;
    }
}
