package core.basesyntax;

import core.basesyntax.strategy.DiscountService;
import core.basesyntax.strategy.impl.BirthdayDiscountService;
import core.basesyntax.strategy.impl.BlackFridayDiscountService;
import core.basesyntax.strategy.impl.DefaultDiscountService;
import core.basesyntax.strategy.impl.NewYearDiscountService;

public class DiscountStrategy {
    public DiscountService getDiscountServiceBySpecialEvent(String specialEvent) {
        switch (specialEvent) {
            case "birthday":
                return new BirthdayDiscountService();
            case "blackFriday":
                return new BlackFridayDiscountService();
            case "newYear":
                return new NewYearDiscountService();
            default:
                return new DefaultDiscountService();
        }

    }
}
