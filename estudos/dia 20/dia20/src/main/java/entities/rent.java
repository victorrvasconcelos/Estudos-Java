package entities;

public class rent {

    private String name;
    private String email;

    public rent(String name, String email) {
        this.name = name;
        this.email = email;
    }
    @Override
    public String toString() {
        return name + ", " + email ;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
