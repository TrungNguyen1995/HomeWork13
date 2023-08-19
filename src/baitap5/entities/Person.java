package baitap5.entities;

public class Person {
    public static int autoId;

    private int id;
    private String name;
    private int phonenumber;
    private String address;

    public Person(String name, int phonenumber, String address) {
        this.id = ++autoId;
        this.name = name;
        this.phonenumber = phonenumber;
        this.address = address;
    }

    public static int getAutoId() {
        return autoId;
    }

    public static void setAutoId(int autoId) {
        Person.autoId = autoId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phonenumber=" + phonenumber +
                ", address='" + address + '\'' +
                '}';
    }
}
