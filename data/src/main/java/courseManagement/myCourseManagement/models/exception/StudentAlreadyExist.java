package courseManagement.myCourseManagement.models.exception;

public class StudentAlreadyExist    extends RuntimeException {

    public StudentAlreadyExist(String message) {
        super(message);
    }
}
