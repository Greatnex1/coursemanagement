package courseManagement.myCourseManagemnt.user.student;

import courseManagement.myCourseManagement.models.study.Course;
import courseManagement.myCourseManagement.models.user.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentDao studentDao;

    public StudentService(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public void addNewStudent(Student student) {
        int result = studentDao.insertStudent(student);
        if (result != 1) {
            throw new IllegalStateException("oops something went wrong, student registration failed");
        }
    }

   public List<Course> viewCourse() {
        return studentDao.selectRegisteredCourse();
    }

    public List<Student> viewStudents() {
        return studentDao.registeredStudents();
    }
}
