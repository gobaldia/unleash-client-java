package no.finn.unleash.integration;

import java.util.Map;

public class TestCase {
    private String description;
    private Map<String, String> context;
    private String toggleName;
    private boolean expectedResult;

    public Map<String, String> getContext() {
        return context;
    }

    public String getDescription() {
        return description;
    }

    public String getToggleName() {
        return toggleName;
    }

    public boolean getExpectedResult() {
        return expectedResult;
    }
}
