package clases_objetos.herencia3_ejercicio;

public class Employee extends Person {
    private String dni;
    private String phone;
    private double salary;
    private String position;

    public Employee(){
        super();
        this.dni = "";
        this.phone = "";
        this.salary = 0;
        this.position = "";
    }

    public Employee(String name, String dni, String phone, double salary, String position){
        super(name);
        this.dni = dni;
        this.phone = phone;
        this.salary = salary;
        this.position = position;
    }


    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "dni='" + dni + '\'' +
                ", name='" + this.getName() + '\'' +
                ", phone='" + phone + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }
}
