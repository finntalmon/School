public class Teacher extends Person{
    private Section[] sections = new Section[10];
    private int sectionCount;
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Section[] getSections() {
        return sections;
    }

    public void addTeacher(Section s) {
        sections[sectionCount] = s;
        sectionCount++;
    }


    @Override
    public String toString() {
        String o = "";

        for(int i = 0; i < sectionCount; i++) {
            o += sections[i].getName() + " " + sections[i].getCurrentSize();
        }

        return getName() + " teaches the following sections: " + o + sectionCount;
    }
}
