package exercises.HierarchyPerson;

public class Person {

    private String name;
    private String address;

    public Person(String address) {
        setAddress(address);
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ", address=" + address + "]";
    }
}
