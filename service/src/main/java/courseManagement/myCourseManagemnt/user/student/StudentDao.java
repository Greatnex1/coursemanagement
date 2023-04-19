package courseManagement.myCourseManagemnt.user.student;

import courseManagement.myCourseManagement.models.study.Course;
import courseManagement.myCourseManagement.models.user.Student;

import java.util.List;

public interface StudentDao {
    List<Course> selectRegisteredCourse();

    int insertStudent(Student student);

    int deleteCourse(int id);

    List<Student> registeredStudents();


}
