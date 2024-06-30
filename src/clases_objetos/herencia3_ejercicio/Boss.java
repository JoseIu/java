package clases_objetos.herencia3_ejercicio;

public class Boss extends  Employee{

    public String departament;

    public Boss() {
        super();
        this.departament = "";
    }

    public Boss(String name, String dni, String phone, double salary, String position, String departament) {
        super(name, dni, phone, salary, position);
        this.departament = departament;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "departament='" + departament + '\'' +
                "dni='" + this.getDni() + '\'' +
                ",name='" + this.getName() + '\'' +
                ",phone='" + this.getPhone() + '\'' +
                ",salary=" + this.getSalary() +
                ",position='" + this.getPosition() + '\'' +
                '}';
    }
}
