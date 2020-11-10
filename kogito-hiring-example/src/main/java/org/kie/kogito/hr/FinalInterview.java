package org.kie.kogito.hr;

public class FinalInterview {

    private int salary;
    private boolean hire;

    public FinalInterview() {
    }

    public FinalInterview(int salary, boolean hire) {
        this.salary = salary;
        this.hire = hire;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isHire() {
        return hire;
    }

    public void setHire(boolean hire) {
        this.hire = hire;
    }
}
