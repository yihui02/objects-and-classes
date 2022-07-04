package course;

public class Course {
    private String courseName;
    private String[] students = new String[50];
    private int numberOfStudents = 0;
    
    Course() {
        this("Object-Oriented Programming");
    }
    
    Course(String courseName) {
        this.courseName = courseName;
    }
    
    public String getCourseName() {
        return this.courseName;
    }
    
    public String[] getStudents() {
        return this.students;
    }
    
    public int getNumberOfStudents() {
        return this.numberOfStudents;
    }
    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }
    
    public void dropStudent(String student) {
        // Create a temporary index number and array that will potentially overwrite the array students
        int tempIndex = 0;
        String[] tempArray = new String[50];
        
        boolean dropSuccess = false;
        
        // Traversing the array students
        for(String s: students) {
            if(s != null && s.equals(student)) { // if the element is not null and equals to the student that we are dropping
                // Decrease the total number of students in the course
                numberOfStudents--;
                dropSuccess = true;
            } else { // if the element is null or not equals to the student that we are dropping
                // Put it in the temporary array
                tempArray[tempIndex] = s;
                tempIndex++;
            }
        }
        
        // Overwrite the student array with the temporary array if a student is successfully dropped
        if(dropSuccess) {
            students = tempArray;
        }
    }   
}
