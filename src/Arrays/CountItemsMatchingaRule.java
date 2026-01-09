package Arrays;

import java.util.ArrayList;
import java.util.List;

public class CountItemsMatchingaRule {
    static void main(String[] args) {
        String[] items = {
                "phone", "blue", "pixel",
                "computer", "silver", "phone",
                "phone", "gold", "iphone"
        };
        String ruleKey = "color";
        String ruleValue = "silver";
        List<List<String>> itemsList = new ArrayList<>();
        for (String item : items) {
            itemsList.add(List.of(item.split(",")));
        }

    }


}
