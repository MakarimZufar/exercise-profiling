package com.advpro.profiling.tutorial.service;

import com.advpro.profiling.tutorial.model.Student;
import com.advpro.profiling.tutorial.model.StudentCourse;
import com.advpro.profiling.tutorial.repository.StudentCourseRepository;
import com.advpro.profiling.tutorial.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author muhammad.khadafi
 */
@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final StudentCourseRepository studentCourseRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository, StudentCourseRepository studentCourseRepository) {
        this.studentRepository = studentRepository;
        this.studentCourseRepository = studentCourseRepository;
    }

    // Optimasi: Menggunakan Map untuk mengelompokkan StudentCourse berdasarkan studentId
    public List<StudentCourse> getAllStudentsWithCourses() {
        List<Student> students = studentRepository.findAll();
        List<StudentCourse> allStudentCourses = studentCourseRepository.findAll();

        // Menggunakan Map untuk mempercepat pencarian
        Map<Long, List<StudentCourse>> studentCourseMap = allStudentCourses.stream()
                .collect(Collectors.groupingBy(sc -> sc.getStudent().getId()));

        List<StudentCourse> studentCourses = new ArrayList<>();
        for (Student student : students) {
            List<StudentCourse> studentCoursesByStudent = studentCourseMap.getOrDefault(student.getId(), new ArrayList<>());
            for (StudentCourse studentCourseByStudent : studentCoursesByStudent) {
                StudentCourse studentCourse = new StudentCourse();
                studentCourse.setStudent(student);
                studentCourse.setCourse(studentCourseByStudent.getCourse());
                studentCourses.add(studentCourse);
            }
        }
        return studentCourses;
    }

    // Optimasi: Menggunakan stream().max() agar lebih ringkas dan efisien
    public Optional<Student> findStudentWithHighestGpa() {
        return studentRepository.findAll().stream()
                .max(Comparator.comparingDouble(Student::getGpa));
    }

    // Optimasi: Menggunakan String.join() untuk performa lebih baik daripada concatenation dalam loop
    public String joinStudentNames() {
        return studentRepository.findAll().stream()
                .map(Student::getName)
                .collect(Collectors.joining(", "));
    }
}
