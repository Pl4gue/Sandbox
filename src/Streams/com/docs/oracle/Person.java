package Streams.com.docs.oracle;

/**
 * Project "Sandbox"
 * "Person.java" created by David Wu on Wed,12.07.17.
 */

public class Person {
    SEX gender;
    String name;

    public Person(SEX sex,String name) {
        gender = sex;
        this.name = name;
    }
    public enum SEX {
        MALE, FEMALE;
    }

    public String getName() {
        return name;
    }

    public void setGender(SEX sex) {
        gender = sex;
    }

    public SEX getGender() {
        return gender;
    }
}


/**
 * End of Person.java
 */