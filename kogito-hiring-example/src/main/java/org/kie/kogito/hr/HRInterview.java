package org.kie.kogito.hr;

public class HRInterview {

    private int experience;
    private int salary;
    private String comments;
    private boolean hire;

    public HRInterview() {
    }

    public HRInterview(int experience, int salary, String comments, boolean hire) {
        this.experience = experience;
        this.salary = salary;
        this.comments = comments;
        this.hire = hire;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public boolean isHire() {
        return hire;
    }

    public void setHire(boolean hire) {
        this.hire = hire;
    }
}
