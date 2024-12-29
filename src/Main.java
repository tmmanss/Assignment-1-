import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        School hogwarts = new School();

        File studentFile = new File("C:\\Users\\mansu\\Downloads\\students.txt");
        Scanner studentScanner = new Scanner(studentFile);

        File teacherFile = new File("C:\\Users\\mansu\\Downloads\\teachers.txt");
        Scanner teacherScanner = new Scanner(teacherFile);
        while (studentScanner.hasNextLine()) {
            String line = studentScanner.nextLine().trim();
            if (line.isEmpty()) continue;

            Scanner lineScanner = new Scanner(line);
            String name = lineScanner.next();
            String surname = lineScanner.next();
            int age = lineScanner.nextInt();
            boolean gender = lineScanner.next().equalsIgnoreCase("Male");

            ArrayList<Integer> grades = new ArrayList<>();
            while (lineScanner.hasNextInt()) {
                grades.add(lineScanner.nextInt());
            }

            Student student = new Student(name, surname, grades);
            student.setAge(age);
            student.setGender(gender);
            hogwarts.addMember(student);

            lineScanner.close();
        }
        studentScanner.close();

        while (teacherScanner.hasNextLine()) {
            String line = teacherScanner.nextLine().trim();
            if (line.isEmpty()) continue;
            Scanner lineScanner = new Scanner(line);
            String name = lineScanner.next();
            String surname = lineScanner.next();
            int age = lineScanner.nextInt();
            boolean gender = lineScanner.next().equalsIgnoreCase("Male");
            String subject = lineScanner.next();
            int yearsOfExperience = lineScanner.nextInt();
            int salary = lineScanner.nextInt();

            Teacher teacher = new Teacher(name, surname, subject, yearsOfExperience, salary);
            teacher.setAge(age);
            teacher.setGender(gender);
            hogwarts.addMember(teacher);

            lineScanner.close();
        }
        teacherScanner.close();

        hogwarts.getMembers().sort((p1, p2) -> p1.getSurname().compareToIgnoreCase(p2.getSurname()));

        System.out.println("School Members (Sorted by Surname):");
        for (Person member : hogwarts.getMembers()) {
            System.out.println(member);
        }

    }
}