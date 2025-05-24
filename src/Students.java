public class Students {
    private int rollno;
    private String name;
    private String address;

    public Students(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Enrollment number: " + rollno + "\nName: " + name + "\nAddress: " + address;
    }
}