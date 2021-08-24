package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();

            Employee emp = new Employee("Oleg", "Sidorov", "Hr", 550);

            session.beginTransaction();
            session.save(emp);


            int myId = emp.getId();


            Employee employee = session.get(Employee.class, myId);
            session.getTransaction().commit();

            System.out.println(employee);

        } finally {
            factory.close();
        }

        System.out.println("Done!");
    }
}
