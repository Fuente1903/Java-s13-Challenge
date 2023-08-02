package employeeApp;

public class Healthplan {
    private String name;
    private Plan plan;
    private int id;

    public enum Plan {
        BASIC("Basic", 10),
        STANDART("Standard", 20),
        PREMIUM("Premium", 30);

        private final String name;
        private final int price;

        private Plan(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }
    }

    public Healthplan(int id, String name, Plan plan) {
        this.id = id;
        this.name = name;
        this.plan = plan;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    @Override
    public String toString() {
        return "Healthplan [id: " + id + ", name: " + name + ", plan: " + plan.getName() + "]";
    }
}
