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
//            Department department = new Department("Sales", 800, 1500);
//
//            Employee empl1 = new Employee("Zaur", "Tregulov", 800);
//            Employee empl2 = new Employee("Elena", "Smirnova", 1500);
//            Employee empl3 = new Employee("Anton", "Sidorov", 1200);
//
//            department.addEmployeeToDepartment(empl1);
//            department.addEmployeeToDepartment(empl2);
//            department.addEmployeeToDepartment(empl3);
//
//            session.beginTransaction();
//            session.save(department);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            //*******************************************************

            session = factory.getCurrentSession();


            session.beginTransaction();

            System.out.println("Get department");
            Department department = session.get(Department.class, 4);

            System.out.println("Show department");
            System.out.println(department);

            System.out.println("подгрузим наших работников");
            department.getEmps().get(0);

            session.getTransaction().commit();



            System.out.println("Show employees of the department");
            System.out.println(department.getEmps());


            System.out.println("Done!");


            //*******************************************************
//
//
//            session = factory.getCurrentSession();
//
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 2);
//
//            session.delete(employee);
//
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }


    }
}

