package pl.coderslab.models;


import java.sql.Date;

public class Customer {

    private int id;
    private String name;
    private String lastname;
    private Date bdate;

    public Customer() {
    }

    public Customer(String name, String lastname, Date bdate) {
        this.name = name;
        this.lastname = lastname;
        this.bdate = bdate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", bdate=" + bdate +
                '}';
    }
}