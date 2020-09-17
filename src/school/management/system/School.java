package school.management.system;

import java.util.List;

/**
 * Many teachers, many students.
 * Implements teachers and students
 * using an Arraylist
 */
public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * new school object is created
     *
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

    /**
     * @return the list of teachers on the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school
     *
     * @param teacher the teacher to be added.
     */

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     * @return the list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a teacher to the school
     *
     * @param student the student to be added
     */

    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     * @return the total money earned by the school.
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * Adds the total money earned by the school
     *
     * @param moneyEarned money that is suposed to be added.
     */
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     * @return the total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     * Adds the total money spent by the school
     *
     * @param moneySpent salary earned by the teachers
     */
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;

    }

}

