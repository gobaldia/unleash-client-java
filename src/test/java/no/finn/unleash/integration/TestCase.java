package no.finn.unleash.integration;

import java.util.Map;

public class TestCase {
    public String description;
    public Map<String, String> context;
    public String toggleName;
    public boolean expectedResult;

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
