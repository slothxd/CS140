package CourseGrades;

/**
Driver Program.
*/
public class CourseGradesDemo
{
public static void main(String[] args)
{

GradedActivity lab = new GradedActivity();

lab.setScore(85);


PassFailExam pfexam = new PassFailExam(20, 3, 70);

Essay essay = new Essay();

essay.setScore(25, 18, 17, 20);


FinalExam finalExam = new FinalExam(50, 10);


CourseGrades course = new CourseGrades();
course.setLab(lab);
course.setPassFailExam(pfexam);
course.setEssay(essay);
course.setFinalExam(finalExam);


System.out.println(course);


System.out.println("Average score: " + course.getAverage());


GradedActivity highItem = course.getHighest();
System.out.println("Highest score: " + highItem.getScore());

GradedActivity lowItem = course.getLowest();
System.out.println("Lowest score: " + lowItem.getScore());
}
}

