package com.unmsm.backfisialumnocurso.dao.impl;

import com.unmsm.backfisialumnocurso.dao.StudentDao;
import com.unmsm.backfisialumnocurso.model.dto.ScoreFromCourseDto;
import com.unmsm.backfisialumnocurso.model.dto.StudentDto;
import com.unmsm.backfisialumnocurso.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

import static com.unmsm.backfisialumnocurso.util.mapper.StudentMapper.*;

@RequiredArgsConstructor
@Component
public class StudentDaoImpl implements StudentDao {

  private final StudentRepository repository;

  @Override
  public StudentDto findScoresByCode(Long code) {
    List<ScoreFromCourseDto> scores = repository.findScores(code)
        .stream().map(buildScoreFromCourse)
        .collect(Collectors.toList());

    return buildStudentWithScores.apply(repository.findByCode(code), scores);
  }

  @Override
  public List<StudentDto> findAll() {
    return repository.findAll().stream()
        .map(buildStudent)
        .collect(Collectors.toList());
  }

}
