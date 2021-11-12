package com.unmsm.backfisialumnocurso.util.mapper;

import com.unmsm.backfisialumnocurso.model.dto.ScoreFromCourseDto;
import com.unmsm.backfisialumnocurso.model.dto.StudentDto;
import com.unmsm.backfisialumnocurso.model.entity.ScoreFromCourse;
import com.unmsm.backfisialumnocurso.model.entity.Student;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class StudentMapper {

  public static BiFunction<Student, List<ScoreFromCourseDto>, StudentDto> buildStudentWithScores =
      (student, listOfScoresByCourse) -> StudentDto.builder()
          .code(student.getCode())
          .name(student.getName())
          .lastName(student.getLastName())
          .listOfScoresByCourse(listOfScoresByCourse)
          .build();

  public static Function<ScoreFromCourse, ScoreFromCourseDto> buildScoreFromCourse = scoreFromCourse ->
      ScoreFromCourseDto.builder()
          .code(scoreFromCourse.getCode())
          .course(scoreFromCourse.getCourse())
          .score(scoreFromCourse.getScore())
          .build();

  public static Function<Student, StudentDto> buildStudent = student -> StudentDto.builder()
          .code(student.getCode())
          .name(student.getName())
          .lastName(student.getLastName())
          .build();
}
