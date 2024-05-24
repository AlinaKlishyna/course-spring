package com.gmail.alinakotova102;

/**
 * @author Alina Klishyna
 */
public class TestBean {

    private String name;
    private String lastname;

    public TestBean(String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname() {
        return lastname;
    }

}
