package fci.swe.advanced_software.repositories.course;

import fci.swe.advanced_software.models.courses.Course;
import fci.swe.advanced_software.models.courses.Enrollment;
import fci.swe.advanced_software.models.users.Student;
import fci.swe.advanced_software.repositories.AbstractEntityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EnrollmentRepository extends AbstractEntityRepository<Enrollment> {
    Page<Enrollment> findAllByStudent(Student student, Pageable pageable);

    Page<Enrollment> findAllByCourseId(String courseId, Pageable pageable);

    Enrollment findByStudentIdAndCourseId(String studentId, String courseId);

    List<Enrollment> findAllByCourseId(String courseId);

    Enrollment findByStudentAndCourse(Student student, Course course);

    boolean existsByStudentIdAndCourseId(String studentId, String courseId);

    long countByCourseId(String courseId);
}
