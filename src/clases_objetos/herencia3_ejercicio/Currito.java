package clases_objetos.herencia3_ejercicio;

public class Currito extends  Employee{

    public String problems;
    public Currito() {
        super();
        this.problems = "";
    }
    public Currito(String name, String dni, String phone, double salary, String position, String problems) {
        super(name, dni, phone, salary, position);
        this.problems = problems;
    }

    public String getProblems() {
        return problems;
    }

    public void setProblems(String problems) {
        this.problems = problems;
    }

    @Override
    public String toString() {
        return "Currito{" +
                "problems='" + problems + '\'' +
                "dni='" + this.getDni() + '\'' +
                ",name='" + this.getName() + '\'' +
                ",phone='" + this.getPhone() + '\'' +
                ",salary=" + this.getSalary() +
                ",position='" + this.getPosition() + '\'' +
                '}';
    }
}
