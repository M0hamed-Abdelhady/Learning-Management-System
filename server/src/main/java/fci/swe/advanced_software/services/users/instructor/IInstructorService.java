package fci.swe.advanced_software.services.users.instructor;

import org.springframework.http.ResponseEntity;

public interface IInstructorService {
    ResponseEntity<?> getInstructor(String id);

    ResponseEntity<?> getAllInstructors(Integer page, Integer size);

    ResponseEntity<?> getCourses(Integer page, Integer size);
}
