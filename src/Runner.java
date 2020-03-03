public class Runner {
    public static void main(String[] args ){
        School berkeleyHigh = new School( "Berkeley High");
        Section Math = new Section("Math");
        Section Biology  = new Section("Biology");
        Section ComputerScience = new Section("Computer Science");

        Teacher Albinson = new Teacher("Albinson", "ComputerScience");
        Teacher Albrecht = new Teacher("Albrecht", "Math");
        Teacher Bearg = new Teacher("Bearg", "Biology");

        Student Finn = new Student("Finn", 11);
        Student Humble = new Student("Humble", 11);
        Student Anna = new Student("Anna", 11);
        Student Lyndon = new Student("Lydon", 11);
        Student Afraz = new Student("Afraz", 11);
        Student Zephyr = new Student("Zephyr", 11);
        Student Keenan = new Student("Keenan", 2);

        berkeleyHigh.addSection(Math);
        berkeleyHigh.addSection(Biology);
        berkeleyHigh.addSection(ComputerScience);

        Math.setTeacher(Albrecht);
        ComputerScience.setTeacher(Albinson);
        Biology.setTeacher(Bearg);

        Albinson.addTeacher(ComputerScience);
        Albinson.addTeacher(Math);
        Bearg.addTeacher(Biology);

        ComputerScience.addStudent(Finn);
        Biology.addStudent(Humble);
        Biology.addStudent(Anna);
        ComputerScience.addStudent(Lyndon);
        Math.addStudent(Afraz);
        Math.addStudent(Zephyr);
        Finn.addStudent(ComputerScience);
        Humble.addStudent(Biology);
        Anna.addStudent(Biology);
        Lyndon.addStudent(ComputerScience);
        Afraz.addStudent(Math);
        Zephyr.addStudent(Math);

        ComputerScience.addStudent(Keenan);

        System.out.println(berkeleyHigh.toString());
        System.out.println(ComputerScience.toString());
        System.out.println(Biology.toString());
        System.out.println(Math.toString());
        System.out.println(Albinson.toString());
        System.out.println(Albrecht.toString());
        System.out.println(Bearg.toString());
        System.out.println(Finn.toString());
        System.out.println(Humble.toString());
        System.out.println(Anna.toString());
        System.out.println(Lyndon.toString());
        System.out.println(Afraz.toString());
        System.out.println(Zephyr.toString());
        System.out.println(Keenan.toString());

    }
}
