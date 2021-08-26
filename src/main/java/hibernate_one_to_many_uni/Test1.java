package hibernate_one_to_many_uni;



import hibernate_one_to_many_uni.entity.Department;
import hibernate_one_to_many_uni.entity.Employee;
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
//            Department department = new Department("HR", 500, 1500);
//
//            Employee empl1 = new Employee("Oleg", "Ivanov", 8000);
//            Employee empl2 = new Employee("Andrey", "Sidorov", 1000);
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
//            Department it = session.get(Department.class, 2);
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
            //Employee employee = session.get(Employee.class, 2);
            Department hr = session.get(Department.class, 2);

            session.delete(hr);



            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }


    }
}

