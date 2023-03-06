public class Tutor {
    private String name;
    private String IC;
    private String address;
    private String qualification;
    private int yearsExperience;
    private String dateJoined;

    public Tutor(String name, String IC, String address, String qualification, int yearsExperience, String dateJoined) {
        this.name = name;
        this.IC = IC;
        this.address = address;
        this.qualification = qualification;
        this.yearsExperience = yearsExperience;
        this.dateJoined = dateJoined;
    }

    public String getTutorName() {
        return name;
    }

    public String getTutorIC() {
        return IC;
    }

    public String getTutorAddress() {
        return address;
    }

    public String getTutorQualification() {
        return qualification;
    }

    public int getTutorYearsExperience(){
        return yearsExperience;
    }
    
    public String getTutorDateJoined(){
        return dateJoined;
    }
}