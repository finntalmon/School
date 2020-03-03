public class Section {
    private Teacher teacher;
    private Student[] students = new Student[50];
    private String name;
    private int currentSize = 0;

    public Section(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void addStudent(Student s){
        students[currentSize] = s;
        currentSize++;
    }
    public int getCurrentSize() {
        return currentSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return name + " is taught by " + getTeacher() + " and has " + currentSize +  " students: " + getSections();
    }

    public String getSections() {
        String o = "";

        for(int i = 0; i < currentSize; i++) {
            o += students[i].getName() + ", ";
        }

        return o;
    }

}
