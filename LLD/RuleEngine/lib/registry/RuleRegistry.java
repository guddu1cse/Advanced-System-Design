package lib.registry;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lib.models.ExpenseType;
import lib.rules.ExpenseRule;
import lib.rules.impl.DisallowRule;
import lib.rules.impl.MaxAmountRule;

public class RuleRegistry {
    public static void getExpenseRulesRegistry() {
        Map<ExpenseType, List<ExpenseRule>> registry = new HashMap<>();

        registry.put(ExpenseType.RESTAURANT, List.of(
            new MaxAmountRule(75)
        ) );

        registry.put(ExpenseType.AIRFARE, List.of(
            new DisallowRule()
        ) );
        
    }

    public static List<ExpenseRule> getAllExpenseRulesRegistry() {
        return List.of(
            new MaxAmountRule(200)
        );
    }
}