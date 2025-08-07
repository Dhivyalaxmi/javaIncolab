public class Student {
    String name;
    int age;
    String course;

    void displayDetails() {
        System.out.println("📚 Student Name: " + name);
        System.out.println("🎂 Age: " + age);
        System.out.println("💻 Course: " + course);
    }

    public static void main(String[] args) {
        Student laddu = new Student();
        laddu.name = "Dhivya";
        laddu.age = 20;
        laddu.course = "AI & DS";

        laddu.displayDetails();
    }
}
