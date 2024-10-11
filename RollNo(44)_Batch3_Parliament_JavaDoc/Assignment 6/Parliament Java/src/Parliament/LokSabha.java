package Parliament;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents the Lok Sabha (House of the People) in the Indian Parliament.
 * Maintains a list of members and provides methods to add and retrieve members.
 *
 * Author: Shreyash Parsekar
 * Roll No: 45
 * Title: Parliament Of India
 * Date: 23/07/2024
 * Batch-3
 * MCA-Part-1
 */
public class LokSabha {
    public List<MemberOfParliament> members = new ArrayList<>();

    /**
     * Adds a member to the Lok Sabha.
     *
     * @param member The member to be added.
     */
    public void addMember(MemberOfParliament member) {
        members.add(member);
    }

    /**
     * Returns the list of members in the Lok Sabha.
     *
     * @return A list of members.
     */
    public List<MemberOfParliament> getMembers() {
        return members;
    }

    /**
     * Returns a string representation of the Lok Sabha and its members.
     *
     * @return A string representing the Lok Sabha and its members.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Lok Sabha Members:543\n");
        for (MemberOfParliament member : members) {
            sb.append(member.toString()).append("\n");
        }
        return sb.toString();
    }
}
