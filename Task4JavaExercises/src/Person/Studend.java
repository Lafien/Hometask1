package Person;

import java.util.Objects;

public class Studend extends Person{
    private String program;
    private int year;
    private double fee;

    public Studend(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() +",program=" + program + ",year=" + year + ",fee=" + fee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Studend studend = (Studend) o;
        return year == studend.year &&
                Double.compare(studend.fee, fee) == 0 &&
                Objects.equals(program, studend.program);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), program, year, fee);
    }
}
