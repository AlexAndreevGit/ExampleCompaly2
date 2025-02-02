package Entities;

import java.util.ArrayList;
import java.util.List;

public class Department extends BaseEntitie {

    private String name;
    private BasePerson boss;

    private List<BasePerson> listOfEmployees;

    public Department(String name) {
        this.name = name;
        this.listOfEmployees=new ArrayList<>();
    }

    public Department(String name, BasePerson boss) {
        this(name);
        this.boss = boss;
    }

    public void addEmploee(BasePerson basePerson) {
        listOfEmployees.add(basePerson);
    }


}
