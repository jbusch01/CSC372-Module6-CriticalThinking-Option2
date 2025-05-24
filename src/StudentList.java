import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(5, "Alice Smith", "123 Main Street"));
        students.add(new Student(2, "Bob Jones", "253 Sparrow Way"));
        students.add(new Student(10, "Jon Forest", "789 Pine Street"));
        students.add(new Student(7, "Sarah McConner", "258 Water Way"));
        students.add(new Student(1, "Bethany Dewmont", "846 Wrong Way"));
        students.add(new Student(9, "Jacob Craft", "985 Malibu Court"));
        students.add(new Student(4, "Heather Houghes", "265 McCarthur Drive"));
        students.add(new Student(3, "Alex Menez", "946 Ocean Avenue"));
        students.add(new Student(6, "Jeremy Smith", "826 Starlight Lane"));
        students.add(new Student(8, "Allen Woody", "135 Your Moms Street"));

        System.out.println("Before Sorting:");
        for (Student s : students) {
            System.out.println(s + "\n");
        }

        MergeSort.mergeSort(students, new RollNoComparator());

        System.out.println("After sorting by roll number:");
        for (Student s : students) {
            System.out.println(s + "\n");
        }
    }
}