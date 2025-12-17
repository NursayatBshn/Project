public class Course {
    private String courseName;
    private String instructor;
    private Student[] students;

    public Course(String courseName, String instructor, int size) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.students = new Student[size];
    }

    public void addStudent(Student s, int index) {
        if (index >= 0 && index < students.length) {
            students[index] = s;
        }
    }

    public double courseAverageGPA() {
        double sum = 0;
        int count = 0;
        for (Student s : students) {
            if (s != null) {
                sum += s.getGpa();
                count++;
            }
        }
        return count > 0 ? sum / count : 0.0;
    }

    public Student highestCreditStudent() {
        Student top = null;
        int maxCredits = -1;
        for (Student s : students) {
            if (s != null && s.getGpa() > maxCredits) {
                maxCredits = s.getCredits();
                top = s;
            }
        }
        return top;
    }

    public String toString() {
        return "Course: " + courseName + " by " + instructor + ", Avg GPA: " + courseAverageGPA();
    }
}
