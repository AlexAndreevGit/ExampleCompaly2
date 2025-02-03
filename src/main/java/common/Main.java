package common;

import Entities.BasePerson;
import Entities.Department;
import Entities.FullTimeEmploy;
import Entities.StudentEmploy;

public class Main {
    public static void main(String[] args) {



        BasePerson fullTimeEmploy1 = new FullTimeEmploy("Ivan", "Georgiev", 35);
        BasePerson fullTimeEmploy2 = new FullTimeEmploy("Ivan", "Georgiev", 35);
        BasePerson student1 = new StudentEmploy("Peter", "Ivanov", 25, fullTimeEmploy1);



        Department departmentDepartment = new Department("Developement");

        departmentDepartment.addEmploee(fullTimeEmploy1);
        departmentDepartment.addEmploee(fullTimeEmploy2);

        departmentDepartment.addEmploee(student1);

        System.out.println(BasePerson.getEmployNumber());

        FullTimeEmploy.whatIsTheCompanyName();

    }
}