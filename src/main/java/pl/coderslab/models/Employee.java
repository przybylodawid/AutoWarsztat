package pl.coderslab.models;

public class Employee {
    private int id;
    private String name;
    private String lastname;
    private String address;
    private String phone;
    private String note;
    private double pph;

    public Employee(int id, String name, String lastname, String address, String phone, String note, double pph) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
        this.note = note;
        this.pph = pph;
    }

    public Employee(String name, String lastname, String address, String phone, String note, double pph) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.phone = phone;
        this.note = note;
        this.pph = pph;
    }

    public Employee(){

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getPph() {
        return pph;
    }

    public void setPph(double pph) {
        this.pph = pph;
    }
}