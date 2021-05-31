public class Employee extends People {
    private String office;
    private boolean working;

    public void changeWork() {
        this.working = ! this.working;
    }

    public String getOffice() {
        return office;
    }

    public boolean getWorking() {
        return working;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
}
