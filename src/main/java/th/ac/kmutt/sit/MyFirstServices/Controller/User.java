package th.ac.kmutt.sit.MyFirstServices.Controller;

public class User {

    private int id;

    private String name;

    public User() {

    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public static void addUser(User[] user, String[] Allname) {
        int i;
        for (i = 0; i <= 4; i++) {
            user[i] = new User(i + 1, Allname[i]);
        }
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", name=" + name + '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;

    }

    public String getName() {
        return this.name;

    }

}
