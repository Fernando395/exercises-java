public abstract class People {
    String name;
    int age;
    String sex;
    int experience;

    public People(String name,int age,String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.experience = 0;
    }

    abstract void gainExperience();
}
