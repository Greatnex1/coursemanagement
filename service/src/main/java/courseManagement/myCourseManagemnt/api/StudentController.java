package courseManagement.myCourseManagemnt.api;

import courseManagement.myCourseManagement.models.study.Course;
import courseManagement.myCourseManagement.models.user.Student;
import courseManagement.myCourseManagemnt.user.student.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "v1")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }


    @GetMapping("/students")
    public List<Student> listStudent() {
        return studentService.viewStudents();
    }

    @GetMapping("/courses")
    public List<Course> listCourse() {
        return studentService.viewCourse();
    }


    @PostMapping("/register")
    public void addStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }


}
