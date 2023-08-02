package employeeApp;

import java.util.Arrays;

public class Employee {

    private int id;
    private String fullname;
    private String email;
    private String password;
    private String[] healthplans;

    public Employee(int id, String fullname, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public int getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }

    public void addHealthplan(String name) {
        // Yeni bir sağlık planı ekleyelim
        if (healthplans == null) {
            healthplans = new String[]{name};
            System.out.println("Healtplan added: " + name);
        } else {

            int availableIndex = -1;
            for (int i = 0; i < healthplans.length; i++) {
                if (healthplans[i] == null) {
                    availableIndex = i;
                    break;
                }
            }
            if (availableIndex != -1) {
                healthplans[availableIndex] = name;
                System.out.println("Healtplan added: " + name);
            } else {
                System.out.println("Healthplans array is already full. Cannot add a new health plan.");
            }
        }
    }

    public String toString() {
        return "Employee [id: " + id + ", fullname: " + fullname + ", email: " + email + ", healthplans: " + Arrays.toString(healthplans) + "]";
    }
}
