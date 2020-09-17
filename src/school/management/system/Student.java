package school.management.system;

/**
 * this class is responsible for keeping the track
 * of students fees, names, id, grade and fees paid.
 */

public class Student {

    private String name;
    private int id;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * The role of constructor is to create a new student object by initializing the values
     * Fees for every student is $30,000.
     * Fees paid initially is 0.
     *
     * @param name  name of the student
     * @param id    id for the students: unique
     * @param grade grade of the student
     */

    public Student(String name, int id, int grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.feesPaid = feesPaid;
        this.feesTotal = feesTotal;
    }

    //Not going to alter student's name and student's id.

    /**
     * Used to upgrade the student's grade.
     *
     * @param grade new grade.
     */

    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * Keep adding the fees to feesPaid Field.
     * Add the fees to the feesPaid.
     * The school is going to receive the funds.
     *
     * @param fees the fees that the student pays.
     */

    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     * @return name, id, grade, feesPaid by the students & feesTotal, respectively.
     */

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees() {
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student'name: " + name +
                " Total fees paid so far $" + feesPaid;
    }

}


