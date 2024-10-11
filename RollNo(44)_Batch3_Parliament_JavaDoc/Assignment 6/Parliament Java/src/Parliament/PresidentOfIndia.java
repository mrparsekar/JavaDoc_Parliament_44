package Parliament;

/**
 * Represents the President of India.
 *
 * Author: Shreyash Parsekar
 * Roll No: 45
 * Title: Parliament Of India
 * Date: 23/07/2024
 * Batch-3
 * MCA-Part-1
 */
public class PresidentOfIndia {
    private String name;

    /**
     * Constructs a new Parliament.PresidentOfIndia with the specified name.
     *
     * @param name The name of the President.
     */
    public PresidentOfIndia(String name) {
        this.name = name;
    }

    /**
     * Returns a string representation of the President of India.
     *
     * @return A string representing the President's name.
     */
    @Override
    public String toString() {
        return "President of India: " + name;
    }
}