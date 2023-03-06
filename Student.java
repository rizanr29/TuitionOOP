public class Student{
    private String StudentName;
    private String StudentIC;
    private String StudentAddress;
    private int StudentYear;
    private String StudentSchoolName;
    private int StudentScore;
    
    
    public Student(String name, String ic, String address, int year, String schoolname, int score){
        StudentName = name;
        StudentIC = ic;
        StudentAddress = address;
        StudentYear = year;
        StudentSchoolName = schoolname;
        StudentScore = score;
    }
    
    public String StudentgetName(){
        return StudentName;
    }
    
    public String StudentgetIC(){
        return StudentIC;
    }
    
    public String StudentgetAddress(){
        return StudentAddress;
    }
    
    public int StudentgetYear(){
        return StudentYear;
    }
    
    public String StudentgetSchoolName(){
        return StudentSchoolName;
    }
    
    public int StudentgetScore(){
        return StudentScore;
    }
}