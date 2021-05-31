public class Application {
    public static void main(String[] args) {
        People p1 = new People();
        Student p2 = new Student();
        Teacher p3 = new Teacher();
        Employee p4 = new Employee();

        p1.setName("Pedro");
        p2.setName("Maria");
        p3.setName("Claudio");
        p4.setName("Fabiana");

        p2.setCourse("Informatica");
        p3.setWage(2500.75);
        p4.setOffice("Estoque");
        p1.setAge(26);
        p1.setSex("Masculino");

        System.out.println(p1.toString());
    }
}
