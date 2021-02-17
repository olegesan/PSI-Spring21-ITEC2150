package Session4.Completed;

public class Reddit extends App {
    private int karma;
    private String username;
    private static int numberOfUsers = 0;

    /**
     * Default constructor for a reddit app. It provides all default values to it.
     */
    public Reddit() {
        super("Reddit", "reddit, inc.", 169.9);
        karma = 0;
        username = "default_account_name_" + numberOfUsers;
        incrementNumberOfUsers();
    }

    /**
     * Custom constructor that is supposed to set custom username and karma
     */
    public Reddit(int karma, String username) {
        super("Reddit", "reddit, inc.", 169.9);
        this.karma = karma;
        this.username = username;
    }

    public int getKarma() {
        return karma;
    }

    public void setKarma(int karma) {
        this.karma = karma;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static void incrementNumberOfUsers() {
        numberOfUsers++;
    }

    @Override
    public String toString() {
        return "Reddit Developed By " + this.getDeveloper() + ", size: " + getSizeMB() + "MB, karma = " + karma + ", username = " + username;
    }
}
