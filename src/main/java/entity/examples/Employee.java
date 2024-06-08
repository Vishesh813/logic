package entity.examples;

public class Employee {
    String department;
    double salary;
    String name;
    int id;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    /**
     * get field
     *
     * @return department
     */
    public String getDepartment() {
        return this.department;
    }

    /**
     * set field
     *
     * @param department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * get field
     *
     * @return salary
     */
    public double getSalary() {
        return this.salary;
    }

    /**
     * set field
     *
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * get field
     *
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * set field
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * get field
     *
     * @return id
     */
    public int getId() {
        return this.id;
    }

    /**
     * set field
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
}
