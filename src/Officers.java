public class Officers {
    private double hardSalary;
    private double remuneration;
    private double penalty;
    private Teacher teacher;

    public Officers(){}

    public Officers(double hardSalary, double remuneration, double penalty, Teacher teacher) {
        this.hardSalary = hardSalary;
        this.remuneration = remuneration;
        this.penalty = penalty;
        this.teacher = teacher;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }

    public double getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(double remuneration) {
        this.remuneration = remuneration;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Giáo viên có tên: " + getTeacher().getName() +
                ", ngày tháng năm sinh: " + getTeacher().getDateOfBirth() +
                ", địa chỉ: " + getTeacher().getAddress() +
                " lương cứng: " + hardSalary +
                ", lương thưởng: " + remuneration +
                ", phạt: " + penalty;
    }
}
