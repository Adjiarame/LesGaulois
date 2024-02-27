package personnages;

public class Soldat {
    private String grade;
    private int force;

    public Soldat(String grade, int force) {
        this.grade = grade;
        this.force = force;
    }

    // Getters et setters
    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
