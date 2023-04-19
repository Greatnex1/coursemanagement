package courseManagement.myCourseManagement.models.user;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Role {

    private Long id;


    public Role(String name) {
        this.name = name;
    }

    private String name;
}
