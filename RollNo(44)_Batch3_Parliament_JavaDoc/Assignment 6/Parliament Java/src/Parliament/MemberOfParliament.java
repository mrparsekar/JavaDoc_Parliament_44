package Parliament;

/**
 * Represents a Member of Parliament with a name, position, and party affiliation.
 *
 * @author : Shreyash Parsekar
 * Roll No: 45
 * Title: Parliament Of India
 * Date: 23/07/2024
 * Batch-3
 * MCA-Part-1
 */
public class MemberOfParliament {
    private String name;
    private String position;
    private String party;

    /**
     * Constructs a new Parliament.MemberOfParliament with the specified name, position, and party.
     *
     * @param name     The name of the member.
     * @param position The position of the member.
     * @param party    The party of the member.
     */
    public MemberOfParliament(String name, String position, String party) {
        this.name = name;
        this.position = position;
        this.party = party;
    }

    /**
     * Returns a string representation of the Member of Parliament.
     *
     * @return A string representing the member's name, position, and party.
     */
    @Override
    public String toString() {
        return String.format("\nName: %s\nPosition: %s\nParty: %s", name, position, party);
    }
}
