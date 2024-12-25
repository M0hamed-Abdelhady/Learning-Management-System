package fci.swe.advanced_software.services.assessments.assessment;

import fci.swe.advanced_software.dtos.Response;
import fci.swe.advanced_software.dtos.assessments.QuestionAssessmentDto;
import fci.swe.advanced_software.dtos.assessments.assessment.AssessmentDto;
import fci.swe.advanced_software.models.assessments.AssessmentType;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IAssessmentService {
    ResponseEntity<Response> getAllAssessments(String course_id, AssessmentType type, Integer page, Integer size);

    ResponseEntity<?> createAssessment(String courseId, AssessmentType assessmentType, AssessmentDto requestDto);

    ResponseEntity<?> updateAssessment(String id, AssessmentType type, AssessmentDto requestDto);

    ResponseEntity<?> getAssessment(String id);

    ResponseEntity<?> deleteAssessment(String id);

    ResponseEntity<?> addQuestionsToAssessment(String assessmentId, List<QuestionAssessmentDto> questionAssessmentDtos);

    ResponseEntity<?> removeQuestionFromAssessment(String assessmentId, String questionId);

    ResponseEntity<?> getAssessmentQuestions(String assessmentId, Integer page, Integer size);

    ResponseEntity<?> getAssessmentQuestionsForStudent(String assessmentId, AssessmentType assessmentType, Integer page, Integer size);
}


