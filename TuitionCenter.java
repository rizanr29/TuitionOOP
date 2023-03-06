import java.util.ArrayList;
import java.util.List;

public class TuitionCenter {
    private String name;
    private String address;
    private HeadMaster headMaster;
    private List<Tutor> tutors;
    private List<Student> students;

    public TuitionCenter(String name, String address, HeadMaster headMaster) {
        this.name = name;
        this.address = address;
        this.headMaster = headMaster;
        this.tutors = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public HeadMaster getHeadMaster() {
        return headMaster;
    }

    public List<Tutor> getTutors() {
        return tutors;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addTutor(Tutor tutor) {
        tutors.add(tutor);
    }

    public void removeTutor(Tutor tutor) {
        tutors.remove(tutor);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public int getNumTutors() {
        return tutors.size();
    }

    public int getNumStudents() {
        return students.size();
    }

    public double getAverageMarks() {
        double total = 0;
        for (Student student : students) {
            total += student.StudentgetScore();
        }
        return total / students.size();
    }

    public double getMinMarks() {
        double min = Double.MAX_VALUE;
        for (Student student : students) {
            double avgScore = student.StudentgetScore();
            if (avgScore < min) {
                min = avgScore;
            }
        }
        return min;
    }

    public double getMaxMarks() {
        double max = Double.MIN_VALUE;
        for (Student student : students) {
            double avgScore = student.StudentgetScore();
            if (avgScore > max) {
                max = avgScore;
            }
        }
        return max;
    }

    public List<String> getTutorsBackground() {
        List<String> backgrounds = new ArrayList<>();
        for (Tutor tutor : tutors) {
            backgrounds.add(tutor.getTutorQualification() + ", " + tutor.getTutorYearsExperience() + " years of experience");
        }
        return backgrounds;
    }
}