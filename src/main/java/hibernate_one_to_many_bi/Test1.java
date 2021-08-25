package hibernate_one_to_many_bi;



import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").
                addAnnotatedClass(Employee.class).
                addAnnotatedClass(Department.class).
                buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession();
//
//
//
//            Department department = new Department("IT", 300, 1200);
//
//            Employee empl1 = new Employee("Zaur", "Tregulov", 800);
//            Employee empl2 = new Employee("Elena", "Smirnova", 1000);
//
//            department.addEmployeeToDepartment(empl1);
//            department.addEmployeeToDepartment(empl2);
//
//            session.beginTransaction();
//            session.save(department);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//
//
//            session.beginTransaction();
//            Department it = session.get(Department.class, 1);
//
//            List<Employee> emps = it.getEmps();
//
//            for (Employee emp: emps
//                 ) {
//                System.out.println(emp);
//            }
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session = factory.getCurrentSession();


            session.beginTransaction();
            Employee employee = session.get(Employee.class, 2);

            session.delete(employee);



            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }


    }
}

