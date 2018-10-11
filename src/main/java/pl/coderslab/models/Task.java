package pl.coderslab.models;


import java.sql.Date;

public class Task {
    private int id;
    private Date check_in_date;
    private Date start_date;
    private Date end_date;
    private int employee_id;
    private String description;
    private String result;
    private int status_id;
    private int car_id;
    private double total_price;
    private double part_cost;
    private int hours;

    public Task() {
    }

    public Task(Date check_in_date, Date start_date, int employee_id, String description, int status_id, int car_id) {
        this.check_in_date = check_in_date;
        this.start_date = start_date;
        this.employee_id = employee_id;
        this.description = description;
        this.status_id = status_id;
        this.car_id = car_id;
    }

    public Task(Date check_in_date, Date start_date, Date end_date, int employee_id, String description, String result, int status_id, int car_id, double total_price, double part_cost, int hours) {
        this.check_in_date = check_in_date;
        this.start_date = start_date;
        this.end_date = end_date;
        this.employee_id = employee_id;
        this.description = description;
        this.result = result;
        this.status_id = status_id;
        this.car_id = car_id;
        this.total_price = total_price;
        this.part_cost = part_cost;
        this.hours = hours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCheck_in_date() {
        return check_in_date;
    }

    public void setCheck_in_date(Date check_in_date) {
        this.check_in_date = check_in_date;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public int getStatus_id() {
        return status_id;
    }

    public void setStatus_id(int status_id) {
        this.status_id = status_id;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    public double getPart_cost() {
        return part_cost;
    }

    public void setPart_cost(double part_cost) {
        this.part_cost = part_cost;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", check_in_date=" + check_in_date +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", employee_id=" + employee_id +
                ", description='" + description + '\'' +
                ", result='" + result + '\'' +
                ", status_id=" + status_id +
                ", car_id=" + car_id +
                ", total_price=" + total_price +
                ", part_cost=" + part_cost +
                ", hours=" + hours +
                '}';
    }
}
