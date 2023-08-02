package employeeApp;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()
    {

        Healthplan.Plan basicPlan = Healthplan.Plan.BASIC;
        Healthplan.Plan standartPlan = Healthplan.Plan.STANDART;
        Healthplan.Plan premiumPlan = Healthplan.Plan.PREMIUM;

        String[] healthplans = {basicPlan.getName()};
        String[] healthplans1 = {standartPlan.getName()};
        String[] healthplans2 = {premiumPlan.getName()};

        Employee emp = new Employee(1, "Doruk", "doruk@example.com", "1903", healthplans);
        Employee emp1 = new Employee(2,"Dorukhan", "dorukhan@example.com", "01903", healthplans1);
        Employee emp2 = new Employee(3,"Kartal", "kartal@gmail.com", "190303", healthplans2);

        emp.addHealthplan(4, premiumPlan.getName());
        emp1.addHealthplan(2, basicPlan.getName());
        emp2.addHealthplan(3, standartPlan.getName());

        String[] developerName = {emp.getFullname(), emp1.getFullname(), emp2.getFullname()};

        Company comp = new Company(1,"Example Corp" , 10000, developerName);

        comp.addEmployee(3,"Quaresma");
        comp.addEmployee(4,"Aboubakar");
        comp.addEmployee(5, "Cenk Tosun");

        System.out.println("Healthplan: " + basicPlan + " " + standartPlan + " " + premiumPlan);
        System.out.println("Employee: " + emp + "\n" + emp1 + "\n" + emp2);
        System.out.println("Company: " + comp);

    }



}

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
