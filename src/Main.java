public class Main {
    public static Student getTopStudent(Student[] arr) {
        Student top = null;
        double maxGpa = -1;
        for (Student s : arr) {
            if (s.getGpa() > maxGpa) {
                maxGpa = s.getGpa();
                top = s;
            }
        }
        return top;
    }

    public static int countHonors(Student[] arr) {
        int count = 0;
        for (Student s : arr) {
            if (s.isHonors()) count++;
        }
        return count;
    }

    public static int totalCredits(Student[] arr) {
        int total = 0;
        for (Student s : arr) {
            total += s.getCredits();
        }
        return total;
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Qailau Marat", "253696", "CS"),
                new Student("Palensgeev Tugenshe", "252496", "SE"),
                new Student("Maqsat Oral", "259685", "IT"),
                new Student("Tokashbek Kasym", "258536", "ITM"),
                new Student("Qaisar Medeu", "257593", "MT")
        };

        students[0].updateGPA(3.8); students[0].addCredits(15);
        students[1].updateGPA(3.2); students[1].addCredits(12);
        students[2].updateGPA(3.9); students[2].addCredits(18);
        students[3].updateGPA(4.0); students[3].addCredits(20);
        students[4].updateGPA(2.7); students[4].addCredits(10);

        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("Top GPA: " + getTopStudent(students));
        System.out.println("Honors count: " + countHonors(students));
        System.out.println("Total credits: " + totalCredits(students));

        Course courseObj = new Course("Java Programming", "Prof.Aidana", 5);
        for (int i = 0; i < 5; i++) {
            courseObj.addStudent(students[i], i);
        }
        System.out.println(courseObj);
        System.out.println("Top credits student: " + courseObj.highestCreditStudent());
    }
}
