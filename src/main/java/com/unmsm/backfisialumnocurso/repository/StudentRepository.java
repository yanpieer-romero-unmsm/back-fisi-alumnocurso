package com.unmsm.backfisialumnocurso.repository;

import com.unmsm.backfisialumnocurso.model.entity.ScoreFromCourse;
import com.unmsm.backfisialumnocurso.model.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository {

  List<ScoreFromCourse> findScores(Long studentCode);

  List<Student> findAll();

  Student findByCode(Long code);

}