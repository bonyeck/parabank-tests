package scenarios;

import pages.BasePage;

public interface Scenario<I extends BasePage, O extends BasePage> {
    O run(I entry);
}
