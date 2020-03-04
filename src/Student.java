public class Student extends Person{
    private Section[] sections = new Section[10];
    private int sectionCount = 0;
    private int grade;
    public Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }




    public void addStudent(Section s) {
        sections[sectionCount] = s;
        sectionCount++;
    }

    @Override
    public String toString() {
        return name + " is in " + getGrade() + " grade and is enrolled in the following sections " + getSections() ;
    }

    public String getSections() {
        String o = "";

        for(int i = 0; i < sectionCount; i++) {
            o += sections[i].getName() + " (" + sections[i].getCurrentSize() + ") ";
        }

        return o;
    }
}
