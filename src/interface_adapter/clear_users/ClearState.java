package interface_adapter.clear_users;

// TODO Complete me

import java.util.ArrayList;
import java.util.List;

public class ClearState {

    private List<String> usernames = new ArrayList<String>();


    public ClearState(ClearState copy) {
        usernames = copy.usernames;
    }

    public ClearState() {}

    public List<String> getUsernames() {
        return usernames;
    }

    public void setUsernames(List<String> usernames) {
        this.usernames = usernames;
    }

    @Override
    public String toString() {
        String users = "";

        for (String user: usernames) {
            users += user + "\n";
        }

        return users;
    }
}
