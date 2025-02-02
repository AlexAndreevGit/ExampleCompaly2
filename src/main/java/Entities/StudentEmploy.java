package Entities;

public class StudentEmploy extends BasePerson {

    private BasePerson buddy;

    public StudentEmploy(String firstName, String secondName, int age, BasePerson buddy) {
        super(firstName, secondName, age);
        this.buddy = buddy;
    }


}
