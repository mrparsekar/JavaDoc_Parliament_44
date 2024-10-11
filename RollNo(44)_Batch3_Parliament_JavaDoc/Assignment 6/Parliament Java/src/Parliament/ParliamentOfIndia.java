package Parliament;

/**
 * Represents the Parliament of India, consisting of the President, Rajya Sabha, and Lok Sabha.
 * Provides a method to display the details of the Parliament.
 *
 * Author: Shreyash Parsekar
 * Roll No: 45
 * Title: Parliament Of India
 * Date: 23/07/2024
 * Batch-3
 * MCA-Part-1
 */
public class ParliamentOfIndia {
    private PresidentOfIndia president;
    private RajyaSabha rajyaSabha;
    private LokSabha lokSabha;

    /**
     * Constructs a new Parliament.ParliamentOfIndia with the specified President, Rajya Sabha, and Lok Sabha.
     *
     * @param president The President of India.
     * @param rajyaSabha The Rajya Sabha.
     * @param lokSabha The Lok Sabha.
     */
    public ParliamentOfIndia(PresidentOfIndia president, RajyaSabha rajyaSabha, LokSabha lokSabha) {
        this.president = president;
        this.rajyaSabha = rajyaSabha;
        this.lokSabha = lokSabha;
    }

    /**
     * Returns a string representation of the Parliament of India.
     *
     * @return A string representing the President, Rajya Sabha, and Lok Sabha.
     */
    @Override
    public String toString() {
        return president.toString() + "\n" + rajyaSabha.toString() + "\n" + lokSabha.toString();
    }
}
