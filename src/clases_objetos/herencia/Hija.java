package clases_objetos.herencia;

public class Hija extends Madre {

    private String phone;

    public Hija(String sofia){
        super();
        this.phone = "";
    }
    public Hija(String name,String lastName,int age,String phone){
        super(name,lastName,age);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Hija{" +
                "name='" + this.getName() + '\'' +
                ", lastName='" + this.getLastName() + '\'' +
                ", age=" + this.getAge() +'\'' +
                ", phone=" + this.getPhone() +
                '}';
    }
}
