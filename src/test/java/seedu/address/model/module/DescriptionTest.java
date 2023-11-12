package seedu.address.model.module;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DescriptionTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Description(null));
    }

    @Test
    public void isValidDescription_alwaysTrue() {
        assertTrue(Description.isValidDescription("")); // empty string
        assertTrue(Description.isValidDescription(" ")); // only whitespace
        assertTrue(Description.isValidDescription("This is a description"));
        assertTrue(Description.isValidDescription("12345"));
        assertTrue(Description.isValidDescription("!@#$%^&*()_+"));
    }

    @Test
    public void toStringMethod() {
        Description description = new Description("This is a description");
        assertTrue(description.toString().equals("This is a description"));
    }

    @Test
    public void equals() {
        Description description = new Description("This is a description");

        // same object -> returns true
        assertTrue(description.equals(description));

        // same values -> returns true
        Description descriptionCopy = new Description("This is a description");
        assertTrue(description.equals(descriptionCopy));

        // different types -> returns false
        assertFalse(description.equals(1));

        // null -> returns false
        assertFalse(description.equals(null));

        // different description -> returns false
        Description differentDescription = new Description("This is a different description");
        assertFalse(description.equals(differentDescription));
    }
}