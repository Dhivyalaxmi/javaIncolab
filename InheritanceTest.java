// Single Inheritance Example
class College {
    void collegeName() {
        System.out.println("🏫 College: KGISL Institute of Technology");
    }
}

class Department extends College {
    void departmentName() {
        System.out.println("💻 Department: AI & DS");
    }
}

// Multilevel Inheritance Example
class Student extends Department {
    void studentDetails() {
        System.out.println("👤 Student: Dhivyalaxmi  S S");
        System.out.println("🎓 Year: 2nd Year");
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        // Single Inheritance Demo
        System.out.println("=== Single Inheritance ===");
        Department dept = new Department();
        dept.collegeName();
        dept.departmentName();

        // Multilevel Inheritance Demo
        System.out.println("\n=== Multilevel Inheritance ===");
        Student stud = new Student();
        stud.collegeName();      // from College
        stud.departmentName();   // from Department
        stud.studentDetails();   // from Student
    }
}
