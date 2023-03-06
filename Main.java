public class Main
{
	public static void main(String[] args) {
		Student mike = new Student("michael","010529125275","sabah",3,"SMK MADAI",45);
		mike.StudentgetName();
		mike.StudentgetIC();
		mike.StudentgetAddress();
		mike.StudentgetYear();
		mike.StudentgetSchoolName();
		mike.StudentgetScore();
		
		Student ilman = new Student("ilman","010729128475","Pulau Pinang",2,"SMK Penang",84);
		ilman.StudentgetName();
		ilman.StudentgetIC();
		ilman.StudentgetAddress();
		ilman.StudentgetYear();
		ilman.StudentgetSchoolName();
		ilman.StudentgetScore();
		
		Tutor zach = new Tutor("zach","010119125200","Sabah","Degree",35,"23/05/2020");
		zach.getTutorName();
		zach.getTutorIC();
		zach.getTutorAddress();
		zach.getTutorQualification();
		zach.getTutorYearsExperience();
		zach.getTutorDateJoined();
		
		Tutor rizal = new Tutor("rizal","010112325200","perlis","Degree",65,"12/09/2020");
		rizal.getTutorName();
		rizal.getTutorIC();
		rizal.getTutorAddress();
		rizal.getTutorQualification();
		rizal.getTutorYearsExperience();
		rizal.getTutorDateJoined();
		
		HeadMaster lim = new HeadMaster("Jeremy Lim","010623045324","Selangor");
		lim.getMasterName();
		lim.getMasterIC();
		lim.getMasterAddress();
		
		TuitionCenter t = new TuitionCenter("Tuition Indah","Selangor",lim);
		t.getName();
		t.getAddress();
		t.getHeadMaster();
		t.addTutor(zach);
		t.addTutor(rizal);
		t.removeTutor(rizal);
		t.addStudent(mike);
		t.addStudent(ilman);
		t.removeStudent(ilman);
		System.out.println(t.getNumTutors());
		System.out.println(t.getNumStudents());
		System.out.println(t.getAverageMarks());
		System.out.println(t.getMinMarks());
		System.out.println(t.getMaxMarks());
		System.out.println(t.getTutorsBackground());
		
		
	}
}