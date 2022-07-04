package course;

public class CourseApp {

    public static void main(String[] args) {
        // Declaring a temporary array to hold the result of getStudents (which is a String array)
        String[] temp;
        // Create a new course object
        Course course1 = new Course("Multimedia Design");
        
        // Adding students to the course
        course1.addStudent("Ali");
        course1.addStudent("Abu");
        course1.addStudent("Ahmad");
        
        // Displaying course information
        System.out.println(course1.getCourseName());
        System.out.println("Number of Students: " + course1.getNumberOfStudents());
        
        // temp receives the result of getStudents (which is a String array)
        temp = course1.getStudents();
        /* for loop to print each of the elements in the array
        for(int i = 0; i < temp.length; i++) {
            if(!(temp[i] == null)) {
                System.out.println(temp[i]);
            }
        }
        */
        // for-each loop to print each of the elements in the array
        for(String t: temp) {
            if(!(t == null)) {
                System.out.println(t);
            }
        }
        
        // Dropping student from the course
        course1.dropStudent("Abu");
        System.out.println("We are dropping student(s) from the course.");
        System.out.println("Number of Students: " + course1.getNumberOfStudents());
        temp = course1.getStudents();
        for(String t: temp) {
            // Only prints element that is not null
            if(!(t == null)) {
                System.out.println(t);
            }
        }
    }
    
}
