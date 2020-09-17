package school.management.system;

/**
 * This class is responsible for keeping the track
 * of teacher's name, id and salary
 */
public class Teacher {
    private String name;
    private int id;
    private int salary;
    private int salaryEarned;

    /**
     * Creates a new teacher object
     *
     * @param name name of the teacher
     * @param id id of the teacher
     * @param salary salary of the teacher
     */

    public Teacher(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.salaryEarned = 0;
    }

    /**
     * Name and id won't change
     * set the salary
     *
     * @param salary
     */

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalary (int salary){
          salaryEarned+=salary;
          School.updateTotalMoneySpent(salary);
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Teacher's name: "+name+
                " Total salary received so far $ "+salaryEarned;
    }
}
