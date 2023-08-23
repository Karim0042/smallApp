package az.iktlab.entity;

public class User {
    private String username;
    private String password;
    private int person_id;

    public User() {
    }

    public User(String username, String password, int person_id) {
        this.username = username;
        this.password = password;
        this.person_id = person_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }
}
