package Entities;

public class BasePerson extends BaseEntitie{

    private String firstName;

    private String secondName;

    private int age;

    private static int employNumber = 0;

    private static final String COMANY_NANME = "CompanyExample AG";

    public BasePerson(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        employNumber++;

    }

    public static int getEmployNumber() {
        return employNumber;
    }

    public static void whatIsTheCompanyName(){
        System.out.println(COMANY_NANME);
    }
}
