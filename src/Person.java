public class Person {
    String firstName;
    String lastName;
    int age;
    String address;
    int mobileNo;

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", mobileNo=" + mobileNo +
                '}';
    }

    public Person(String firstName, String lastName, int age, String address, int mobileNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.mobileNo = mobileNo;
    }
}
