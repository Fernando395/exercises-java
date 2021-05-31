public class Student extends People {
    private int registration;
    private String course;

    public void cancelRegistration() {

    }

    public int getRegistration() {
        return registration;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }
}
