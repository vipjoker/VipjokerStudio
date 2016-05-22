package mypackage.model;


/**
 * Created by Admin on 22.05.2016.
 */

public class Credentials {

    private String name;
    private String surname;
    public Credentials(String name,String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
