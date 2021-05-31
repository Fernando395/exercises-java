public class Locust extends People {
    private String login;
    private int totalAssisted;

    public Locust(String name, int age, String sex,String login) {
        super(name, age, sex);
        this.login = login;
        this.totalAssisted = 0;
    }

    public void sawOneMore() {
        this.totalAssisted++;
    }

    @Override
    void gainExperience() {
        experience++;

    }
}
